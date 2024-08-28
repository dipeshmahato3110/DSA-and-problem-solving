package Conditionals_Loop.Assignment.Basic;

import java.util.Scanner;

public class Problerm_24 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int sum = 0;
        int x = in.nextInt();
        while (x >0) {
            if (x > 0) {
                sum += x;
            } else {
                System.out.println("no data was entered");
            }
            x = in.nextInt();
        }
        System.out.println(sum);
    }
}
