package Conditionals_Loop.Assignment.Intermediate;

import java.util.Scanner;

public class Discount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the your list price : ");
        float lp = sc.nextFloat();
        System.out.print("Enter the your discount persent : ");
        float d = sc.nextFloat();

        float discount = (d*lp)/100;
        System.out.println("Discount : "+discount);
    }
}
