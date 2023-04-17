package kimch;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class J33JDBC {
    public static void main(String[] args) {
    EMPVO emp = new EMPVO(207, "steven","jobs","apple@app.com","515.123.8080","2002-06-07 00:00:00.000","AC_MGR",12008,0.2,101,110);
    EMPDAO.insertEmp(emp);
        for(EMPVO e :EMPDAO.selectEmp()){
            System.out.println(e);
        }
    EMPVO selectedEMP = EMPDAO.selectOneEmp(100);
    System.out.println(selectedEMP);
    System.out.println(EMPDAO.deleteEmp(206));
    System.out.println(EMPDAO.updateEmp());
    }

}

class EMPVO {
    private int empno;
    private String fname;
    private String lname;
    private String email;
    private String phone;
    private String hdate;
    private String jobid;
    private int sal;
    private double comm;
    private int mgrid;
    private int deptno;

    public EMPVO() {
    }

    public EMPVO(int empno, String fname, String lname, String email, String phone, String hdate, String jobid, int sal, double comm, int mgrid, int deptno) {
        this.empno = empno;
        this.fname = fname;
        this.lname = lname;
        this.email = email;
        this.phone = phone;
        this.hdate = hdate;
        this.jobid = jobid;
        this.sal = sal;
        this.comm = comm;
        this.mgrid = mgrid;
        this.deptno = deptno;
    }

    public int getEmpno() {
        return empno;
    }

    public void setEmpno(int empno) {
        this.empno = empno;
    }

    public String getFname() {
        return fname;
    }

    public void setFname(String fname) {
        this.fname = fname;
    }

    public String getLname() {
        return lname;
    }

    public void setLname(String lname) {
        this.lname = lname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getHdate() {
        return hdate;
    }

    public void setHdate(String hdate) {
        this.hdate = hdate;
    }

    public String getJobid() {
        return jobid;
    }

    public void setJobid(String jobid) {
        this.jobid = jobid;
    }

    public int getSal() {
        return sal;
    }

    public void setSal(int sal) {
        this.sal = sal;
    }

    public double getComm() {
        return comm;
    }

    public void setComm(double comm) {
        this.comm = comm;
    }

    public int getMgrid() {
        return mgrid;
    }

    public void setMgrid(int mgrid) {
        this.mgrid = mgrid;
    }

    public int getDeptno() {
        return deptno;
    }

    public void setDeptno(int deptno) {
        this.deptno = deptno;
    }

    @Override
    public String toString() {
        return "EMPVO{" +
                "empno=" + empno +
                ", fname='" + fname + '\'' +
                ", lname='" + lname + '\'' +
                ", email='" + email + '\'' +
                ", phone='" + phone + '\'' +
                ", hdate='" + hdate + '\'' +
                ", jobid='" + jobid + '\'' +
                ", sal=" + sal +
                ", comm=" + comm +
                ", mgrid=" + mgrid +
                ", deptno=" + deptno +
                '}';
    }
}

class EMPDAO {
    public static Connection createConn() {
        String DRV = "oracle.jdbc.driver.OracleDriver";
        String URL = "jdbc:oracle:thin:@192.168.142.128:1521:XE";
        String USR = "hr";
        String PWD = "hr";

        Connection conn = null;
        try{
            Class.forName(DRV);
            conn = DriverManager.getConnection(URL, USR, PWD);
        } catch(ClassNotFoundException e) {
            System.out.println("드라이버를 찾을 수 없습니다.");
        } catch (SQLException e) {
            System.out.println("디비 접속주소나 아이디/비번을 확인하세요!!");
        }
        return conn;
    }


    private static void closeConn(ResultSet rs, PreparedStatement pstm, Connection conn){
        if(rs != null) try{ rs.close(); } catch(Exception ex){};
        if(pstm != null) try{ pstm.close(); } catch(Exception ex){}
        if(conn != null) try{ conn.close(); } catch(Exception ex){}
    }

