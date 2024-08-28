package Java_Program;

import java.util.Scanner;
public class Largest {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter the 1st number : ");
        int num1 = in.nextInt();
        System.out.print("Enter the 2nd number : ");
        int num2 = in.nextInt();
        System.out.print("Enter the 3rd number : ");
        int num3 = in.nextInt();
        System.out.print("Enter the 4th number : ");
        int num4 = in.nextInt();


        int large = Math.max(num4, Math.max(num3, Math.max(num1, num2)));
        System.out.println("Largest number is : "+large);

    }
}
