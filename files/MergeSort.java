public class MergeSort 
{
    // Function to perform merge sort on an array
    public static void mergeSort(int[] array) 
	{
        if (array == null || array.length <= 1) 
		{
            return; // Already sorted
        }

        int n = array.length;
        int mid = n / 2;

        // Create two temporary arrays
        int[] left = new int[mid];
        int[] right = new int[n - mid];

        // Copy data to temporary arrays
        System.arraycopy(array, 0, left, 0, left.length);
        System.arraycopy(array, mid, right, 0, right.length);

        // Recursively sort the two halves
        mergeSort(left);
        mergeSort(right);

        // Merge the sorted halves
        merge(array, left, right);
    }

    // Function to merge two sorted arrays into a single sorted array
    private static void merge(int[] array, int[] left, int[] right) 
	{
        int i = 0, j = 0, k = 0;

        // Compare elements from left and right arrays and merge them into the original array
        while (i < left.length && j < right.length) 
		{
            if (left[i] <= right[j]) {
                array[k++] = left[i++];
            } else {
                array[k++] = right[j++];
            }
        }

        // Copy remaining elements of left and right arrays if any
        while (i < left.length) {
            array[k++] = left[i++];
        }

        while (j < right.length) {
            array[k++] = right[j++];
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

    public static void main(String[] args) {
        int[] arr = {64, 25, 12, 22, 11};

        System.out.println("Unsorted array:");
        printArray(arr);

        // Perform merge sort
        mergeSort(arr);

        System.out.println("Sorted array:");
        printArray(arr);
    }
}
