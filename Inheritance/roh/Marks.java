package roh;
//Extending Student1 class and using in Inheritance3 class
public class Marks extends Student1{
	
	private int test1,test2,test3,tot;
	private double avg;
	
	public void setMarks(int test1,int test2,int test3) {
		this.test1=test1;
		this.test2=test2;
		this.test3=test3;
	}
	private void compute() {
		tot=test1+test2+test3;
		avg=tot/3;
	}
	public void showResults() {
		 showData();
		 compute();
		 System.out.println("Total :"+tot);
		 System.out.println("avg :"+avg);
	}

	
	
}
