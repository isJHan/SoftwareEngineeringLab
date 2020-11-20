//数据库Java接口包
package DAO;
//User表接口
import java.sql.*;
import Model.User;
import DB.UserDBUtil;
public class UserDAO {
    //查询
    public static User select(String name) {
        Connection con = new UserDBUtil().getConnection();
        String sql = "select * from User_ where Name = ?";
        User user = null;
        try {
            PreparedStatement pstmt = con.prepareStatement(sql);
            pstmt.setString(1, "adm");
            ResultSet rs = pstmt.executeQuery();
            if(rs.next())
                user = new User(
                        rs.getString("Name"),
                        (rs.getString("Password")).trim(), //去除首尾空格，数据库会严格按照char长度存储
                        rs.getInt("Type")
                );
        } catch (Exception e) {

        }
        return user;

    }
    public static void main(String[] args){
        User user = UserDAO.select("adm");
        System.out.println(user.toString());
    }
}

