package exercises;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class IdsPrint
{
    public static void main(String[] args)
    {

        HashMap<Integer, String> ids = new HashMap<>();
        Scanner in = new Scanner(System.in);
        String newID;

        System.out.println("Enter your students IDs (or ENTER to finish):");

        // Get student names and grades
        do
        {

            System.out.print("ID: ");
            newID = in.nextLine();

            if (!newID.equals(""))
            {
                System.out.print("Name: ");
                String newName = in.nextLine();
                ids.put( Integer.valueOf(newID), newName);

                // Read in the newline before looping back
                //in.nextLine();
            }

        } while(!newID.equals(""));

        // Print class roster
        System.out.println("\nClass roster:");


        for (Map.Entry<Integer, String> student : ids.entrySet())
        {
            System.out.println(student.getKey() + ": " + student.getValue());

        }

    }

}
