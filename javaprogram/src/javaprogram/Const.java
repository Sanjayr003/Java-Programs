package javaprogram;

public class Const {
	
	int a=10;
	int b=20;
	int c;
	//int d;
	//float a;
	//char b;
	//String s;
	Const()
	{
		c=a+b;
		System.out.println("Printing C "+c);
		//System.out.println("Int d"+d);
		//System.out.println("Float a"+a);
		//System.out.println("char b"+b);
		//System.out.println("String s"+s);
	}
	void m1()
	{
		int a=10;
		int b=20;
		int c;
		c=a*b;
		System.out.println(c);
	}

	public static void main(String[] args) {
		Const ct=new Const();
		ct.m1();
	}

}
