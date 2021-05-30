package taskproject;

class Sanjay
{
	void m1()
	{
		System.out.println("M1 is here");
	}
	void m2()
	{
		System.out.println("M2 is here");
	}
}
class Azar extends Sanjay
{
	void m1()
	{
		System.out.println("M3 is here");
	}
	void m2()
	{
		System.out.println("M4 is here");
	}
}
class Balaji extends Sanjay
{
	void m1()
	{
		System.out.println("M5 is here");
	}
	public static void m3()
	{
		System.out.println("M6 is here");
	}
}
public class Hierarchy extends Sanjay{
	
	public static void m4()
	{
		System.out.println("Final M7");
	}

	public static void main(String[] args) {
		//Hierarchy hy=new Hierarchy();
		//hy.m1();
		//hy.m2();
		//Hierarchy.m7();
		//Balaji b=new Balaji();
		//b.m1();
		//b.m2();
		//b.m5();
		//Balaji.m6();
		//Azar az=new Azar();
		//az.m1();
		//az.m2();
		//az.m3();
		//az.m4();
		Sanjay s;
		s=new Sanjay();
		s.m1();
		s.m2();
		Sanjay r=new Azar();
		r.m1();
		r.m2();
		Sanjay b=new Balaji();
		b.m1();
		Balaji.m3();
		Hierarchy.m4();
		
		
		

	}

}
