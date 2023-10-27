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

    static int partition (int[] a, int l, int h)
    {
        int pivot = a[h];
        i = l - 1;
        for (j = l; j < h; j++)
        {
            if (a[j] <= pivot)
            {
                i++;
                swap (a, i, j);
            }
        }
        swap (a, i + 1, h);
        return (i + 1);
    }

    static void sort (int[] a, int l, int h)
    {
        if (l < h)
        {
            int pi = partition (a, l, h);
            //recursive call to quicksort function.
            sort (a, l, pi - 1);
            sort (a, pi + 1, h);
        }
    }
}

