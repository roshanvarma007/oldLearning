import java.util.Scanner;

class SwitchCase {
    public static void main(String[] args) {
        System.out.println("Entre user age");

        Scanner scan = new Scanner(System.in);
        int age = scan.nextInt();
        switch (age) {
            case 10:
                System.out.println("user age is 10");
                break;
            case 20:
                System.out.println("user age is 20");
                break;
            case 30:
                System.out.println("user age is 30");
                break;
            default :
                System.out.println("user age is not matching any case");

        }
    }

}
