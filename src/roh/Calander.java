package roh;

public class Calander
{
	
private int y,m,d,hr,min,sec;

public void setData(int y,int m,int dt,int h,int mi,int s) {
	this.y=y;
	this.m=m;
	this.d=dt;
	hr=h;
	min=mi;
	sec=s;
}
public void showData() {
	//System.out.println(y+":"+m+":"+d+"  "+hr+":"+min+":"+sec);
	System.out.printf("%02d-%d-%d %2d:%02d:%02d \n",this.d,this.m,this.y,hr,min,sec);
	/**System.out.println(month);
	System.out.println(date);
	System.out.println(hr);
	System.out.println(min);
	System.out.println(sec);
*/
}
}
