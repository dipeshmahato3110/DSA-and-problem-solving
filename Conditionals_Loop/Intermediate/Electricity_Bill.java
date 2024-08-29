package Conditionals_Loop.Assignment.Intermediate;

import java.util.Scanner;

public class Electricity_Bill {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int units;
        double bill = 0;

        System.out.print("Enter the untis of your electricity bill : ");
        units = sc.nextInt();

        if (units<100){
            bill = units*1.20;
        }
        else if (units<300) {
            bill = units*1.20+(units-100)*2;
        }
        else if (units>300) {
            bill = units*1.20+200*2+(units-300)*3;
        }
        System.out.println("You Electricity bill of this mounth is : "+bill);
    }
}
