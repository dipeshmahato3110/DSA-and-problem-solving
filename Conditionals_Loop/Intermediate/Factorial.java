package Conditionals_Loop.Assignment.Intermediate;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int i, fact = 1, num;
        System.out.print("Enter a number : ");
        num = sc.nextInt();

        for (i=1;i<=num;i++){
            fact *=i;
        }
        System.out.println("Factorial of "+num+" is : "+fact);
    }
}

