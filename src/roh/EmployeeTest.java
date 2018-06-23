package roh;

public class EmployeeTest {

	public static void main(String[] args) 
	{
		System.out.println("======================================================");
		System.out.println("Employee Details");
		Employee e=new Employee(100,4565);
		e.ShowEmployee();
		
		Employee e1=new Employee(990,852,"Rohit");
		e1.ShowEmployee();
		
		Employee e2=new Employee(7530,2,"Xyz",25200.20);
		e2.ShowEmployee();
		
		Employee e3=new Employee(9521);
		e3.ShowEmployee();
		
        System.out.println("======================================================");
	}

}
