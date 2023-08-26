import java.util.Scanner;

public class HSCmarks {

    public static void main(String[] args) {

        System.out.println("Entre your all subjects marks");

        Scanner scan = new Scanner(System.in);

        System.out.println("Hindi");           int Hindi = scan.nextInt();
        System.out.println("English");         int Eng = scan.nextInt();
        System.out.println("Maths");           int Maths = scan.nextInt();
        System.out.println("Scince");          int Scince= scan.nextInt();
        System.out.println("Social Scince");   int Social= scan.nextInt();
        System.out.println("Marathi");         int Marathi = scan.nextInt();

        if (Hindi <= 100 && Eng <= 100 && Maths <= 100 && Scince <= 100 && Social <= 100 && Marathi <= 100) {

            int Total =  Hindi+Eng+Maths+Scince+Social+Marathi;
            double Persentage = (double)Total/600*100;
            System.out.println(Persentage);
//less than 35
            if (Persentage <35) {
                System.out.println("Fail");

            } else {
                System.out.println("Paas");

                if (Persentage < 60) {
                    System.out.println("II Class");
                } else if (Persentage > 60 && Persentage < 90) {
                    System.out.println("I Class");
                } else if (Persentage >= 90) {
                    System.out.println("Topper");

                }


            }

        }





    }
}
