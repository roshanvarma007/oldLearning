
interface driving{
    String name = "Toyota";
    void startEngines();
    void applyBreak();
}
//jo hum interface class me
// desifne kiya hai and usme hum body define nhi kar sakte.body ko
// hum chield class me desfoinr karna rahta hai
class car implements driving{

   public void startEngines() {
       System.out.println("Engine Started");
    }

    public void applyBreak() {
        System.out.println("Break Applied");
    }
    void changeGear(){
        System.out.println("Grear Chaned");
    }
}



public class Interface {
    public static void main(String[] args) {

        car c1 = new car();
        c1.startEngines();
        c1.applyBreak();
        c1.changeGear();
        System.out.println(c1.name);
    }
}
