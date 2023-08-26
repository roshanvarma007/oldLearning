
//Method overriding

class userR{
    void getlogin(){
        System.out.println("User Login");
    }
}
class EmpR extends userR{

    void getlogin() {
        System.out.println("Emp login");
    }
    void logout(){
        System.out.println("user logout");
    }
}

public class MethodOverriding {
    public static void main(String[] args) {
EmpR e1 = new EmpR();
e1.getlogin();
e1.logout();
    }
}
