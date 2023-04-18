package kimch;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class J33JDBC {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // 일단 인터페이스를 구현하게 되면 클래스멤버로 메서드를 호출할 수 없다.
        // 즉 인스턴스로 복제해서 사용해야 한다.
        // 불필요한 복제를 막기 위해 singleton 패턴을 이용해서 단일 객체로 만드는 것이 좋다.
        // EMPDAOimpl empdao = new EMPDAOimpl();
        EMPDAO empdao = EMPDAOimpl.getInstance();

        EMPVO emp = new EMPVO(207, "steven","jobs","apple@app.com","515.123.8080","2002-06-07 00:00:00.000","AC_MGR",12008,0.2,101,110);



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
        String fmt = "%d %s %s %s %s %s %s %d %.2f %d %d";
        return String.format(fmt, empno, fname, lname, email,
                phone, hdate, jobid, sal, comm, mgrid, deptno);
    }
}

    interface EMPDAO {
        int insertEmp(EMPVO emp);
        List<EMPVO> selectEmp();
        EMPVO selectOneEmp(int empno);
        int updateEmp(EMPVO emp);
        int deleteEmp(int empno);
    }


    class EMPDAOimpl implements EMPDAO {
        private static String insertEmpSQL = " insert into EMPLOYEES values (?,?,?,?,?, ?,?,?,?,?, ?) ";
        private static String selectEmpSQL =
                " select EMPLOYEE_ID, FIRST_NAME, EMAIL, JOB_ID, DEPARTMENT_ID " +
                        " from EMPLOYEES order by EMPLOYEE_ID ";
        private static String selectOneEmpSQL = " select * from EMPLOYEES where EMPLOYEE_ID = ? ";
        private static String updateEmpSQL = "update EMPLOYEES set FIRST_NAME = ?, LAST_NAME = ?, EMAIL = ? , PHONE_NUMBER = ?WHERE EMPLOYEE_ID = ?";
        private static String deleteEmpSQL = " delete from EMPLOYEES where EMPLOYEE_ID = ? ";

        // singlton을 위한 변수
        private static EMPDAO instance = null;

        // 생성자로 인스턴스를 만드는 것을 금지한다.
        private EMPDAOimpl() {
        }

        public static EMPDAO getInstance() {
            // 객체를 한번만 만들도록 안배하는 것! 이제 getInstance메서드를 통해서만 EMPDAOimpl의 인스턴스를 만들 수 있다.
            if(instance == null) {
                instance = new EMPDAOimpl();
            }
            return instance;
        }

        public int insertEmp(EMPVO emp) {
            Connection conn = null;
            PreparedStatement pstmt = null;
            int cnt = 0;

            try {
                conn = J34JDBCUtil.makeConn();
                pstmt = conn.prepareStatement(insertEmpSQL);
                pstmt.setInt(1, emp.getEmpno());
                pstmt.setString(2, emp.getFname());
                pstmt.setString(3, emp.getLname());
                pstmt.setString(4, emp.getEmail());
                pstmt.setString(5, emp.getPhone());
                pstmt.setString(6, emp.getHdate());
                pstmt.setString(7, emp.getJobid());
                pstmt.setInt(8, emp.getSal());
                pstmt.setDouble(9, emp.getComm());
                pstmt.setInt(10, emp.getMgrid());
                pstmt.setInt(11, emp.getDeptno());

                cnt = pstmt.executeUpdate();

            } catch (Exception ex) {
                System.out.println("insertEmp에서 오류발생!!");
                System.out.println(ex.getMessage());
            } finally {
                J34JDBCUtil.closeConn(null, pstmt, conn);
            }

            return cnt;
        }

        public List<EMPVO> selectEmp() {
            Connection conn = null;
            PreparedStatement pstmt = null;
            ResultSet rs = null;
            List<EMPVO> empdata = new ArrayList<>();

            try {
                conn = J34JDBCUtil.makeConn();
                pstmt = conn.prepareStatement(selectEmpSQL);
                rs = pstmt.executeQuery();

                while (rs.next()) {
                    EMPVO emp = new EMPVO(
                            rs.getInt(1), rs.getString(2),
                            "", rs.getString(3), "", "",
                            rs.getString(4), 0, 0.0, 0,
                            rs.getInt(5));
                    empdata.add(emp);
                }
            } catch (Exception ex) {
                System.out.println("selectEmp에서 오류발생!!");
                System.out.println(ex.getMessage());
            } finally {
                J34JDBCUtil.closeConn(rs, pstmt, conn);
            }

            return empdata;
        }

        public EMPVO selectOneEmp(int empno) {
            Connection conn = null;
            PreparedStatement pstmt = null;
            ResultSet rs = null;
            EMPVO emp = null;

            try {
                conn = J34JDBCUtil.makeConn();
                pstmt = conn.prepareStatement(selectOneEmpSQL);
                pstmt.setInt(1, empno);

                rs = pstmt.executeQuery();

                if (rs.next()) {
                    emp = new EMPVO(rs.getInt(1), rs.getString(2),
                            rs.getString(3), rs.getString(4),
                            rs.getString(5), rs.getString(6),
                            rs.getString(7), rs.getInt(8),
                            rs.getDouble(9), rs.getInt(10),
                            rs.getInt(11));
                }

            } catch (Exception ex) {
                System.out.println("selectOneEmp에서 오류발생!!");
                System.out.println(ex.getMessage());
            } finally {
                J34JDBCUtil.closeConn(rs, pstmt, conn);
            }

            return emp;
        }
        
        public int updateEmp(EMPVO emp) {
            int cnt = 0;
            Connection conn = null;
            PreparedStatement pstmt = null;
            try{
                conn = J34JDBCUtil.makeConn();
                pstmt = conn.prepareStatement(updateEmpSQL);
                pstmt.setString(1,emp.getFname());
                pstmt.setString(2, emp.getLname());
                pstmt.setString(3,emp.getEmail());
                pstmt.setString(4,emp.getPhone());
                pstmt.setInt(5,emp.getEmpno());
                cnt = pstmt.executeUpdate();
            } catch(SQLException e) {
                System.out.println("updateEmp에서 문제 발생!");
                System.out.println(e.getMessage());
            } finally {
                J34JDBCUtil.closeConn(null,pstmt,conn);
            }
            return cnt;
        }
        public int deleteEmp(int empno) {
            Connection conn = null;
            PreparedStatement pstmt = null;
            int cnt = 0;

            try {
                conn = J34JDBCUtil.makeConn();
                pstmt = conn.prepareStatement(deleteEmpSQL);
                pstmt.setInt(1, empno);

                cnt = pstmt.executeUpdate();
            } catch (Exception ex) {
                System.out.println("deleteEmp에서 오류발생!!");
                System.out.println(ex.getMessage());
            } finally {
                J34JDBCUtil.closeConn(null, pstmt, conn);
            }

            return cnt;
        }
    }