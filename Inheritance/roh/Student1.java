package roh;

//Extend to marks class.
public class Student1 
{
	
     private int slno;
     private String name,course,faculty;

     public void setData(int slno,String name,String course,String faculty) {
	this.slno=slno;
	this.name=name;
	this.course=course;
	this.faculty=faculty;	
}
    public void showData() {
    	
    	
    
    	System.out.println("Slno :"+slno);
    	System.out.println("Name :"+name);
    	System.out.println("Course :"+course);
    	System.out.println("Faculty :"+faculty);
    }


}
