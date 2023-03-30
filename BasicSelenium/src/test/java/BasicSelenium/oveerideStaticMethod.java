package BasicSelenium;
class abcd1
{
	public static void method()
	{
		System.out.println("static method 1");
	}
}
class abcd2 extends abcd1
{
	public void method1()
	{
		System.out.println("static method 2");
		
	}
}
public class oveerideStaticMethod {

	public static void main(String[] args) {
		abcd2 s1=new abcd2();
		s1.method();
	}

}
