
public class ReverseAString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s = "I am in a big mess.";
		
		System.out.println("Reverse a string using stringbuilder");
		
		StringBuilder stringbuilder = new StringBuilder(s);
		System.out.println("Reversed string is:"+stringbuilder.reverse().toString());
		
		System.out.println("Iteratively reverse a string");
		
		StringBuilder stringbuilder1 = new StringBuilder();
		char [] strs = s.toCharArray();
		for (int i = strs.length-1; i>=0;i--)
			stringbuilder1.append(strs[i]);
		System.out.println("Reversed string iteratively is:"+stringbuilder1.toString());
		System.out.println("Recursively reverse a string");
		String reverseString = reverString(s);
		System.out.println("Recursively reverse a string" + reverseString);	
	}
	
	public static String reverString (String insertString)
	{
     if(insertString.length() < 2)
    	 return insertString;
     return reverString(insertString.substring(1)) + insertString.charAt(0);
	}

}
