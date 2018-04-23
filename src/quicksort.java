/**
 * 
 * @author subhadeepbhattacharyya
 * Time Complexity:
 * Best Case: When the algo takes the middle element as the pivot.O(nlogn)
 * Worst Case: When the algo takes the smallest/greatest element as the pivot. This means that worst case is when the array is sorted in ascending
 * or descending order. In this case it is O(n^2).
 * Average Case: O(nlogn)
 *
 */

public class quicksort {
	
	public static void main (String [] args)
	{
	int [] input = {4,0,6,5,3,2,1};
	sort(input,0,input.length-1);
	for(int i=0; i< input.length;i++)
		System.out.println(input[i]);
	}
	
	public static void sort(int [] arrayIn, int low, int high)
	{
	  if(low < high)
	  {
		  int pi = partition(arrayIn, low, high);
		  sort(arrayIn,low,pi-1);
		  sort(arrayIn,pi+1, high);
	  }
	}
	
	public static int partition (int [] arr,int low, int high)
	{
	int pivot = arr[high];
	int i=low-1;
	for(int j=low;j< high; j++)
	{
		if(arr[j] <= pivot)
		{	
			i++;
		int temp = arr[i];
		arr[i]= arr[j];
		arr[j]= temp;
	}
	}
	
	int temp = arr[i+1];
	arr[i+1] = arr[high];
	arr[high] = temp;
	
	return i+1;
		
	}

}
