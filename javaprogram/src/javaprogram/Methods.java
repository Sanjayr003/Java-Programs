package javaprogram;

public class Methods {
	
	public void firstmet() 
	{
		int a=10;
		System.out.println(a);
	}
	public void secmet()
	{
		int a=10,b=20,c;
		c=a+b;
		System.out.println(c);
	}
	public static void thirdmet()
	{
		int d=40;
		System.out.println(d);
	}

	public static void main(String[] args) {

		Methods met=new Methods();
		met.firstmet();
		met.secmet();
		thirdmet();
	}

}
