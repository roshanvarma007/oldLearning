import java.util.Scanner;


class Main {
    public static void main(String[] args) {
        System.out.println("Entre You Age :");
        Scanner scan = new Scanner(System.in);
        int age = scan.nextInt();
        if (age >= 18) {
            System.out.println("Congratulation");
        } else {
            System.out.println("Sorry");
        }


        System.out.println(age);
    }
}