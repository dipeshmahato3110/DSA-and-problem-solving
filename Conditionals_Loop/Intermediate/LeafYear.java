package Conditionals_Loop.Assignment.Intermediate;

import java.util.Scanner;

public class LeafYear {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the year : ");
        int year = sc.nextInt();

        if ((year % 4 ==0) || (year % 100 == 0)){
            System.out.print("Leaf year ");
        }else {
            System.out.print("Not !");
        }
    }
}
