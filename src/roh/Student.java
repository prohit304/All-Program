package roh;

public class Student 
{
private int id,regdno;
private String name;

public Student() {
	id=0;
	regdno=0;
	name="**";
	
}

public Student(int id,int regdno,String name) {
	this.id=id;
	this.regdno=regdno;
	this.name=name;	
}
public void setId(int id) {
	this.id=id;
}
public int getId() {
	return this.id;
}
public void setRegdno(int regdno) {
	this.regdno=regdno;
}
public int getRegdno() {
	return this.regdno;
}
public void setName(String name) {
	this.name=name;
}
public String getName() {
	return this.name;
}

}
