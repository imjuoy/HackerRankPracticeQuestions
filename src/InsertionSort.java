
public class InsertionSort {

	
	
	public static void main (String [] args)
	{
		int [] inputArray = {14,13,12,11,10};
		int sortedArray [] = new int [inputArray.length];
		sortedArray = insertionSort(inputArray);
		for(int i=0;i<sortedArray.length;i++)
		System.out.print(sortedArray[i]+", ");
	}
	
	public static int[] insertionSort(int [] input)
	{
		for (int i = 1; i<input.length;i++)
		{
		 int j= i-1;
		  int key = input[i];
		  while (j>=0 && input[j] > key)
		  {
			 input[j+1] = input[j];
			 j=j-1;
			 
		  }
		  input[j+1] = key;
		}
	return input;	
		
	}
	
}
