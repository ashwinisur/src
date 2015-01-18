import java.util.*;
public class HW03_AshwiniSuresh_3 {

	public static String s = "";
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		System.out.println("Enter a word: ");
		String word = in.next();
		reverseDisplay(word);
		System.out.print(s);
	}
	
	public static void reverseDisplay(String value)
	{
		reverseDisplay(value, value.length()-1);
	}
	
	public static void reverseDisplay(String value, int high)
	{
		
		char c = value.charAt(high);
		//System.out.println(c);
		if(high == 0)
			s += value;
		else
			{
			s += c;	
			
			reverseDisplay(value.substring(0,high), high-1);
			}
	}
}
