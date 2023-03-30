package BasicSelenium;
class pConstructor
{
	private pConstructor()
	{
		System.out.println("private pConstructor");
	}
	 pConstructor(int a)
	{
		System.out.println("public pConstructor");
	}
}
public class privateConstructor {
	private privateConstructor()
	{
		System.out.println("private Constructor");
	}
	public static void main(String[] args) {
		pConstructor p=new pConstructor(100);
		privateConstructor p2=new privateConstructor();
		
//		p.method();

	}

}
