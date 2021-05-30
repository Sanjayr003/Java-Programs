package taskproject;

import java.util.Scanner;

public class Primenumb {

	public static void main(String[] args) {
		System.out.println("Enter a Number");
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int i,c=0;
		if(a>1)
		{
			for(i=1;i<=a;i++)
			{
				if(a%i==0)
					c++;
			}
			if(c==2)
			{
				System.out.println("Prime Number");
			}
			else
			{
				System.out.println("Not a Prime");
			}
		}
		else
		{
			System.out.println("Only Positive numbers accepted");
		}
	}

}
