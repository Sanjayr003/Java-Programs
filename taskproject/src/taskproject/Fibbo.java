package taskproject;

import java.util.Scanner;

public class Fibbo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int n1=0,n2=1,n3,i,l;
System.out.println("Enter Length");
Scanner sc=new Scanner(System.in);
l=sc.nextInt();
System.out.println(n1+"\n"+n2);
for(i=0;i<l;i++)
{
	n3=n1+n2;
	System.out.println(n3);
	n1=n2;
	n2=n3;
	
}
	}

}
