package taskproject;

public class Marvel {
	Marvel(int a, String b)
	{
		int q=10,c;
		c=a+q;
		System.out.println("A is "+a);
		System.out.println("B is "+b);
		System.out.println(c);
	}
	void m1(int as,String m)
	{
		System.out.println(as);
		System.out.println(m);
	}

	public static void main(String[] args) {
		Marvel mv=new Marvel(15,"Hiee");
		mv.m1(100, "Sanjay");

	}

}
