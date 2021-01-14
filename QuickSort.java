import java.util.Arrays;

public class QuickSort {
	public static void sort(int[] nums){
		
	}
		// use the private helper methods here. 
	
	/*
	*
	* This private helper method takes a single array, an inclusive low, and an inclusive
	* high. The result is a sorted version of the original array performed
	* in place.
	*
	*/
	
	private static void quickSort(int[] nums, int low, int high)
	{
		//base case
		if(nums.length <= 1){
			return;
		}
		
	
		//partition nums
		
		System.out.println("sorting " + Arrays.toString(nums));
	
		//quick sort right
		//quick sort left
	
	}
	
	/* 
	*
	* This method takes a single array, an inclusive low, and an inclusive high.
	* It returns the index of the pivot in the array.
	*
	*/
	private static int partition(int[] nums, int low, int high)
	{
		int index = nums.length - 1;
		int pivot = nums[index];
	
		//smaller than pivot on left, larger than pivot on right
	
		//place the pivot in correct spot
	
		//return index of pivot
		return index;
	}
}

