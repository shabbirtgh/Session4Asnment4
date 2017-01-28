package Package1;

public class Assignment4 {

	public static void main(String[] args) 
	{
		C1 c = new C1();

	}

}

class A1
{
	A1()
	{
		System.out.println("Super class constructor");
		
	}
	public void test()
	{
		System.out.println("Test method called from Grand child class ");
	}
}
class B1 extends A1
{
	B1()
	{
		System.out.println("Child class constructor");
	}
}
class C1 extends B1
{
	C1()
	{
		System.out.println("Grand Child class constructor");
		super.test();
	}
}