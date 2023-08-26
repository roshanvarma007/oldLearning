
class Parent{
    String name = "Radhe Shyam";
    void getData(){
        System.out.println(this.name);

    }
}
class Child extends Parent{

}

public class InhertenceExample1OOP {
    public static void main(String[] args) {
        Child c1 = new Child();
        c1.getData();

    }
}
