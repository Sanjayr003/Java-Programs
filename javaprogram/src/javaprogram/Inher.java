package javaprogram;

class Parent
{
	int a=10;
	void method()
	{
		int b=20;
		System.out.println("2020");
		System.out.println(b);
	}
	void print()
	{
		System.out.println("Printing"+a);
	}
}

public class Inher extends Parent
{
	public static void run()
	{
		System.out.println("2021");
	}
	void fun()
	{
		System.out.println("given"+a);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Inher in=new Inher();
		in.method();
		in.fun();
		in.print();
		Inher.run();

	}

}
