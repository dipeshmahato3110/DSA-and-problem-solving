package Conditionals_Loop.Assignment.Intermediate;

import java.util.Scanner;
import  java.lang.Math;
public class Power {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number : ");
        double num = sc.nextDouble();
        System.out.println("Enter the power : ");
        double p = sc.nextDouble();

        double pp = Math.pow(num,p);
        System.out.println(pp);
    }
}
