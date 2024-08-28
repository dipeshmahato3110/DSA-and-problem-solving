package Java_Program;

import java.util.Scanner;

public class Fibo {
    public static void main(String[] args) {
        int a, b, temp, count;
        Scanner in = new Scanner(System.in);

        System.out.print("Enter the number : ");
        int n = in.nextInt();

         a = 0;
         b = 1;
        count = 2;

        while (count <= n){
            temp = b;
            b = b+a;
            a = temp;
            count++;

        }
        System.out.println(b);
    }

}
