
//super keyword chield class ke ander use hota hai
//
class Animals{
    Animals(){
        System.out.println("Cat is a animal");
    }
    int age = 5;
    void sleepy(){
        System.out.println("Animal is sleeping");
    }

}
class cat extends Animals{
    cat(){
        super();
    }
void doNothing(){
    super.sleepy();
    System.out.println("Animal age : " + super.age);
    System.out.println("doNothing");
}
}
public class SuperKeywordRepete {
    public static void main(String[] args) {
        cat c1 = new cat();

        c1.doNothing();
    }
}
