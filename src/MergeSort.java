
public class MergeSort {

	public static void main (String [] args)
	{
	int [] arr = {54,36,28,90,103,22};
	sort(arr,0,arr.length-1);
	for(int i=0;i<arr.length;i++)
	System.out.println(arr[i]);
	}
	
	public static void sort(int [] inputArray,int l,int h)
	{
	  if(l < h)
	  {
		int mid = (l+h)/2;
		sort(inputArray,l,mid);
		sort(inputArray,mid+1,h);
		
		merge(inputArray,l,mid,h);
	  }
	}
	
	public static void merge(int [] arr, int low, int mid, int high)
	{
      int n1 = mid - low + 1;
      int n2 = high-mid;
      
      int [] firstSubarray = new int [n1];
      int [] secondSubarray = new int [n2];
      for (int i=0; i < n1; i++)
    	     firstSubarray[i] = arr[low+i];
      for(int j=0; j< n2; j++)
    	      secondSubarray[j] = arr[mid+1+j];
      // Initial indexes of first and second subarrays
      int i = 0, j = 0;

      // Initial index of merged subarry array
      int k = low;
      while (i < n1 && j < n2)
      {
          if (firstSubarray[i] >= secondSubarray[j])
          {
              arr[k] = firstSubarray[i];
              i++;
          }
          else
          {
              arr[k] = secondSubarray[j];
              j++;
          }
          k++;
      }

      /* Copy remaining elements of L[] if any */
      while (i < n1)
      {
          arr[k] = firstSubarray[i];
          i++;
          k++;
      }

      /* Copy remaining elements of R[] if any */
      while (j < n2)
      {
          arr[k] = secondSubarray[j];
          j++;
          k++;
      }
      
	}
}
