
public class Fibonacci_DynamicProgramming {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=0;
		System.out.println(fibonacci(n));

	}
	
	public static int fibonacci(int n)
	{
	 int [] result = new int[n+2]; // This is used to store the first two numbers in fibonacci
	 result[0] = 0;
	 result[1] = 1;
	 for(int i=2;i<=n;i++)
		 result[i] = result[i-1] + result[i-2];
	 return result[n];
	}

}
