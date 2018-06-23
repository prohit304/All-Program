package roh;
import java.util.*;
public class PaySlip {

	public static void main(String[] args) {
		
		Pay ad=new Pay();
		Scanner sc=new Scanner(System.in);
		
		System.out.print("Enter JOb Of Employee :");
		ad.setJob(sc.nextLine());
		
		System.out.print("Enter Name of Emp : ");
		ad.setName(sc.nextLine());
		
		System.out.print("Enter adress of Emp :");
		ad.setAdress(sc.nextLine());
		
		System.out.print("Enter Employee ID :");
		ad.setId(sc.nextInt()); 
		
		System.out.print("Enter Basic Salary of Employee :");
		ad.compute(sc.nextInt());
		

		 
		 

	}

}
