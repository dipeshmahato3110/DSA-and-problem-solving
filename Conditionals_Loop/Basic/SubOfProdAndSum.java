package Conditionals_Loop.Assignment.Basic;

import java.util.Scanner;

public class SubOfProdAndSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a interger : ");
        int n = sc.nextInt();

        int sum = 0;
        int product = 1;
        while (n > 0) {
            sum += n % 10;
            product *= n % 10;
            n /= 10;
        }
        int sub = product-sum;
        System.out.println(sub);
    }
}
