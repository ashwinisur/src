import java.util.*;

public class HW03_AshwiniSuresh_2 {

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
		
		char c = value.charAt(value.length()-1);
		if(value.length() == 1)
			s += value;
		else
			{
			s += c;	
		reverseDisplay(value.substring(0,value.length()-1));
			}
	}
}
