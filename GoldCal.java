
import java.util.Scanner;
public class GoldCal {
    public static void main(String[] args) {
        System.out.println("Gold Calculator");
        //first give scanner class

        Scanner scan = new Scanner(System.in);

        //Entre your gold weight

        System.out.println("Entre Your Gold Weight");
        double goldWeight = scan.nextDouble();


        System.out.println("Entre Your Gold Purity");
       double goldPurirty = scan.nextDouble();

        // Entre your gold value
        System.out.println("Entre Your Gold Value");
        double goldValue = scan.nextDouble();

        System.out.println("Entre Your Gold Making Charge Per gram");
        double goldMaking = scan.nextDouble();

        //you have to define your method
        totalValue(goldWeight,goldPurirty,goldValue,goldMaking);

    } //now you have to make a function
    public static void totalValue(double goldWeight , double goldPurity , double goldValue , double goldMaking){

        double Total = ((goldWeight*goldPurity/1000)*goldValue/10 + (goldWeight*goldMaking));
        System.out.println(Total);
    }




}
