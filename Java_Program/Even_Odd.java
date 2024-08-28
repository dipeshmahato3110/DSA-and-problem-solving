package Java_Program;

import java.util.Scanner;
public class Even_Odd {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num;
        System.out.print("Enter a number : ");
        num = in.nextInt();

        if (num % 2 ==0){
            System.out.println("Even number");
        }else {
            System.out.println("Odd number");
        }
    }
}
