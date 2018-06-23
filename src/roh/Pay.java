package roh;

public class Pay extends Emp{
	
	
	double hra,ta,pf,pt,et,gs,ns;
	
	
	
	

	
	public void compute(int bs) {
		hra=bs*40/100;
		ta=bs*0.2;
		pf=bs*0.1;
		et=bs*0.05;
		pt=bs*0.05;
		gs=bs+hra+ta+et;
		ns=gs+pf+pt;
		
		System.out.println("House Rent Allowance  :"+hra);
		System.out.println("Travelling Allowance :"+ta);
		System.out.println("Provident Fund :"+pf);
		System.out.println("Profession Tax :"+pt);
		System.out.println("Et :"+et);
		System.out.println("Gross Salary :"+gs);
		System.out.println("Net Salary :"+ns);
	}








	
	

}
