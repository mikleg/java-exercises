package exercises;

import java.util.Scanner;

public class InputOutput {
    public static void main(String[] args) {
        Scanner in;
        String name;
        in = new Scanner(System.in);
        System.out.println("Enter your name: ");
        name = in.next();
        System.out.println("Hello, ".concat(name).concat("!"));
    }
}
