package Java_Program;

import java.util.Scanner;
public class Currency_Change {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter the price in Indian rupees : ");
        double ind = in.nextDouble();

        double usa = 0.012 * ind;
        System.out.println("The value of "+ind+"in US Doller is : "+usa);
    }
}
