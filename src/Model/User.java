//模型类
package Model;
//User模型
public class User {
    private String name;
    private String password;
    private int type;
    public User(String name, String password, int type){
        this.name = name;
        this.password = password;
        this.type = type;
    }
    public int getType(){
        return type;
    }
    public boolean isCorrect(String password){
        //System.out.println(this.password);
        //System.out.println(password);
        //if((this.password).equals(password))
        //    System.out.println("Correct");
        return this.password.equals(password);
    }
}
