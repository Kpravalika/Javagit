package com.Capgemini_java.oops;
import java.util.Scanner;
public class Array {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int a[];
		System.out.println("Enter the size of the array");
		int size=sc.nextInt();
		a=new int[size];
		for(int i=0;i<size;i++)
		{
			System.out.println("enter the marks at "+i+" position");
			a[i]=sc.nextInt();	
		}
		System.out.println("the values are :");
		for(int i=0;i<size;i++)
		{
			System.out.println(a[i]);
		}	
	}
}
