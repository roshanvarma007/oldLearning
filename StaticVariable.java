
class  User{
//    String name = "Radhe Shaym";
//    static String city = "Vrindavan";

   static int counter = 0;
//it will save mb
    void getCounter() {
    counter++;
        System.out.println(counter);
    }
}



public class StaticVariable {
    //Its user for memory management,it is a stable
    public static void main(String[] args) {

        User user1 = new User();
        User user2 = new User();

        user1.getCounter();
        user2.getCounter();
    }

}
