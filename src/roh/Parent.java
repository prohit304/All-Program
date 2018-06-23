package roh;

public class Parent {
int x=10;
static int y=20;
	public static void compute(int y) {
		y=20;

		System.out.println(" non Static  "+y);
	}

	public  void compute1(int g) {
		y=30;
		x=10;
		System.out.println("Static "+y);
		
	}
}



//parent <----this---> parent  
//child <------this------> child
//parent <-------super---------> child