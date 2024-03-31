public class BinarySearch 
{
    // Function to perform binary search on a sorted array
    public static int binarySearch(int[] array, int target) {
        int low = 0;
        int high = array.length - 1;

        while (low <= high) 
		{
            int mid = low + (high - low) / 2;

            if (array[mid] == target) 
			{
                return mid; // Return the index if the target is found
            } 
			else if (array[mid] < target) 
			{
                low = mid + 1;
            } 
			else 
			{
                high = mid - 1;
            }
        }

        return -1; // Return -1 if the target is not found in the array
    }

    public static void main(String[] args) {
        int[] arr = {11, 12, 22, 25, 64};
        int target = 25;

        // Perform binary search
        int index = binarySearch(arr, target);

        if (index != -1) {
            System.out.println("Element " + target + " found at index " + index);
        } else {
            System.out.println("Element " + target + " not found in the array");
        }
    }
}
