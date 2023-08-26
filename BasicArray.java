import java.util.Scanner;

public class BasicArray {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int size = scan.nextInt();
        int [] number = new int[size];
//        marks [0] = 90;
//        marks [1] = 99;
//        marks [2] = 80;

//        System.out.println(marks[0]);
//        System.out.println(marks[1]);
//        System.out.println(marks[2]);
      //input
        for (int i = 0;i<number.length;i++){
            number[i] = scan.nextInt();
        }
int x = scan.nextInt();
        //output
        for (int i = 0; i<number.length ; i++){
            if (number[i] == x){
                System.out.println("x fount at index : " + i);
            }
        }
    }
}
