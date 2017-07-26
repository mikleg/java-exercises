package exercises;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;

public class SummEven
{
    public static void main(String[] args)
    {
        ArrayList<Integer> intList = new ArrayList<>();
        for (int i =0; i < 10; i++)
        {
            intList.add(i);
        }
        System.out.println("The summ is: ".concat(String.valueOf(summEven(intList)).concat("!")));
    }

    public static int summEven(ArrayList<Integer> intList)
    {
        int summ = 0;
        for (int elem : intList)
        {
            if (elem%2 == 0)
            {
                summ += elem;
            }
        }
        return(summ);
    }
}
