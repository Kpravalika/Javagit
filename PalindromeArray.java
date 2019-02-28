package com.Capgemini_java.oops;
import java.util.Scanner;
public class PalindromeArray {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int a[];
		System.out.println("Enter the size of the array");
		int size=sc.nextInt();
		a=new int[size];
		for(int i=0;i<a.length;i++)
		{
			System.out.println("enter the value at "+i+ " position");
			a[i]=sc.nextInt();	
		}
		System.out.println("the values are :");
		for(int i=0;i<size;i++)
		{
			System.out.print(a[i]);
		}	
		System.out.println(" ");
		int count=0;
		int in=a.length-1;
		for(int i=0;i<a.length/2;i++)
		{
			if(a[i]==a[in])
			{
				count++;
				in--;
			}
		}
		if(count==a.length/2)
			
		{
			System.out.println("it is palindrome");
		}
		else
		{
			System.out.println("it is not palindrome");
		}
	}

}
