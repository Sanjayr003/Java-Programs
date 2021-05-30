package taskproject;

public class Method {
	
	public void palindrome()
	{
		int number=101,temp,reminder,sum=0;
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
	
	public void fibbo()
	{
		int n1=0,n2=1,n3,i,l=10;
		System.out.println(n1+"\n"+n2);
		for(i=0;i<l;i++)
		{
			n3=n1+n2;
			System.out.println(n3);
			n1=n2;
			n2=n3;
			
		}
	}
	public static void prime()
	{
		int i,c=0,a=19;
		if(a>1)
		{
			for(i=1;i<=a;i++)
			{
				if(a%i==0)
					c++;
			}
			if(c==2)
			{
				System.out.println("Given is Prime Number");
			}
			else
			{
				System.out.println("Given is Not a Prime");
			}
		}
		else
		{
			System.out.println("Only Positive numbers accepted");
		}
	}

	public static void main(String[] args) {
		
		//prime();
		Method met=new Method();
		met.fibbo();
		met.palindrome();

	}

}
