import java.util.Scanner;
public class HSCwithFunction {
    public static void main(String[] args) {
      Scanner scan = new Scanner(System.in) ;
        System.out.println("Entre Your Marks");

        System.out.println("Hindi");
     int hindi = scan.nextInt();


        System.out.println("English");
       int english = scan.nextInt();


        System.out.println("Scince");
 int scince = scan.nextInt();

        System.out.println("Maths");
        int maths = scan.nextInt();

        System.out.println("Marathi");
        int marathi = scan.nextInt();

        System.out.println("Sport");
        int sport = scan.nextInt();

        calculateMarks(hindi, english, scince , maths, marathi ,sport);
    }
     static void calculateMarks(int hindi , int english , int scince ,int maths , int marathi , int sport ) {
//IF condition

         if (hindi <= 100 && english <= 100 && scince <= 100 && maths <= 100 && marathi <= 100 && sport <100) {

             int Total =  hindi+english+scince+maths+marathi+sport;
             double Persentage = (double)Total/600*100;
             System.out.println(Persentage);

             if (Persentage <35) {
                 System.out.println("Fail");
             }else {
                 System.out.println("Paas");
                 if (Persentage < 60) {
                     System.out.println("Second Class");

                 } else if (Persentage > 60 && Persentage < 90) {
                     System.out.println("First Class");
                 } else if (Persentage >= 90) {
                     System.out.println("Topper");

                     System.out.println("Congratulation ❤️");
                 }
             }
         }



    }
}
