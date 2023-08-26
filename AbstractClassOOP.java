
abstract class Andriod{
    void goodFeature(){
        System.out.println("Andriod OS provides lot's of good feture");
    }
   abstract void makeYourUI();
}
class anySmartPhone extends Andriod{
      void makeYourUI() {
          System.out.println("Smartphone copmany has own UI");

    }
}



public class AbstractClassOOP {
    public static void main(String[] args) {
        anySmartPhone a1 = new anySmartPhone();
        a1.makeYourUI();
        a1.goodFeature();
    }
}
