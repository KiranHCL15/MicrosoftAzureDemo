package BasicSelenium;
import java.util.*;


public class ArrayList {
	public static void main(String[] args) {
		
//		HashMap<String,Integer>  h1=new HashMap<String,Integer>();	
//		h1.put("kiran",1);
//		h1.put("HCl",2);
//		h1.put("Ghorpade",3);
//		h1.put("Pune",4);
		
//		Collections.sort(h1);
//		System.out.println(h1);
		
		LinkedHashMap<String,Integer>  h1=new LinkedHashMap<String,Integer>();	
		h1.put("kiran",1);
		h1.put("HCl",2);
		h1.put("Ghorpade",3);
		h1.put("Pune",4);
		
//		Collections.sort(h1);
		System.out.println(h1);
		
		List<Integer>  h2=new java.util.ArrayList<Integer>();	
		h2.add(10);
		h2.add(4);
		h2.add(34);
		h2.add(2);
		Collections.sort(h2);
		System.out.println(h2);
		
	}

}
