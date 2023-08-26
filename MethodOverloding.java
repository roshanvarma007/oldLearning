//Create a class

class EmpIIGJ{

    //last part we are makeing constructor
    EmpIIGJ(){
        System.out.println("Constructor without argument");
    }

    EmpIIGJ(String data){
        System.out.println(data);
    }
    //make a method
    void  getName(){
        System.out.println("get name method without argument");
    }
    void getNmae(String name){
        System.out.println(name);
    }
    void getName(String fName, String lName){
        System.out.println(fName+lName);

        //Ye uper vala sara method overloding
    }
    //Ab niche method overriding
    void getAge(int age){
        System.out.println("int Age: " + age);
    }
    void getAge(String age){
        System.out.println("String age: " + age);
    }
}




public class MethodOverloding {
    public static void main(String[] args) {
        EmpIIGJ e1IIGJ = new EmpIIGJ("Rahul");
        //I i'll paas arg or not.to us hisab se vo class call hoga
        e1IIGJ.getName();
        e1IIGJ.getNmae("Krishna");
        e1IIGJ.getName("Radhe","Shyam");
        e1IIGJ.getAge(23);
    }
}
