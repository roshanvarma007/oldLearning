import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {
//First You have to give scanner class

        Scanner scan = new Scanner(System.in);

        //Than you should give sout

        System.out.println("Entre Your value");

        //Import int scanner class value

        int number = scan.nextInt();

        //sout first what you want to print

        System.out.println("Multiplication Table For" + number + ":");

        //Than you have to give for loop

for (int i = 1; i<= 10; i++){
    System.out.println(number*i);
}
// your code is done.
        //Thank you





    }

}
