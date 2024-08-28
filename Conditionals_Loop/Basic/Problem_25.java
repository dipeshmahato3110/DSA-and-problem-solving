package Conditionals_Loop.Assignment.Basic;

import java.util.Scanner;

public class Problem_25 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int large =0;
        int input = 0;

        do {
            System.out.print("Enter number : ");
            input = sc.nextInt();
            System.out.println("Enter 0 to end the loop......  :) ");
            if (input>large){
                large=input;
            }
        }while (input>0);
        System.out.println("Largest num : "+large);
    }
}
