
class Human{
    Human(){
        System.out.println("Multiple Constructor Code");
    }
    Human(String name , int age){
        System.out.println("Radhe Radhe");
        System.out.println(age);
    }

}


public class MultipleConstructorOOP {
    public static void main(String[] args) {

        Human h1 = new Human();
        Human h2 = new Human("Radhe Radhe",30);

    }
}
