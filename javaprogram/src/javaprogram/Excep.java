package javaprogram;

public class Excep {

	public static void main(String[] args) {
		int a=10,b=0,c=0;
		int r;
		
		try
		{
			r=a/(b-c);
			System.out.println(r);
		}
		catch(Exception e)
		{
			System.out.println("Hello");
		}
		finally
		{
			System.out.println("Finally running");
			r=a/(b-c);
		}

	}

}
