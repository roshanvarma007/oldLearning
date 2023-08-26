public class ObjectAndClass {
    public static void main(String[] args) {

        Employe emp1 = new Employe();
        System.out.println(emp1.name);

        String empName = emp1.getName();
        System.out.println(empName);
        emp1.printName();
    }
}

class Employe{

    String name = "Radhe Shyam";
    String getName(){
        return  this.name;
    }
    void  printName(){
        System.out.println(this.name);
    }
}