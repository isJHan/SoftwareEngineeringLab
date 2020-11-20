//连接数据库的包
package DB;

import java.sql.Connection;
import java.sql.DriverManager;
//连接数据库的User_表
//返回Connection
public class DBUtil {
    private static final String URL = "jdbc:sqlserver://localhost:1433;DatabaseName=TestDB";
    private static final String NAME = "sa";
    private static final String PASSWORD = "jiahan123";

    private Connection conn = null;


    public DBUtil() {
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            conn = DriverManager.getConnection(URL, NAME, PASSWORD);
            if(conn == null) System.out.println("null!!!");

        } catch (Exception e) {
            System.out.println(e.toString());
        }
    }
    public Connection getConnection(){
        return conn;
    }

    public static void main(String[] args){
        Connection con = (new DBUtil()).getConnection();
        if(con == null) System.out.println("null");
    }
}
