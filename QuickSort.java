import java.util.Arrays;

public class QuickSort {

	//simple program that just initializes low and high as the start and end of the array, as well as running it
	public static void sort(int[] nums){
		int low = 0;
		int high = nums.length - 1;
		quickSort(nums, low, high);
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
		//if the low index is greater than the high index it will stop, (meaning it has parsed through everything)
		if(low < high){
			//partition grabs the index where the pivot point is, so you know where to slice the array
			int index = partition(nums, low, high);
			System.out.println("sorting " + Arrays.toString(nums));
	
			//sorts the sliced arrays at the index given
			quickSort(nums, low, index - 1);
			quickSort(nums, index + 1, high);
		
		}
	}
	
	/* 
	*
	* This method takes a single array, an inclusive low, and an inclusive high.
	* It returns the index of the pivot in the array.
	*
	*/
	private static int partition(int[] nums, int low, int high)
	{
		//variables that grab the inital pivot point (the end) and count the index
		int pivot = nums[high];
		int count = low - 1; //this needs to be - 1 for a reason I do not know, I just know it stops an IndexOutOfBounds, it counts how many numbers are to left of pivot at end essentially
		
		//for loop that continues while the end point of the array isn't passed
		for(int i = low; i < high; i++){

			//if the number at the lower index is less than the pivot point, it will switch the numbers at 'count' and 'i' so the smaller number is to the left
			if(nums[i] <= pivot){
				count++;
				int temp = nums[count];
				nums[count] = nums[i];
				nums[i] = temp;
			}
		}
		//method needs to be inclusive (but needs to be out of loop because it will hit exception otherwise)
		int temp = nums[count+1];
		nums[count+1] = nums[high];
		nums[high] = temp;

		return count + 1; // + 1 otherwise the index is off because of initialization
	}
}

