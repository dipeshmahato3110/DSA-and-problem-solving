package Conditionals_Loop.Assignment.Basic;

import java.util.Scanner;

public class Fibo {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter the number : ");
        int n = in.nextInt();

        int a = 0;
        int b = 1;
        int count = 2;

        while (count <= n){
            int temp = b;
            b = b+a;
            System.out.print(" "+b);
            a = temp;
            count++;

        }
//        System.out.println("Sum : "+b);
    }
}
