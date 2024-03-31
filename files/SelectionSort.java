public class SelectionSort {
    // Function to perform selection sort on an array
    public static void selectionSort(int[] array) 
	{
        int n = array.length;

        for (int i = 0; i < n - 1; i++) {
            // Find the index of the minimum element in the unsorted part of the array
            int minIndex = i;
            for (int j = i + 1; j < n; j++)
				{
                if (array[j] < array[minIndex]) 
				{
                    minIndex = j;
                }
            }

            // Swap the found minimum element with the first element of the unsorted part
            int temp = array[minIndex];
            array[minIndex] = array[i];
            array[i] = temp;
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
        int[] arr = {64, 25, 12, 22, 11};

        System.out.println("Unsorted array:");
        printArray(arr);

        // Perform selection sort
        selectionSort(arr);

        System.out.println("Sorted array:");
        printArray(arr);
    }
}
