package BasicSelenium;

public class Palindrome {

	public static void main(String[] args) {
		String s1="kiran";
		String s2=new String("kiran");
		s2=s2.intern();
		System.out.println(s1==s2);
	
		

	}

}
