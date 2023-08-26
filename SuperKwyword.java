class Animal{
    Animal(){
        System.out.println("Dog is our fav animal");
    }
   int age = 5;
    void sleep(){
        System.out.println("12 am we are sleeping");
    }
} //parents ka consturctor chield ke constuctor ke ander hi call hoga
//jab class ke ander parents ki property call karni ho to super keyword use karte hai
class Dog extends Animal{
    Dog(){
        super();
    }
void doSomething (){
    System.out.println("Do something");
    super.sleep();
    System.out.println(super.age);
}
}

public class SuperKwyword {
    public static void main(String[] args) {
        Dog d1 = new Dog();
        d1.doSomething();
    }
}
