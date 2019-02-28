package com.Capgemini_java.oops;
class Employee1
{
	private int id;
	private String name;
	private double sal;
Employee1(int id,String name,double sal)
{
	this.id=id;
	this.name=name;
	this.sal=sal;
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public double getSal() {
	return sal;
}
public void setSal(double sal) {
	this.sal = sal;
}

}

public class JavaBean {
	
	public static void main(String[] args) {
		Employee1 e1=new Employee1(123,"abcd",15000);
		int a=e1.getId();
		System.out.println(a);
		String s=e1.getName();
		double d=e1.getSal();
		System.out.println(s);
		System.out.println(d);
		e1.setId(120);
		int b=e1.getId();
		System.out.println(b);
		
		
	
	}

}
