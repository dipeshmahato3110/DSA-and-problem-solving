package Conditionals_Loop.Assignment.Intermediate;

import java.util.Scanner;

public class Hcf {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a,b,temp,count,num1,num2,hcf,lcm;

        System.out.print("Enter num1 : ");
        num1 = sc.nextInt();
        System.out.print("Enter num2 : ");
        num2 = sc.nextInt();

        a = num1;
        b = num2;

        while (b!=0){
            temp = b;
            b = b % a;
            a = temp;
        }
        hcf = a;
        System.out.print("HCF of "+num1+" & "+num2+" is : "+hcf);
    }
}
