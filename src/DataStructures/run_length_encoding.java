package DataStructures;

public class run_length_encoding {
	
	public String runLengthEncoding(String text) {
	    String encodedString = "";

	    for (int i = 0, count = 1; i < text.length(); i++) {
	        if (i + 1 < text.length() && text.charAt(i) == text.charAt(i + 1))
	            count++;
	        else {
	            encodedString = encodedString
	                    .concat(Character.toString(text.charAt(i))).concat(Integer.toString(count));
	            count = 1;
	        }
	    }
	    return encodedString;
	}
	
	public static void main (String [] args)
	{
	 run_length_encoding a = new run_length_encoding();
	 String result =  a.runLengthEncoding("abcd");
	 System.out.println(result);
	}
}
