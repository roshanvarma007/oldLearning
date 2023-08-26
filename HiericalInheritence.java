
class Users{
    void getLogin(){
        System.out.println("User Logged In");
    }
}
class StudentUser extends Users{
   String name = "Arjun" ;
        void getMarks(){
            System.out.println("All Marks Printed");
           }


}
class TeacherUser extends Users{
   String name = "Krishna" ;
           void getSkils(){
               System.out.println("All skils printed");
           }
}

class Gaurds extends Users {

}


public class HiericalInheritence {
    public static void main(String[] args) {

        TeacherUser tu = new TeacherUser();
        StudentUser su = new StudentUser();
      Gaurds g1 = new Gaurds();
        tu.getLogin();
        su.getLogin();
        g1.getLogin();
    }
}
