/**
 * 
 * @author subhadeepbhattacharyya
 * Space complexity = O(1)
 * Time complexity = O(n)
 */

public class Fibonacci_WithoutExtraSpace {

	public static void main (String [] args)
	{
		int n =23;
		System.out.println(fibonacci(n));
	}
	
	public static int fibonacci(int n)
	{
		int a=0;
		int b = 1;
		int c = 0;
		for(int i=2;i<=n;i++)
		{
		 c = a + b;
		 a=b;
		 b=c;
		}
		return c;
	}
}
