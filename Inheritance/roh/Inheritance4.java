package roh;
import java.util.*;
public class Inheritance4 {
//using MOd class and Scanner class taking inputs from user and printing that in to Inhertance class
		public static void main(String args[]) 
		{  
			Mod m=new Mod();
			Scanner sc=new Scanner(System.in);
			
			System.out.println("Enter X and Y value");
			
			 m.setX(sc.nextInt());
			 m.setY(sc.nextInt());
		 
	   
		
	    System.out.println("********MANU***********");
		System.out.println("1 for Addition");   
		System.out.println("2 for Substaraction");  
		System.out.println("3 for Product");
		System.out.println("4 for Divison");   
		System.out.println("5 for Mod");               
		System.out.println("6 for EXIT");
		System.out.println("**********************");
		int opt=sc.nextInt();
		
		switch(opt)             
		{
		case 1:
			Addition su=new Addition();
			su.compute(m.getX(),m.getY());
			
			break;
			
		case 2:
			Substaract sub=new Substaract();
			sub.compute1(m.getX(),m.getY());
			break;
		case 3:
			 Product1 pro=new Product1();
			pro.compute2(m.getX(),m.getY());
			break;
		case 4:
			Divison div=new Divison();    
			div.compute3(m.getX(),m.getY());
			break;
			
		case 5:
			Mod mo=new Mod();
			mo.compute4(m.getX(),m.getY());
			break;
		case 6:
			System.exit(0);
			
		
		}
		
		
main(null);
	}

}
