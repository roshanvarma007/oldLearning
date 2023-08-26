import java.util.Scanner;

 class ArrayOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();

        int[] array = new int[size];
        System.out.println("Enter the elements of the array:");

        for (int i = 0; i < size; i++) {
            System.out.print("Element " + (i + 1) + ": ");
            array[i] = scanner.nextInt();
        }

        System.out.println("\nArray operations:");
        System.out.println("1. Find maximum value");
        System.out.println("2. Find minimum value");
        System.out.println("3. Calculate sum");
        System.out.println("4. Calculate average");
        System.out.println("5. Search for an element");
        System.out.print("\nEnter your choice: ");
        int choice = scanner.nextInt();

        switch (choice) {
            case 1:
                int max = findMax(array);
                System.out.println("Maximum value: " + max);
                break;
            case 2:
                int min = findMin(array);
                System.out.println("Minimum value: " + min);
                break;
            case 3:
                int sum = calculateSum(array);
                System.out.println("Sum: " + sum);
                break;
            case 4:
                double average = calculateAverage(array);
                System.out.println("Average: " + average);
                break;
            case 5:
                System.out.print("Enter the element to search for: ");
                int searchElement = scanner.nextInt();
                boolean found = searchElement(array, searchElement);
                if (found) {
                    System.out.println("Element found in the array.");
                } else {
                    System.out.println("Element not found in the array.");
                }
                break;
            default:
                System.out.println("Invalid choice.");
        }

        scanner.close();
    }

    public static int findMax(int[] array) {
        int max = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        return max;
    }

    public static int findMin(int[] array) {
        int min = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }
        return min;
    }

    public static int calculateSum(int[] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        return sum;
    }

    public static double calculateAverage(int[] array) {
        int sum = calculateSum(array);
        return (double) sum / array.length;
    }

    public static boolean searchElement(int[] array, int searchElement) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == searchElement) {
                return true;
            }
        }
        return false;
    }
}