package javaprogram;

public class Overload {
	
	public void display(int a)
	{
		System.out.println("A is "+a);
	}
	public void display(char b)
	{
		System.out.println("B is "+b);
	}
	public void display(String c)
	{
		System.out.println("C is "+c);
	}
	public static void display(int d,char e)
	{
		System.out.println("D is "+d+"and E is "+e);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Overload met=new Overload();
		met.display(10);
		met.display('a');
		met.display("String");
		display(20,'b');

	}

}
