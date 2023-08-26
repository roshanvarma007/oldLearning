
class  Students{
    String name;
    int age;

    //thois types is called polymorphisim same function ko baar baar alag alag information ko print karna
    public void printInfoo(String name){
        System.out.println(name);
    }
    public void printInfoo(int age){
        System.out.println(age);
    }
    public void printInfoo(String name, int age){

        System.out.println(name + " " + age);
    }
}



public class OopPolymorphisam {
    public static void main(String[] args) {
        Students s1 = new Students();
        s1.name = "Shayam";
        s1.age = 23;

        s1.printInfoo(s1.name,s1.age);
    }
}
