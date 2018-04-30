package DataStructures;
/*This is the bubble sort algorithm. It checks every element of the array and then swaps them in place
 * sorting is required. 
 * Time complexity of the algorithm will depend on its implementation.
 * If done using recursion,
 * Time Complexity : O(n)
 * Space complexity : O(n)
 * 
 * If done using two loops:
 * Time Complexity : O(n2)
 * Space Complexity: O(n)
 */


public class BubbleSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       int [] inputArray = {5,4,3,2,1};
       for(int i=0; i< inputArray.length-1;i++)
       {
    	   for(int j=0;j< inputArray.length-i-1;j++)
    	   {
    		if(inputArray[j] > inputArray[j+1])
    		{
    			int temp = inputArray[j];
    			inputArray[j] = inputArray[j+1];
    			inputArray[j+1] = temp;
    		}
    	   }
	}
       for(int i=0;i< inputArray.length; i++)
       System.out.print(inputArray[i]);
     
       System.out.println("");
       int [] secondInputArray = {5,4,2,1,3};
       bubbleSort(secondInputArray,secondInputArray.length);
       for(int i=0;i< secondInputArray.length; i++)
           System.out.print(secondInputArray[i]);

}
	
	  // A function to implement bubble sort recursively
    static void bubbleSort(int arr[], int n)
    {
        // Base case
        if (n == 1)
            return;
      
        // One pass of bubble sort. After
        // this pass, the largest element
        // is moved (or bubbled) to end.
        for (int i=0; i<n-1; i++)
        {
            if (arr[i] > arr[i+1])
            {
                // swap arr[i], arr[i+1]
                int temp = arr[i];
                arr[i] = arr[i+1];
                arr[i+1] = temp;
            }
      
        // Largest element is fixed,
        // recur for remaining array
        bubbleSort(arr, n-1);
    }
   }
    
}
