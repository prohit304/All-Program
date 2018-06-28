package rohit;


import java.util.*;
import java.util.InputMismatchException;
public class Exc1 {

	public static void main(String[] args) {

		Scanner in=new Scanner(System.in);
		int x,y,res;
		
		try {
			System.out.println("Enter X,y value");
			x=in.nextInt();
			y=in.nextInt();
			res=x/y;
			System.out.println("Divison is :"+res);
		}catch(ArithmeticException ae) {
			System.out.println("Enter Y is zero !");
			
		}
		catch (InputMismatchException ime) {
			System.out.println("Enter valid Number");
		}


	}

}
