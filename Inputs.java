import java.util.Scanner;

public class Inputs {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter one number : ");
        int num1 = input.nextInt();
        System.out.println("Enter second number : ");
        int num2 = input.nextInt();
        int sum = num1 + num2;
        System.out.println("Sum of two numbers : "+sum);
    }
}
