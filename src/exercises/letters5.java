package exercises;

import java.util.ArrayList;

public class letters5
{
    public static void main(String[] args)
    {
        ArrayList<String> wordsList = new ArrayList<>();
        wordsList.add("aaa");
        wordsList.add("aaab");
        wordsList.add("aaabb");
        wordsList.add("aaabbb");
        wordsList.add("aaacc");
        print5let(wordsList);
    }
    public static void print5let(ArrayList<String> strList)
    {

        for (String elem : strList)
        {
            if (elem.length() == 5)
            {
                System.out.println("This word is 5 letter: ".concat(elem).concat(" "));
            }
        }

    }
}
