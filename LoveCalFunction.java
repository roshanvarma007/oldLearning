import java.util.Scanner;
public class LoveCalFunction {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Entre Girl Quality");
        int girl = scan.nextInt();

        System.out.println("Entre Boy Quality");
        int boy = scan.nextInt();

       calculateQuality(girl , boy);
    }
   public static void calculateQuality( int girl , int boy){

       if (girl <= 36 && boy <= 36) {

       } else if ( girl > 36 && boy > 36) {
           System.out.println("Pleaes write correct number");

       }


       int Total = girl+boy;
       System.out.println(Total);

       if (Total == 36) {
           System.out.println("GCongratulation \"You are Made For Each Other\" ");

       } else {
           System.out.println("Sorry \"You should Try  AnOther\" ");
       }
   }
}
