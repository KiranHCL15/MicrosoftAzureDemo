package BasicSelenium;

import org.testng.annotations.Test;

public class groupsDemo {
	@Test(groups={"smoke"})
	public void test1()
	{
		System.out.println("smoke tests are executing");
	}
    @Test
	public void test2()
	{
		System.out.println("sample test");
	}
	@Test(groups={"regression"})
	public void test3()
	{
		System.out.println("regression tests are executing");
	}
}
