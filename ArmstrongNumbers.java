package cts.basics;

import java.util.Scanner;

public class ArmstrongNumbers {

	public static void main(String[] args) {
	
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number");
		int a=sc.nextInt();
		int r,sum=0;
		int b=a;
		while(a!=0)
		{
			r=a%10;
			sum=sum+(r*r*r);
			a=a/10;
		}
		
		
		if(sum==b) {
			System.out.println("armstrong number");
		}
		else
			System.out.println("not armstrong number");
		
		
	
	}

}
