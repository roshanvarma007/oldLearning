

class  Collage{

  class Student{
  void getStudentDetails(){
         System.out.println("here is students details");
     }
    }
    void getDetails(){
        Student s1 = new Student();
        s1.getStudentDetails();
    }
}

public class NestedClassOOP {
    public static void main(String[] args) {
        Collage c1 = new Collage();
//        c1.getDetails();
    }
}
