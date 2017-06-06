package positive;
import java.util.*;
public class positive {
		public static void main(String args[])
		{
		int no;
		Scanner in=new Scanner(System.in);
		System.out.println("Enter the number");
		no=in.nextInt();
		if(no==0)
		{
		System.out.println("The given no "+no+" is zero");
		}
		if(no>0)
		{
		System.out.println("The given no "+no+" is positive");
		}
		if(no<0)
		{
		System.out.println("The given no "+no+" is negative");
		}
		}
		}

