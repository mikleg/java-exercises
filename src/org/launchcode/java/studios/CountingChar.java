package org.launchcode.java.studios;

import java.util.HashMap;
import java.util.Map;

public class CountingChar
{
    public static void main(String[] args)
    {
        HashMap<Character, Integer> countedChar = new HashMap<>();
        String myString = "aaaabbbccc ddd eee jjj lll++jjjj";
        char[] charactersInString = myString.toCharArray();
        for(char ch : charactersInString)
        {
            if (Character.isLetter(ch))
            {
                if (!countedChar.containsKey(ch))
                {
                    countedChar.put(ch,1);
                }
                else
                {
                    countedChar.replace(ch, countedChar.get(ch)+1);
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
}

