package Question1;

public class GameAccount {

    private String username;
    private int age;

    public GameAccount(){}
    public GameAccount(String username, int age){

        this.username = username;
        this.age = age;
    }

    public String getUsername(){
        return username;
    }
    public int getAge(){
        return age;
    }

}
