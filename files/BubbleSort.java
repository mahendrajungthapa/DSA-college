public class BubbleSort {
    // Function to perform bubble sort on an array
    public static void bubbleSort(int[] array) {
        int n = array.length;
        boolean swapped;

        for (int i = 0; i < n - 1; i++) 
		{
            swapped = false;

            for (int j = 0; j < n - i - 1; j++) {
                if (array[j] > array[j + 1]) {
                    // Swap array[j] and array[j+1]
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;

                    swapped = true;
                }
            }

            // If no two elements were swapped by inner loop, the array is already sorted
            if (!swapped) {
                break;
            }
        }
    }

    // Function to print an array
    public static void printArray(int[] array) {
        int n = array.length;
        for (int i = 0; i < n; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) 
	{
        int[] arr = {64, 34, 25, 12, 22, 11, 90};

        System.out.println("Unsorted array:");
        printArray(arr);

        // Perform bubble sort
        bubbleSort(arr);

        System.out.println("Sorted array:");
        printArray(arr);
    }
}
