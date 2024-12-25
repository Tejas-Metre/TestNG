package demo;


import org.testng.annotations.Test;

public class FirstTestngExample {
	
	@Test(enabled=false)
	//@Test
	void login1()
	{
		System.out.println("in login1");
	}
	
	@Test
	void abc()
	{
		System.out.println("in abc");
	}
	
	@Test
	void xyz()
	{
		System.out.println("in xyz");
	}

}
