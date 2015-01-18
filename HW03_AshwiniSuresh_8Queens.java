import java.util.*;

public class HW03_AshwiniSuresh_8Queens {
	public static int num;
	public static String board = "";
	public static ArrayList<String> sList = new ArrayList<String>(num);
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		System.out.println("Enter number of queens: ");
		num = in.nextInt();
		String a = Integer.toString(num);
		displayQueens(a);
		
		for (int j = 0; j <sList.size(); j++)
	    {
	    	System.out.println(sList.get(j));
	    }
	}
	
	public static void displayQueens (String s)
	{
		for (int i = 0; i < num-1; i ++)
		{
			board += "*";
		}
		
		board += s;
		displayQueens("", board);
		for (int j = 0; j <sList.size(); j++)
	    {
	    	for(int i = 0; i < j; i++)
	    	{
	    		if ((sList.get(i)).equals(sList.get(j)))
	    			sList.remove(i);
	    	}
	    	
	    }
		
	}
	
	public static void displayQueens (String s1, String s2)
	//helper method, uses a loop to move a character from s2 to s1 and recursively 
	//invokes it with a new s1 and s2. The base case is that s2 is empty and print
	//s1 to the console.
	{
	    if (s2.length() == 0) 
	    {
	    	sList.add(s1);
	    }
	    else 
	    {
	        for (int i = 0; i < s2.length(); i++)
	        	displayQueens(s1 + s2.charAt(i), s2.substring(0, i) + s2.substring(i+1, s2.length()));
	    }
	    
	}

}
