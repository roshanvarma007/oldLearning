



public class ExceptionHandlingTryCatch {
    public static void main(String[] args) {
       int a =10;
        try {
            System.out.println(10/3);

        } catch (Exception error){
            System.out.println("You can not devide by zero");
        } finally {
            System.out.println("this block will run in both cases");
        }
        System.out.println("Try again");
    }
}
