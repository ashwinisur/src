import java.util.*;

public class BinarytoDecimal {
	
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		System.out.println("Enter a binary digit: ");
		String s = in.next();
		System.out.println(bin2Dec(s));
	}

	public static String bin2Dec(String binaryString)
	{
		String fin = "";
		int a = Integer.parseInt(binaryString);
		if(binaryString.equals("0")) 
			return fin += (double)Integer.parseInt(binaryString, 2); 
		 
		else 
		{ 
			if(!binaryString.equals("0")) 
			{ 
				a = a/10;
				bin2Dec(Integer.toString(a)); 
				fin += (double)Integer.parseInt(binaryString, 2); 
			} 
		} 
		
		return fin;
	}
}
