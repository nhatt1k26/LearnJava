package FCollection;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class SortExp {

    // This function takes last element as pivot,
    // places the pivot element at its correct position
    // in sorted array, and places all smaller to left
    // of pivot and all greater elements to right of pivot
    static int partition(List<Integer> list, int low, int high)
    {
        int pivot = list.get(high);

        // Index of smaller element and indicates
        // the right position of pivot found so far
        int i = (low - 1);

        for (int j = low; j <= high - 1; j++) {

            // If current element is smaller than the pivot
            if (list.get(j) < pivot) {

                // Increment index of smaller element
                i++;
                Collections.swap(list, i, j);
            }
        }
        Collections.swap(list, i + 1, high);
        return (i + 1);
    }

    // The main function that implements QuickSort
    // arr[] --> Array to be sorted,
    // low --> Starting index,
    // high --> Ending index
    static void quickSort(List<Integer> list, int low, int high)
    {
        if (low < high) {
            int midIndex = partition(list, low, high);
            // Separately sort elements before
            // partition and after partition
            quickSort(list, low, midIndex - 1);
            quickSort(list, midIndex + 1, high);
        }
    }
    // To print sorted array
    // Driver Code
    public static void main(String[] args)
    {
        List<Integer> integerList = new ArrayList<>(List.of( 10, 7, 8, 9, 1, 5));
        int integerListSize = integerList.size();
        // Function call
        quickSort(integerList, 0,  integerListSize - 1);
        System.out.println("Sorted array:");
        integerList.forEach(System.out::println);
    }
}