    public static int insertEmp(EMPVO emp) {
        String insertSQL = "insert into EMPLOYEES (EMPLOYEE_ID, FIRST_NAME, LAST_NAME, EMAIL, PHONE_NUMBER, HIRE_DATE, JOB_ID, SALARY, COMMISSION_PCT, MANAGER_ID, DEPARTMENT_ID) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
        Connection conn = null;
        PreparedStatement pstm = null;


        try{
            conn = EMPDAO.createConn();
            pstm = conn.prepareStatement(insertSQL);
            pstm.setInt(1, emp.getEmpno());
            pstm.setString(2, emp.getFname());
            pstm.setString(3, emp.getLname());
            pstm.setString(4, emp.getEmail());
            pstm.setString(5, emp.getPhone());
            pstm.setString(6, emp.getHdate());
            pstm.setString(7, emp.getJobid());
            pstm.setInt(8, emp.getSal());
            pstm.setDouble(9, emp.getComm());
            pstm.setInt(10, emp.getMgrid());
            pstm.setInt(11, emp.getDeptno());

            int cnt = pstm.executeUpdate();
            System.out.println("여기!");
            System.out.println("데이터 입력 확인 : " + cnt);
        } catch(SQLException e){
            System.out.println("SQL문을 확인해주세요!");
            e.printStackTrace();
        } catch( NullPointerException e2){
            System.out.println(e2);
        } catch(IndexOutOfBoundsException e3){
            System.out.println(e3);
        }finally {

            EMPDAO.closeConn(null,pstm,conn);
        }
        return 0;
    }
    public static List<EMPVO> selectEmp() {
        String selectSQL = "select * from EMPLOYEES";
        Connection conn = null;
        PreparedStatement pstm = null;
        ResultSet rs = null;
        List<EMPVO> emplist= new ArrayList<>();
        try{
            conn = EMPDAO.createConn();
            pstm = conn.prepareStatement(selectSQL);
            rs = pstm.executeQuery();

            while(rs.next()) {
                EMPVO empData = new EMPVO(rs.getInt(1),
                        rs.getString(2), rs.getString(3),rs.getString(4),rs.getString(5),rs.getString(6),
                        rs.getString(7), rs.getInt(8),rs.getDouble(9),rs.getInt(10), rs.getInt(11));
                emplist.add(empData);
            }
        } catch(SQLException e){
            System.out.println("SQL문을 확인해주세요!");
            e.printStackTrace();
        } catch( NullPointerException e2){
            System.out.println(e2);
        } catch(IndexOutOfBoundsException e3){
            System.out.println(e3);
        }finally {
            EMPDAO.closeConn(rs,pstm,conn);
        }

        return emplist;
    }
    public static EMPVO selectOneEmp(int empno) {
        String selectSQL = "select * from EMPLOYEES where EMPLOYEE_ID = ?";
        Connection conn = null;
        PreparedStatement pstm = null;
        ResultSet rs = null;
        EMPVO selectedData = null;
        try{
            conn = EMPDAO.createConn();
            pstm = conn.prepareStatement(selectSQL);
            pstm.setInt(1,empno);
            rs = pstm.executeQuery();
            // rs.next()가 트루일때 뿐만 아니라. rs.next()를 실행시켜서 rs의 커서를 이동시킨 후에야 출력이 가능하다.
            if (rs.next()) {
                selectedData = new EMPVO(rs.getInt(1),
                rs.getString(2), rs.getString(3),rs.getString(4),rs.getString(5),rs.getString(6),
                rs.getString(7), rs.getInt(8),rs.getDouble(9),rs.getInt(10),
                rs.getInt(11));
            }
        }catch(SQLException e){
            System.out.println("SQL을 확인해 주세요!");
        } finally {
            EMPDAO.closeConn(rs,pstm,conn);
        }

        return selectedData;}
    public static int updateEmp() {
        int cnt = 0;
        String updateSql = "update EMPLOYEES SET FIRST_NAME = ?, LAST_NAME = ?, EMAIL = ? WHERE EMPLOYEE_ID = ?";
        Connection conn = null;
        PreparedStatement pstmt = null;

        Scanner sc = new Scanner(System.in);
        System.out.println("직원 아이디?");
        int empno = sc.nextInt();
        System.out.println("이름?");
        String fname = sc.next();
        System.out.println("성?");
        String lname = sc.next();
        System.out.println("이메일?");
        String email = sc.next();

        try{
            conn = createConn();
            pstmt = conn.prepareStatement(updateSql);
            pstmt.setInt(4,empno);
            pstmt.setString(1,fname);
            pstmt.setString(2,lname);
            pstmt.setString(3,email);
            cnt = pstmt.executeUpdate();

        } catch (SQLException e){
            System.out.println(e);
        } finally {
            closeConn(null,pstmt,conn);
        }

        return cnt;}
    public static int deleteEmp(int empno) {
        int cnt = 0;
        String deleteSQL = "delete from EMPLOYEES where EMPLOYEE_ID = ?";
        Connection conn = null;
        PreparedStatement pstmt = null;

        try{
            conn = createConn();
            pstmt = conn.prepareStatement(deleteSQL);
            pstmt.setInt(1,empno);
            cnt = pstmt.executeUpdate();
        } catch (SQLException e){
            System.out.println("SQL문을 확인해주세요");
        } finally {
            closeConn(null,pstmt,conn);
        }
        return cnt; }
}