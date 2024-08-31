package Conditionals_Loop.Assignment.Intermediate;

import java.util.Scanner;
import java.lang.Math;
public class Distance {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double x1, x2, y1, y2, distance;

        System.out.print("Enter the value of x1 : ");
        x1 = sc.nextDouble();
        System.out.print("Enter the value of x2 : ");
        x2 = sc.nextDouble();
        System.out.print("Enter the value of y1 : ");
        y1 = sc.nextDouble();
        System.out.print("Enter the value of y2 : ");
        y2 = sc.nextDouble();

        distance = Math.sqrt(Math.pow((x2-x1),2)+ Math.pow((y2-y1),2));
        System.out.println("Distance : "+distance);
    }
}
