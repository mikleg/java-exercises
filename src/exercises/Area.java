package exercises;

import java.util.Scanner;

public class Area {
    public static void main(String[] args) {
        Scanner in;
        float length;
        float width;
        in = new Scanner(System.in);
        System.out.println("Enter the length: ");
        length = in.nextFloat();
        System.out.println("Enter the width: ");
        width = in.nextFloat();
        System.out.println("The area is: ".concat(String.valueOf(width*length).concat("!")));
    }
}