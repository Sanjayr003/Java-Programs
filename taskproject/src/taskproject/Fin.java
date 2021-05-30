package taskproject;

class abc
{
	final int a=1;
	void fun(int a)
	{
	
		System.out.println(a);
	}
	
	}

public class Fin extends abc
{
	final int a=30;
	void fin()
	{
		System.out.println(a);
	}

	public static void main(String[] args) 
	{
		Fin ab=new Fin();
		ab.fun(10);
		ab.fin();

	}

}
