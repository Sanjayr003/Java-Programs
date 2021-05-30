package taskproject;

public class ConstOver 
{
	int ab=100;
	char ac='s';
	String s="Hiee";
	ConstOver(int a, String b)
	{
		int c=01,d;
		d=a-c;
		System.out.println("A is here "+a);
		System.out.println("B is here "+b);
		System.out.println("SUB"+d);
	}
	ConstOver(char c, String az)
	{
		System.out.println(c);
		System.out.println(az);
	}
	void m1()
	{
		System.out.println(ab);
		System.out.println(ac);
		System.out.println(s);
	}

	public static void main(String[] args) {
		ConstOver co=new ConstOver(100,"Print Me");
		ConstOver cx=new ConstOver('z',"Second Print");
		co.m1();
		//cx.m1();

	}

}
