
class Persons {

    static String name = "Raam";
    static class PersonsInner{
        void  getInnerDetails(){
            System.out.println(name);
        }
    }
}


public class StaticClassOOP {
    public static void main(String[] args) {
       Persons.PersonsInner pInner = new Persons.PersonsInner();
       pInner.getInnerDetails();
    }
}
