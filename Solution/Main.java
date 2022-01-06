/**
 * Highest GC-Content of given strands.
 *
 * @author Mr. King
 * @version 01/04/2022
 */

import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);

        // Ask how many strands that will be input
        System.out.print("How many strands? ");
        int n = Integer.parseInt(in.next());
        
        // Create two String arrays, one for the ids and one for the strands
        String[] ids = new String[n];
        String[] strands = new String[n];
        
        // Get input for each id and strand 
        //      Use a loop to ask for the specified number of id and strands
        //      Ask for each id and strand separately
        //      Insert each into their respective arrays
        for(int i = 0; i < n; i++)
        {
            System.out.print("Id #" + (i+1) + ": ");
            ids[i] = in.next();
            System.out.print("Strand #" + (i+1) + ": ");
            strands[i] = in.next();
        }

        // Use method to get index in array of strand with greatest GC-Content
        int index = highestGC(strands);

        // Print its id and GC-Content as a percentage
        System.out.println("Highest GC-content: " + ids[index] + " (" + gcContent(strands[index]) + " %)");
    }


    // Create method that returns the GC-Content of a given strand
    public static double gcContent(String dna)
    {
        int c = 0;

        for(int i = 0; i < dna.length(); i++)
        {
            if(dna.substring(i, i+1).equals("G") || dna.substring(i, i+1).equals("C"))
            {
                c++;
            }
        }

        return (100.0 * c / dna.length());
    }
    

    // Create a method that finds the strand with the greatest GC-Content 
    // and returns its index in the arrays
    public static int highestGC(String[] strands)
    {
        int max = 0;

        for(int i = 1; i < strands.length; i++)
        {
            if(gcContent(strands[i]) > gcContent(strands[max]))
            {
                max = i;
            }
        }

        return max;
    }
}

