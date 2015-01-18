import java.util.*;

public class MultiplePermutations {
	
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		System.out.println("Enter a word: ");
		String s = in.next();
		displayPermutations(s);
	}
	
	public static void displayPermutations (String s)
	{
		String blank = "";
		displayPermutations("",s);
	}
	
	public static void displayPermutations (String s1, String s2)
	//helper method, uses a loop to move a character from s2 to s1 and recursively 
	//invokes it with a new s1 and s2. The base case is that s2 is empty and print
	//s1 to the console.
	{
	    if (s2.length() == 0) 
	    	System.out.println(s1);
	    else 
	    {
	        for (int i = 0; i < s2.length(); i++)
	            displayPermutations(s1 + s2.charAt(i), s2.substring(0, i) + s2.substring(i+1, s2.length()));
	    }
	}

}
