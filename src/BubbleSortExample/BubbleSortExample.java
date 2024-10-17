package BubbleSortExample;

public class BubbleSortExample
{
    public static void main(String[] args)
    {
        int[] myArray = {64, 34, 25, 12, 22, 11, 90, 5, 55};

        // Call the bubble sort function
        bubbleSort(myArray);

        // Print the sorted array
        System.out.println("Sorted array:");
        printArray(myArray);
    }

    // Function to perform bubble sort on the array
    public static void bubbleSort(int[] array)
    {
        int n = array.length;
        boolean swapped;

        // Outer loop to go through each element in the array
        for (int i = 0; i < n - 1; i++)
        {
            swapped = false;

            // Inner loop for comparing adjacent elements
            for (int j = 0; j < n - i - 1; j++)
            {
                // If the current element is greater than the next
                if (array[j] > array[j + 1])
                {
                    // Swap the elements
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                    swapped = true;
                }
            }

            // If no two elements were swapped, the array is sorted
            if (!swapped)
            {
                break;
            }
        }
    }

    // Function to print the array
    public static void printArray(int[] array)
    {
        for (int value : array)
        {
            System.out.print(value + " ");
        }
        System.out.println();
    }
}

