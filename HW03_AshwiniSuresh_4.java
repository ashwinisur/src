import java.util.*;

public class HW03_AshwiniSuresh_4 {
	public static void main(String[] args) {

	    double input;
	    Scanner scan = new Scanner(System.in);

	    System.out.print("Enter number to convert to binary: ");
	    input = scan.nextDouble();
	    
	    System.out.print(dec2Bin((int)input));
	    /**String s1 = Double.toString(input);
	    String s2 = s1.substring(s1.indexOf('.')+1);
	    String s3 = s1.substring(0,s1.indexOf('.'));
	    String num = s3+s2;
	    String s = dec2Bin(Integer.parseInt(num));
	    String binary = "";
	    for(int i = s.length()-1; i >=0; i--)
	    {
	    	binary += Character.toString(s.charAt(i));
	    }
	    
	    System.out.println(binary);*/
	    }

	public static String dec2Bin(int Value)
		{
			String fin = "";
			if(Value < 2) 
				return fin += Integer.toBinaryString(Value); 
			 
			else 
			{ 
				if(Value != 0) 
				{ 
					dec2Bin(Value/2); 
					fin += Integer.toBinaryString(Value); 
				} 
			} 
			return fin; 
		}
	}

	

