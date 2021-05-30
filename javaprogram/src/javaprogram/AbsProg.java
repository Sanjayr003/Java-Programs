package javaprogram;

abstract class base
{
	abstract void fun();
	base()
	{
		System.out.println("Constructor 1 Called");
	}
	void run()
	{
		System.out.println("Run program executing");
	}
}

public class AbsProg extends base 
{
	AbsProg()
	{
		System.out.println("Constructor 2 called");
	}
	void fun()
	{
		System.out.println("Fun Program executing");
	}

	public static void main(String[] args) 
	{
		AbsProg ab=new AbsProg();
		ab.run();
		ab.fun();
	}

}
