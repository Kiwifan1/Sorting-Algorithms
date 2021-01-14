import java.util.Arrays;

public class MergeSort {
	
	/*
	 * This method takes an array of integers and performs mergesort on the array.
	 * 
	 */
	public static void sort(int[] nums){
		System.out.println("sorting " + Arrays.toString(nums));

		//splits the passed array into two arrays of half length each with the numbers copied over
		int[] left = splitArray(nums, 0, nums.length / 2);
		int[] right = splitArray(nums, nums.length / 2, nums.length);

		//the recursive part of algorithm, where until the array is only one element it will keep splitting it
		if(left.length > 1){
			sort(left);
		}
		if(right.length > 1){
			sort(right);
		}
		//the merge part that starts with one element arrays and builds up
		merge(left, right, nums);
		System.out.println("merging " + Arrays.toString(left) +  " and " + Arrays.toString(right));
	}
	
	/*
	*	This method takes two sorted arrays, left and right,g
	*   and the original unsorted array. We want to consistently 
	*   sort in place.
	*/
	private static void merge(int[] left, int[] right, int[] nums){
		//variables to keep hold of respective indexes
		int i = 0;
		int z = 0;
		int count = 0;

		//while loop that stops once the end of either the left or right array is hit
		while(i < left.length && z < right.length){

			//if the integer at index 'i' of left is less than that of index 'z' of right, it will replace the original array index with that number
			if(left[i] < right[z]){
				nums[count] = left[i];
				count++;
				i++;
			}

			//vice versa of previous if statement
			else{
				nums[count] = right[z];
				z++;
				count++;
			}
		}

		//originally didn't have this but my code was duplicating numbers and sometimes not merging correctly
		//since the while loop ends when one reaches the end, if the other array hasn't copied all of its numbers over yet, it will do so here
		while(i < left.length){
			nums[count] = left[i];
			i++;
			count++;

		}
		while(z < right.length){
			nums[count] = right[z];
			z++;
			count++;

		}
	}
	
	/*
	*	This method takes a single array, and an inclusive start
	*	and exclusive stop index. It returns the correct portion
	*	of the original array. 
	*/
	private static int[] splitArray(int[] nums, int start, int stop)
	{
		int[] partArray;
		//if the array is an odd number it needs to change the length of one of the halves because otherwise it will throw an exception
		if(nums.length % 2 != 0 && start != 0){
			partArray = new int[nums.length / 2 + 1];
		}
		else{
			partArray = new int[nums.length / 2];
		}
		int count = 0;
		//from count to stop it will copy the numbers over from original array
		for(int i = start; i < stop; i++){
			partArray[count] = nums[i];
			count ++;
		}
		return partArray;
	}
}
