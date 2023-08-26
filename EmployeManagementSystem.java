import javax.lang.model.element.Name;
import java.util.Scanner;

class Fellow {
   private String name;
 private    int age;
   private String gender;
    private int saliry;
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }
    public int getSaliry() {
        return saliry;
    }

    public void setSaliry(int saliry) {

        this.saliry = saliry;
    }
}

class Employes extends Fellow {
    private int employeID;


    public int getEmployeID() {
        return employeID;
    }

    public void setEmployeID(int employeID) {
        this.employeID = employeID;
    }


}


public class EmployeManagementSystem {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Entre Total Number Of Employe");

        int totalEmploye = scan.nextInt();
        Employes [] employes = new Employes[totalEmploye];

                for (int i = 0; i<totalEmploye; i++){
                    System.out.println("Entre Total Number Of Employe" + (i+1) + ":");
                    Employes employe = new Employes();

                    System.out.println("Name :");
                    employe.setName(scan.nextLine());

                    System.out.println("Age: ");
                    employe.setAge(scan.nextInt());

                    System.out.println("Gender: ");
                    employe.setGender(scan.nextLine());

                    System.out.println("EmployeID: ");
                    employe.setEmployeID(scan.nextInt());

                    System.out.println("Sailry: ");
                    employe.setSaliry(scan.nextInt());

                    employes  [i] = employe;

                }
        System.out.println("Employe Details");
                for (Employes employe : employes){

                    System.out.println("Name: " + employe.getName());
                    System.out.println("Age: " + employe.getAge());
                    System.out.println("Gender: " + employe.getGender());
                    System.out.println("EmployeID: " + employe.getEmployeID());
                    System.out.println("Sailry: " + employe.getSaliry());
                }


    }
}
