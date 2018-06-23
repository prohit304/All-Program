package roh;

public class Employee 
{
	private int id,age;
	private String name;
	private double salary;
	
	public Employee() {
		id=0;
		age=0;
		name="";
		salary=0;
	}
    
	public Employee(int id) {
		this.id=id;
		age=0;
		name="";
		salary=0;
	}
	
	public Employee(int id,int age) {
		this.id=id;
		this.age=age;
		name="";
		salary=0;
	}
	
	public Employee(int id,int age,String name) {
		this.id=id;
		this.age=age;
		this.name=name;
		salary=0;
	}
	
	public Employee(int id,int age,String name,double salary) {
		this.age=age;
		this.id=id;
		this.name=name;
		this.salary=salary;
	}
	public void ShowEmployee() {
		System.out.println(id);
		System.out.println(name);
		System.out.println(age);
		System.out.println(salary);
	}
}
