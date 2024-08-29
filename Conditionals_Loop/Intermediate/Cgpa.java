package Conditionals_Loop.Assignment.Intermediate;

import java.util.Scanner;

public class Cgpa {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int sub, count=1, marks;
        double avg, cgpa, sum =0;

        System.out.println("How many Subject do have ? ");
        sub = sc.nextInt();

        while (count<=sub){
            System.out.println("Enter "+count+" subject marks :");
            marks = sc.nextInt();
            sum += marks;
            ++count;
        }
        avg = sum/sub;
        cgpa = avg/9.5;
        System.out.println("Your CGPA is : "+cgpa);
    }
}
