package com.om;
interface A
{
public abstract void m1();
abstract public void m2();
static void m3()
{
	System.out.println("hiii");
}

}
class Child implements A
{

	@Override
	public void m1() {
	
	System.out.println("it is m1");	
	}

	@Override
	public void m2() {
		System.out.println("it is m2");	
		
	}}

public class Testintr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Child c1=new Child();
		c1.m1();c1.m2();
		A.m3();
	}

}