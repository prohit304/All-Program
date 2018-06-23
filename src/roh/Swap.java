package roh;

import java.util.Scanner;

public class Swap
{
	

	public static void main(String[] args) 
	{                                        
		Scanner sw  = new Scanner(System.in);
		System.out.println("Enter two values x,y for Swaping");
		int x=sw.nextInt();
		Scanner sww = new Scanner(System.in);
		int y=sww.nextInt();
		
		x=x+y;
		y=x-y;
		x=x-y;
		
		System.out.println("After Swaping value of x is :"+x);
		System.out.println("After Swaping value of y is :"+y);

	}

}



