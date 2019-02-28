package com.Capgemini_java.oops;
import java.util.Scanner;
public class AvgArray {
	public static void main(String[] args) {
	/*int a[];
	a=new int[4];
	a[0]=10;  a[3]=30;	a[2]=20;	a[1]=5;
	double sum=0;
	for(int i=0;i<4;i++){
		sum=sum+a[i];	}
	double avg=sum/4;
	System.out.println("Average is: "+avg);*/
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
		double sum=0;
		for(int i=0;i<size;i++)
		{
			sum=sum+a[i];
		}
		double avg=sum/size;
		System.out.println("Average is: "+avg);
}
}
