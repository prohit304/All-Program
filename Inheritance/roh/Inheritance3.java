package roh;

import java.util.Scanner;
//using marks class object
public class Inheritance3{
public static void main(String args[])

{
	Marks m=new Marks();
	/*m.setData(11,"Rohit","java","Mr.Shiva");
	m.setMarks(125,256,698);*/
int m1=7,m2=7,m3=7;
Scanner sc=new Scanner(System.in);
int id=sc.nextInt();
String nn=sc.nextLine();
String name=sc.nextLine();
String course=sc.nextLine();
String fac=sc.nextLine();

sc.hasNext();
m.setData(id, name, course, fac);                                         
m.setMarks(m1, m2,m3);
m.showResults();   
       }
}    