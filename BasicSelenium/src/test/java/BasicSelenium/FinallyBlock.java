package BasicSelenium;

import org.bouncycastle.asn1.cmp.ProtectedPart;

public class FinallyBlock {

	public static void test()
	{
		System.out.println("started");
		try{
		int a=1/2;
		}
		catch(Exception e)
		{
			System.out.println(e);
			System.out.println("exception is handled");
		}
	finally
	{
		System.out.println("finally block");
	}
}
	public static void main(String[] args) {
		test();
	}

}
