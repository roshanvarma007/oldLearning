import java.util.Scanner;

public class Array2D {
    public static void main(String[] args) {
Scanner scan = new Scanner(System.in);

        int rows = scan.nextInt();
        int collom = scan.nextInt();

        int [][] number = new int[rows][collom];

        //input
        //rows
        for (int i = 0; i<rows ; i++ ){
            //collom
            for (int j = 0; j<collom; j++){
                number[i][j] = scan.nextInt();
            }
        }

        int x = scan.nextInt();

       for (int i = 0; i<rows;i++){
           for(int j=0; j<collom;j++){
               if(number[i][j] == x){
                   System.out.println("x found at location" + i + "," +j);
               }
           }
       }
    }
}
