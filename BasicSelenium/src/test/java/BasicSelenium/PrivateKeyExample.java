package BasicSelenium;
class Private
{
	private int x=10;
	public int get()
	{
		return x;
	}
	
	public void set(int num)
	{
		this.x=num;
	}
	
}
public class PrivateKeyExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Private p=new Private();
		int value=p.get();
		System.out.println(value);
		p.set(20);
		System.out.println(p.get());
		

	}

}
