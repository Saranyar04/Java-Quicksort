//package

import util.Quicksort;
import java.util.Scanner;

public class Main {

    public static void main (String[] args) {
        int[] a = new int[7];
        Scanner s = new Scanner (System.in);
        System.out.println ("Enter 7 numbers to quick sort : ");

        // Read 7 numbers to an array
        for (int i = 0; i < 7; i++)
            a[i] = s.nextInt ( );
        //Quicksort Q = new Quicksort ( );
        Quicksort.sort (a, 0, 6);
        //Printing sorted array
        for (int j = 0; j < 7; j++)
            System.out.print (a[j]+" ");

    }
}