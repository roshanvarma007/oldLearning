import java.util.Arrays;

public class Array2Practise {
    public static void main(String[] args) {

        int [] number = {4,7,9,1,2};
        Arrays.sort(number);

        System.out.println("Here is assending order of number : " + Arrays.toString(number));

        int max = number[0];
        for (int i = 1;i<number.length;i++){
            if (number[i]>max) {
                max = number[i];

            }
        }
        System.out.println("Max value is : " + max);

        int sum = 0;
        for (int num : number){
            sum += num;
        } double avarage = (double) sum/ number.length;
        System.out.println("Avrage of number is : " + avarage);


    }
}
