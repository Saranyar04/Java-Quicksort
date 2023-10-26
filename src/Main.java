import java.util.Scanner;


class QuickSort
{
    int pivot;
    int i,j;
    //swap function
    static void swap(int a[],int k,int l)
    {
        int t = a[k];
        a[k]=a[l];
        a[l]=t;
    }
    int partition (int a[], int l, int h)
    {
        pivot = a[h];
        i = l-1;
        for (j=l; j<h; j++)
        {
            if (a[j] <= pivot)
            {
                i++;
                swap(a,i,j);
            }
        }
        swap(a,i+1,h);
        return (i+1);
    }

    void quicksort (int a[], int l, int h)
    {
        if (l<h)
        {
            int pi = partition(a,l,h);
            //recursive call to quicksort function.
            quicksort(a,l,pi-1);
            quicksort(a,pi+1,h);
        }
    }
}
public class Main {
    public static void main(String[] args) {
        int[] a = new int[7];
        Scanner s=new Scanner(System.in);
        System.out.println("Enter 7 numbers to quick sort : ");

        // Read 7 numbers to an array
        for (int i = 0; i < 7; i++)
            a[i]=s.nextInt();
        // creating object for Quicksort
        QuickSort Q= new QuickSort();
        Q.quicksort(a,0,6);
        //Printing sorted array
        for (int j = 0; j<7 ; j++)
            System.out.println(a[j]);
    }
}