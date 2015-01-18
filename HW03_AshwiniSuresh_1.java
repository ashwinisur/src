import java.util.*;

public class HW03_AshwiniSuresh_1 {
	public static double sum = 0;
	
	public static void main(String[] args)
	{
		System.out.println(sumSeries(10));
	}
	
	public static double sumSeries(double high)
	{
		if(high == 1)
			return sum += 1.0;
		else
		{
			
			return sum = (1/high) + sumSeries(high-1);
		}
	}
	
}
