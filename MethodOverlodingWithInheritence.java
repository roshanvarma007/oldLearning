class EasyUser{
    void getEasyLogin(int nameConut){
        System.out.println(108);
    }
}
class Easy extends EasyUser{

    void getEasyLogin(String prem) {
        System.out.println("Radhe krishna radhe");
    }
}


public class MethodOverlodingWithInheritence {
    public static void main(String[] args) {
      Easy es1 = new Easy();
      es1.getEasyLogin(20);
    }
}
