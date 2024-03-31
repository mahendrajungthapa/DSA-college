public class SequentialSearch 
{
    // Function to perform sequential search on an array
    public static int sequentialSearch(int[] array, int target)
	{
        int n = array.length;

        for (int i = 0; i < n; i++) {
            if (array[i] == target) {
                return i; // Return the index if the target is found
            }
        }

        return -1; // Return -1 if the target is not found in the array
    }

    public static void main(String[] args) 
	{
        int[] arr = {64, 25, 12, 22, 11};
        int target = 22;

        // Perform sequential search
        int index = sequentialSearch(arr, target);

        if (index != -1) {
            System.out.println("Element " + target + " found at index " + index);
        } else {
            System.out.println("Element " + target + " not found in the array");
        }
    }
}
