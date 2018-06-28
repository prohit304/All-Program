
import java.util.Scanner;
import java.util.InputMismatchException;
public class Exc1 {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int x,y,res;
		
		try {
			System.out.println("Enter X and Y value :");
			x=in.nextInt();
			y=in.nextInt();
			res=x/y;
          System.out.println("Divisen is : "+res);
		}catch(ArithmeticException ar) {
			System.out.println("Y is 0");
		}
		catch (InputMismatchException ime) {
			System.out.println("Invalid Number Entered");
		}

	}

}
