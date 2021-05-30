package javaprogram;

interface first
{
	void m1();
	int a=10;
	int h=20;
	char b='c';
	String s="Hiee";
}
interface second
{
	void m2();
	int f=20;
}

public class Inter implements first,second {
	public void m1()
	{
		int ch;
		ch=a+h;
		System.out.println(ch);
		System.out.println("M1 char is here"+b);
		System.out.println("M1 String is here"+s);
		System.out.println("M2 called in M1"+f);
	}
	public void m2()
	{
		System.out.println("M1 called in M2"+s);
		System.out.println("M2 f is here"+f);
	}

	public static void main(String[] args) {
		Inter as=new Inter();
		//as.m1();
		as.m2();

	}

}
