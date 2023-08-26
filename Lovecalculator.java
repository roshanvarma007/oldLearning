import java.util.Scanner;

public class Lovecalculator {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Entre Girl Quality");
        int girl = scan.nextInt();

        System.out.println("Entre Boy Quality");
        int boy = scan.nextInt();

        if (girl <= 36 && boy <= 36) {

            int love = girl + boy;

            System.out.println(love);

            if (love == 36) {

                System.out.println(" ❤️Good Couple❤️");

            } else {

                System.out.println("Please try another person");
            }

        } else {
            System.out.println("Invalied value 'Oh ho 😒");

        }

        scan.close();

    }

}
