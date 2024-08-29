package Conditionals_Loop.Assignment.Intermediate;

import java.util.Scanner;

public class AvgOfN_Num {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n, count = 1;
        double avg, sum=0, x;

        System.out.print("Enter number : ");
        n = sc.nextInt();

        while (count<=n){
            System.out.println("Enter "+count+" number ?");
            x = sc.nextDouble();
            sum += x;
            ++count;
        }
        avg = sum/n;

        System.out.println("Avg : "+avg);
    }
}
