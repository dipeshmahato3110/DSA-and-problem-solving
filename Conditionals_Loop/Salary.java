package Conditionals_Loop;

import java.util.Scanner;
public class Salary {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter Your Salary : ");
        int salary = input.nextInt();
        if (salary>45000) {
            salary = salary + 5000;
            System.out.println("You get a Bonus of : 5000");
            System.out.println("Total Salary = " + salary);
        }
        if (salary>25000 && salary<45000){
            salary = salary + 3000;
            System.out.println("You get a Bonus of : 3000");
            System.out.println("Total Salary = "+ salary);
        }
        else {
            salary = salary + 1500;
            System.out.println("You get a Bonus of : 1500");
            System.out.println("Salary = "+ salary);
        }
    }
}
