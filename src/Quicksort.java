public class Quicksort
{
    static int i, j;

    //swap function
    static void swap (int[] a, int k, int l)
    {
        int t = a[k];
        a[k] = a[l];
        a[l] = t;
    }

    static int partition (int[] a, int low, int high)
    {
        int pivot = a[high];
        i = low - 1;
        for (j = low; j < high; j++)
        {
            if (a[j] <= pivot)
            {
                i++;
                swap (a, i, j);
            }
        }
        swap (a, i + 1, high);
        return (i + 1);
    }

    static void sort (int[] a, int low, int high)
    {
        if (low < high)
        {
            int pi = partition (a, low, high);
            //recursive call to quicksort function.
            sort (a, low, pi - 1);
            sort (a, pi + 1, high);
        }
    }
}

