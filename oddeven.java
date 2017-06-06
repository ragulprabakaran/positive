package n4;

import java.util.Scanner;

public class oddeven {
	public static void main(String args[])
	{int a;
	Scanner in=new Scanner(System.in);
	System.out.println("Enter the value of a");
	a=in.nextInt();
	if(a==0)
	{System.out.println("The given no is zero");
	}if(a%2==0){
		System.out.println("The given no is even");
	}if(a%2!=0){
		System.out.println("The given no is odd");
	}else
	{System.out.println("Invalid input");
	}
	}
}
