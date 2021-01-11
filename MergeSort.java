import java.util.Arrays;

public class MergeSort {
	
	/*
	 * This method takes an array of integers and performs mergesort on the array.
	 * 
	 */
	public static void sort(int[] nums){
		System.out.println("sorting " + Arrays.toString(nums));
		int[] left = splitArray(nums, 0, nums.length / 2);
		int[] right = splitArray(nums, nums.length / 2, nums.length);
		if(left.length != 1){
			sort(left);
		}
		if(right.length != 1){
			sort(right);
		}
		merge(left, right, nums);
		// merge left and right
		System.out.println("merging " + Arrays.toString(left) +  " and " + Arrays.toString(right));
	}
	
	/*
	*	This method takes two sorted arrays, left and right,g
	*   and the original unsorted array. We want to consistently 
	*   sort in place.
	*/
	private static void merge(int[] left, int[] right, int[] nums){
		if(left.length + right.length == nums.length){

		}
		for(int i = 0; i < (left.length + right.length) / 2; i ++){
			if(left[i] < right[i]){
			}
		}
	}
	
	/*
	*	This method takes a single array, and an inclusive start
	*	and exclusive stop index. It returns the correct portion
	*	of the original array. 
	*/
	private static int[] splitArray(int[] nums, int start, int stop)
	{
		int[] partArray = new int[nums.length / 2];
		int count = 0;
		for(int i = start; i < stop; i++){
			partArray[count] = nums[i];
			count ++;
		}
		return partArray;
	}
}
