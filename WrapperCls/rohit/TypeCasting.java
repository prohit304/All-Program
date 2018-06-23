package rohit;

public class TypeCasting {

	public static void main(String[] args) {
		
		Integer ob1=new Integer(100);
		//Type Casting
		Byte b=ob1.byteValue();//--------->Boxing
		short c=ob1.shortValue();
		System.out.println(ob1);
		System.out.println(b);//--->Unboxing
		System.out.println(c);
		System.out.println(ob1.intValue());//------>Atounboxing
		System.out.println(ob1.doubleValue());

	}

}
