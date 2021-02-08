package com.java.oopConcepts;
import java.io.FileNotFoundException;
import java.io.IOException;

public class PolymorphismException {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
long l;
int i=10;
		A a=new B();// method overriding run by instance type
		a.show(i);
		a.test(0);
	}

}

class A{
//	public void show(int l) throws RuntimeException
//	{
//		System.out.println("int calss");
//	}
	public void show(long l) throws RuntimeException
	{
		System.out.println("long calss");
	}
	public void show(Integer l) throws RuntimeException
	{
		System.out.println("Integer calss");
	}
	public void show(Object l) throws RuntimeException
	{
		System.out.println("Object calss");
	}
	
	public void test()
	{
		System.out.println("In test with zero param...");
	}
	
	public void test(int no)
	{
	System.out.println("In Test with 1 param");	
	}
}

class B extends A
{
	public void show()
	{
		System.out.println("B class");
	}
	}
