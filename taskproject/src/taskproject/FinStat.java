package taskproject;

public class FinStat {
	final int a=20;
	static String s="sanjay";
	int b=25;
	void fun()
	{
		int a=1;
		//static String s="sanjay";
		//String s="abcd";
		System.out.println("Fun"+a);
		System.out.println(s);
	}

	public static void main(String[] args) {
		FinStat as=new FinStat();
		as.fun();
		//String s="Apple";
		int a=10,b=3,c;
		c=a+b;
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(s);

	}

}
