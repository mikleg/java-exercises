package org.launchcode.java.studios;

import java.util.Scanner;

public class Area {
    public static void main(String[] args) {
        Scanner in;
        float r;
        float width;
        in = new Scanner(System.in);
        r = -1;
        while (r<=0) {
            System.out.println("Enter a radius: ");
            r = in.nextFloat();
            if (r<=0) {
                System.out.println("Your r is not greater than zero, Please try again ");
                }

            }
        System.out.println("The area of a circle of radius ".concat(String.valueOf(r))
                            .concat(" is: ").concat(String.valueOf(3.14*r*r)));
    }
}
