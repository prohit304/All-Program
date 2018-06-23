package roh;
//Created my me !!!
import java.util.Scanner;
public class Calcultor 
{

	public static void main(String[] args) 
	{
		
		 int ad,sub,mul,opt;
		double div;
		int x,y;
		
		Scanner c=new Scanner(System.in);
		System.out.println("Enter x and y values");
		x=c.nextInt();
		y=c.nextInt();
		 
		while(true)

            {

                System.out.println("Enter opetion for u r choise 1(addition),2(substration),3(multliplication),4(divison),5(exit)");
               /** System.out.println("Enter 2 for subtraction");
                System.out.println("Enter 3 for multiplication");
                System.out.println("Enter 4 for division");
                System.out.println("Enter 5 to Exit");*/
                  opt = c.nextInt();
                  
                  switch(opt)
   			 {
                	  case 1:
                		  ad=x+y;
                		  System.out.println(ad);
                		  break;
                		  
                	  case 2:
                		  sub=x-y;
                		  System.out.println(sub);
                		  break;
                	  case 3:
                		  mul=x*y;
                		  System.out.println(mul);
                		  break;
                	  case 4:
                		  div=(double) x/y;
                		  System.out.println(div);
                		  break;
                	  case 5:
                	  System.exit(0);
                	  
			 }
			
		
		
		
	}

	}

	
}