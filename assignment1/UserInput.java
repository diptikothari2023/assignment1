// UserInput.java
import java.util.Scanner;

public class UserInput {
    private Scanner scanner = new Scanner(System.in);
    private Calculator calculator = new Calculator();

    public void selectOperation() {
        System.out.println("Select an operation:");
        System.out.println("1. Add\n2. Subtract\n3. Multiply\n4. Divide\n5. Fibonacci\n6. Sum of Array\n7. Mean\n8. Variance\n9. Standard Deviation");
        int choice = scanner.nextInt();

        switch (choice) {
            case 1:
                System.out.println("Enter two numbers:");
                System.out.println("Result: " + calculator.add(scanner.nextDouble(), scanner.nextDouble()));
                break;
            case 2:
                System.out.println("Enter two numbers:");
                System.out.println("Result: " + calculator.subtract(scanner.nextDouble(), scanner.nextDouble()));
                break;
            case 3:
                System.out.println("Enter two numbers:");
                System.out.println("Result: " + calculator.multiply(scanner.nextDouble(), scanner.nextDouble()));
                break;
            case 4:
                System.out.println("Enter two numbers:");
                System.out.println("Result: " + calculator.divide(scanner.nextDouble(), scanner.nextDouble()));
                break;
            case 5:
                System.out.println("Enter the term number for Fibonacci:");
                System.out.println("Result: " + calculator.fibonacci(scanner.nextInt()));
                break;
            case 6:
                double[] arr = inputArray();
                System.out.println("Sum: " + calculator.sumArray(arr));
                break;
            case 7:
                arr = inputArray();
                System.out.println("Mean: " + calculator.mean(arr));
                break;
            case 8:
                arr = inputArray();
                System.out.println("Variance: " + calculator.variance(arr));
                break;
            case 9:
                arr = inputArray();
                System.out.println("Standard Deviation: " + calculator.standardDeviation(arr));
                break;
            default:
                System.out.println("Invalid choice!");
        }
    }

    private double[] inputArray() {
        System.out.println("Enter array size:");
        int size = scanner.nextInt();
        double[] arr = new double[size];
        System.out.println("Enter elements:");
        for (int i = 0; i < size; i++) {
            arr[i] = scanner.nextDouble();
        }
        return arr;
    }
}