package roh;

import java.util.Scanner;

//Example on user defined Methods

public class Ex17
{
 static void Exc(int i,int j)
 {           
	 i=i+j;
	 j=i-j;
	 i=i-j;    
	 System.out.println("After Swaping value of X :"+i);
	 System.out.println("After Swaping vallue of Y :"+j);
 }
	public static void main(String[] args) 
	{
		int x=0,y=0;
		Scanner sw=new Scanner(System.in);
		System.out.print("Enter the x  value:");		
		x=sw.nextInt();
		System.out.print("Enter the y value :");
		Scanner sww=new Scanner(System.in);
		y=sww.nextInt();
		Exc(x,y);                                                                    
	}

}
 