package rohit;

public class Wc5 {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		Integer ob1 = new Integer(100);
		int a=ob1.intValue();//------->old style of Boxing
		int b=ob1;
		System.out.println(a);
		System.out.println(b);
		
		ob1++;    //--------->AutoUnboxing
		/*int x=ob1.intValue
		 * x++;
		 * ob1=new Integer(x)
		*/
	
		for(ob1=1;ob1<=10;ob1++) {
			System.out.println(ob1);
		}


	}

}
