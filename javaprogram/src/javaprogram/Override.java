package javaprogram;

class Mride 
{
	public void method1()
	{
		int a=10,b=20,c;
		c=a+b;
		System.out.println("a is of"+c);
	}
	public void method2()
	{
		int a=10,b=20,c;
		c=a-b;
		System.out.println("sub is"+c);
	}
	
}
class Override extends Mride
{
	public void method1()
	{
		int a=30,b=40,c;
		c=a*b;
		System.out.println("Mul is"+c);
	}
	public static void method3()
	{
		int a=40,b=20,c;
		c=a/b;
		System.out.println("Div is"+c);
	}
	

	public static void main(String[] args) {
		//Override mn=new Override();
		//mn.method1();
		//mn.method2();
		//Override.method3();
		Mride oc=new Mride();
		oc.method1();
		oc.method2();
		Mride r=new Override();
		r.method1();
		Override.method3();

	}

}
