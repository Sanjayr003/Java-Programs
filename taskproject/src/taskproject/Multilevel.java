package taskproject;

class Damaka
{
	int a=20,b=10;
	public void m1()
	{
		System.out.println("M1 is here");
	}
	public void m2()
	{
		System.out.println(a);
	}
}
class Random extends Damaka
{
	void m3()
	{
		System.out.println("M3 is here");
	}
	void m4()
	{
		System.out.println(b);
	}
}

public class Multilevel extends Random
{
	public void run()
	{
		System.out.println("2021");
	}
	public void fun()
	{
		System.out.println(a);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Multilevel ml=new Multilevel();
		ml.m1();
		ml.m2();
		ml.m3();
		ml.m4();
		ml.run();
		ml.fun();

	}

}
