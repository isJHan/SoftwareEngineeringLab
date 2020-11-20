//控制类包
package Control;

import DAO.UserDAO;
import Model.User;

//登陆控制类
public class UserControl {
    //登录，被界面调用
    static int logIn(String name, String password) {
        //0为不存在
        //1为密码错误
        //2...为用户类型
        User user = UserDAO.select(name);//调用Java的SQL接口(DAO.UserDAO类)
        //不存在用户
        if(user == null) return 0;
        if(user.isCorrect(password)){
            return user.getType();
        }
        return 1;
    }
    public static void main(String[] args){
        //System.out.println(UserControl.logIn("adm", "123"));
        switch( UserControl.logIn("adm", "123")){
            case 2:{
                System.out.println(("2类型，学生"));
            }
        }
    }
}
