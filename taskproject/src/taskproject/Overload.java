package taskproject;

public class Overload {
	
	public void program(int number)
	{
		int temp,reminder,sum=0;
		temp=number;
		while(number>0)
		{
			reminder=number%10;
			sum=(sum*10)+reminder;
			number=number/10;
			
		}
		if(temp==sum)
		{
			System.out.println("Palindrome");
		}
		else
		{
			System.out.println("Not a Palindrome");
		}

	}
	

	public static void program(String str1, String str2)
	{
		System.out.println("Before Swapping "+str1+" and "+str2);
		str1=str1+str2;
		str2=str1.substring(0,str1.length()-str2.length());
		str1=str1.substring(str2.length());
		System.out.println("After Swapping "+str1+" and "+str2);
	}



	public static void main(String[] args) {
		Overload met=new Overload();
		met.program(101);
		program("Sanjay","Ram");

	}

}
