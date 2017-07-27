package org.launchcode.java.studios;

import java.nio.file.Paths;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;


public class CountingChar
{
    public static void main(String[] args)
    {
        HashMap<Character, Integer> countedChar = new HashMap<>();
        //String myString = "AAaaaabbbccc ddd eee jjJ lll++Jjjj";
        String myString = nGUI();
        char[] charactersInString = myString.toCharArray();
        for(char ch : charactersInString)
        {
            if (Character.isLetter(ch))
            {

                if (!countedChar.containsKey(Character.toLowerCase(ch)))
                {
                    countedChar.put(Character.toLowerCase(ch),1);
                }
                else
                {
                    countedChar.replace(Character.toLowerCase(ch), countedChar.get(Character.toLowerCase(ch))+1);
                }
            }
        }

        printHash(countedChar);
    }

    public static void printHash(HashMap<Character, Integer> myhash)
    {
        for (Map.Entry<Character, Integer> myChar : myhash.entrySet())
        {
            System.out.println(myChar.getKey() + ": " + myChar.getValue());
        }
    }

    public static String nGUI ()
    {

        Scanner in = new Scanner(System.in);
        String myString = "";
        /*
        System.out.println("Enter your string");
        myString = in.nextLine();
        */
        Path my_path = Paths.get("C:/Users/mikle/LC101/java-exercises", "string.txt");
        List<String> fileLines;
        Charset charset = Charset.forName("ISO-8859-1");
        try
        {
            fileLines = Files.readAllLines(my_path, charset);
            if (!fileLines.isEmpty())
            {
                myString = fileLines.get(0);
            }
            return(myString);
        }
        catch (IOException e)
        {
            System.out.println(e);
            return("");
        }


    }
}

