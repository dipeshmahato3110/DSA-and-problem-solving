package Java_Program;

import java.util.Scanner;

public class Message {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("What is your name...?");
        String name = sc.nextLine();

        System.out.println("‘Hi "+name+", Thanks for subscribing to our service. Chat, mail or call us if you have any questions.’");
    }
}
