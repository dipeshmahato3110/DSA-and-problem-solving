package Java_Program;

import java.util.Scanner;
public class Operator {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int ans = 0;
        while (true){
//                Input two numbers
            System.out.print("Enter num1 : ");
            int num1 = in.nextInt();
            System.out.print("Enter num2 : ");
            int num2 = in.nextInt();
//            Take the operator as input
            System.out.print("Enter the Operator : ");
            char op = in.next().trim().charAt(0);

            if (op == '+' || op == '-' || op == '*' || op == '/' || op == '%'){

                if (op == '+'){
                    ans = num1+num2;
                    System.out.println("Sum of two number is :" + ans);
                }
                if (op == '-'){
                    if (num1>num2) {
                        ans = num1 - num2;
                    }else {
                        ans = num2 - num1;
                    }
                    System.out.println("Sub of two number is :" + ans);
                }
                if (op == '*'){
                    ans = num1*num2;
                    System.out.println("Multi of two number is :" + ans);
                }
                if (op == '/'){
                    if (num2 != 0) {
                        ans = num1 / num2;
                        System.out.println("Divide of two number is :" + ans);
                    }
                }
                if (op == '%'){
                    ans = num1%num2;
                    System.out.println("Module of two number is :" + ans);
                }

            }
            if (op == 'x' || op == 'X') {
                break;
            }else {
//                System.out.println("Invalid operation !!");
            }

        }
    }
}
