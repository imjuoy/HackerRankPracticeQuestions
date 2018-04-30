package DataStructures;

public class GreatestCommonDivisors {

	public static int findGCD( int a, int b)
	{
     if(b == 0)
    	 return a;
     else
    	 return findGCD(b,a%b);
	}
	
	
	public static void main(String[] args) {
		int num1 = 24;
		int num2 = 45;
		int gcd = findGCD(num1,num2);
		System.out.println(gcd);

	}

}
