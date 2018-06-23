package rohit;

public class Wc1 {

	public static void main(String[] args) {
		
		String s1="true";
		String s2="123";
		String s3="10.55";
		String s4="350000000000";
		String s5="Shiva";
		
		//parsing operation
		
		boolean a=Boolean.parseBoolean(s1);//----->public static Boolean.parseBoolean(String value)
		int b=Integer.parseInt(s2);
		
		Integer ob=Integer.valueOf(b);//------>public static Integer.valueOf(String value)
		
		double c=Double.parseDouble(s3);//------>public static Double.parsrDouble(String value)
		Long l=Long.valueOf(s4);//------>public static Long.valueOf(String Value).
		
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(l);
		
		String st=Integer.toString(b);
		System.out.println(st);
		
		
	
	}

}
