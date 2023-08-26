

class Shapes{
    public void area(){
        System.out.println("Display Area");
    }

}

//Single Level Inheritence
class Triangles extends Shapes{                                  //triangle - driveclass, extends - keyword , shapes - base class
    public void area (int l,int h){
        System.out.println(1/2*l*h);
    }
}

//Multi Level Inheritence
class EquilateralTriangle extends Triangles{
    public void area (int l,int h){
        System.out.println(1/2*l*h);
    }
}

//Hierachial Inheritance

class Circle extends Shapes{
    public void area (int r){
        System.out.println((3.14)*r*r);
    }
}

//Hybrid Inheritnce


public class OopINheritenceExamples {
    public static void main(String[] args) {

    }
}
