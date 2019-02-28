package com.Capgemini_java.oops;
class Pen{
	
}
class Book{
	
}
public class Stationary {
	public Pen getpen()
	{
		System.out.println("get pen");
		return new Pen();
	}
	public Book getbook()
	{
		System.out.println("get book");
		return new Book();
	}
}
class Student1{
	public void takenotes()
	{
		System.out.println("student takes notes");
	}
}
class Program9
{
	public static void main(String[] args) {
		Stationary s=new Stationary();
		Pen p=s.getpen();
		System.out.println(p);
		Book b=s.getbook();
		System.out.println(s);
		Student1 s1=new Student1();
		s1.takenotes();
				
	}
}
