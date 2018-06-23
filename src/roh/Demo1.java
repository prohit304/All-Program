package roh;
class Person{
	int age;
	double ht,wt;
	String name;
}

class Demo1
{
	public static void main(String args[])
	{
	 Person p=new Person();
	 p.age=20;
	 p.name="Rohit";
	 p.ht=5.8;
	 p.wt=64;
    
	System.out.println("Name :"+p.name);
	System.out.println("Age  :"+p.age);
	System.out.println("Height :"+p.ht);
	System.out.println("Weight :"+p.wt);
}
}