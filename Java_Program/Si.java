package Java_Program;

import java.util.Scanner;
public class Si {
    public static void main(String[] args) {
        float p, r, t, si;
        Scanner in = new Scanner(System.in);

        System.out.print("Enter the principle : ");
        p = in.nextFloat();
        System.out.print("Enter the rate : ");
        r = in.nextFloat();
        System.out.print("Enter the time : ");
        t = in.nextFloat();

        si = (p*r*t)/100;
        System.out.println("Simple Interest : "+si);

    }
}
