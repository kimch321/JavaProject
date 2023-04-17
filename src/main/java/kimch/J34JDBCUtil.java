package kimch;

import java.sql.*;

public class J34JDBCUtil {
    private static String DRV = "oracle.jdbc.driver.OracleDriver";
    private static String URL = "jdbc:oracle:thin:@54.180.140.184:1521:XE";
    private static String USR = "bigdata";
    private static String PWD = "bigdata";

    // DB 접속 객체 생성
    public static Connection makeConn() {
        Connection conn = null;
        try{
            Class.forName(DRV);
            conn = DriverManager.getConnection(URL, USR, PWD);
        } catch(ClassNotFoundException e) {
            System.out.println("오라클 driver가 없습니다.");
        } catch(SQLException e){
            System.out.println("URL, USR, PWD를 확인하세요");
        }
        return conn;
    }

    // DB 접속 종료 메서드 생성
    public static void closeConn(ResultSet rs, PreparedStatement pstmt, Connection conn) {
        if( rs != null) try { rs.close(); } catch(Exception e) {}
        if( pstmt != null) try { pstmt.close(); } catch(Exception e) {}
        if( conn != null) try { conn.close(); } catch(Exception e) {}
    }






}
