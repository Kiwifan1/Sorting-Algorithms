import java.util.Arrays;


public class SortTester {
	public static void main(String[] args) {
		 int[] testingArray = randomArray(11, 6);
		 MergeSort.sort(testingArray);
		 System.out.println("Result: " + Arrays.toString(testingArray));
	}
	
	/*
	*	This method takes two integers size and n, 
	*	and returns an array of random integers from -n to n
	*   inclusive. 
	*/
	public static int[] randomArray(int size, int n)
	{
		int[] testingArray = new int[size];
		for(int i = 0; i < size; i++){
			int rand_num = (int)(Math.random() * (2*n+1)) - n;
			testingArray[i] = rand_num;
		} 
		return testingArray;
	}

}
