package Conditionals_Loop;

import java.util.Scanner;
public class PrimeNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number : ");
        int num = input.nextInt();
        int c = 2;
        while ( c*c < num){
            if (num % c == 0){
                System.out.println(num + ": Not a prime number.");
            }
            c += 1;
            
        }


        System.out.println(num + ": Prime number.");
    }
}
