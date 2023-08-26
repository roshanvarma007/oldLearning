public class ThrowAndThrows {
    public static void main(String[] args) {
//        try{
//            int a=10;
//            System.out.println(10/2);
//
//            if(a==10){
//                System.out.println("Hi");
//              throw new ArithmeticException("test");
//            }
//
//        }catch (ArithmeticException e){
//            System.out.println("some error" + e);
//        }

        try{
            checkAge();
        }catch (ArithmeticException e){
            System.out.println("some error" + e);
        }
    }
//hum thrown function ke piche use kaerte hai jisme koi error ho to hum dikha sake
    public static void checkAge() throws ArithmeticException{
        System.out.println(18/2);
    }

}
