
import java.util.*;
public class Excp {
	public static void main(String args[]) {
		
			Scanner ob=new Scanner(System.in);
		System.out.println("Enter Two Number for X and Y :");
		int x=ob.nextInt();
		int y=ob.nextInt();
		int sum=x+y;
		System.out.println("Sum is :"+sum);
		try {
		int div=x/y;
		System.out.println("Divison Is :"+div);
		}catch(ArithmeticException ae) {
			System.out.println("Please Enter Valid Y value :");
			y=ob.nextInt();
			System.out.println("Div is"+x/y);
			
		}
		}
	
	

}
