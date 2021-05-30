package javaprogram;

public class Nestedifcontrol {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int marks=101;
		
		if(marks<50)
		{
			System.out.println("Fail");
		}
		else if(marks>=50 && marks<=99)
		{
			System.out.println("Pass");
		}
		else if(marks==100)
		{
			System.out.println("Distiction");
		}

		else
		{
			System.out.println("Invalid data");
		}
	}

}
