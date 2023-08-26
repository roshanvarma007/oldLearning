import java.util.Scanner;

class Person {
   private String name;
    private int age;
  private   String gender;

  //Use setter and getter

  public String getName(){
      return name;
    }
    public void setName (String name){
      this.name = name;
    }
    public int getAge(){
      return age;
    }
    public void setAge(int age){
      this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

}
  class Student extends Person{
    private String studentID;
    private String grade;




     public String getStudentID() {
         return studentID;
     }

     public void setStudentID(String studentID) {
         this.studentID = studentID;
     }

     public String getGrade() {
         return grade;
     }

     public void setGrade(String grade) {
         this.grade = grade;
     }
 }


public class ChatGptProject1 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Entre the total number of Student");
        int totalStudent = scan.nextInt();
        Student [] students = new Student[totalStudent];
        for ( int i = 0;i<totalStudent; i++){
            System.out.println("Enter the total number of student" + (i+1) + ":");
            //first take data of student
            Student student = new Student();


            System.out.println("Name: ");
            student.setName(scan.nextLine());

            System.out.println("Age: ");
           student.setAge(scan.nextInt());


            System.out.println("Gender: ");
            student.setGrade(scan.nextLine());


            System.out.println("Student ID : ");
            student.setStudentID(scan.nextLine());

            System.out.println("Grade: ");
            student.setGrade(scan.nextLine());
            students[i] = student;
        }
        System.out.println("Student Details: ");
        for(Student student : students){
            System.out.println("Name: " + student.getName());
            System.out.println("Age: " + student.getAge());
            System.out.println("Gender: " + student.getGender());
            System.out.println("StudentID : " + student.getStudentID());
            System.out.println("Grade : " + student.getGrade());
        }
    }
}
