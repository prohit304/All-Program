package roh;
import java.util.Scanner;

public class Ex18 {
static  boolean isprime (int n)
{
	int c=0;
	for(int i=1;i<=n;i++)
	{
	if (n%i==0)
		c++;
	}
	if (c==2)
		return true;
	else
		return false;
				}
	public static void main(String[] args)
	{
		Scanner in=new Scanner(System.in);
		System.out.println("Enter n value :");
		int n=nextInt();
		boolean res=isprime(n);
		System.out.println("IS prime"+res);
}
	private static int nextInt() {
		
		return 0;
	}
		

	}


