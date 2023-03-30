package BasicSelenium;

import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class Sample101 {

	public static void main(String[] args) {
//		Integer[] a1={10,20,30,40,50};
//		Integer[] a2={10,60,35,40,50};
//		Set<Integer> set1=new LinkedHashSet(); 
//		set1.addAll(Arrays.asList(a1));
//		
//		Set<Integer> set2=new LinkedHashSet(); 
//		set2.addAll(Arrays.asList(a2));
//		
//		Set<Integer> union=new LinkedHashSet<Integer>(set1); 
//		union.addAll(set2);
//		System.out.print("elements are");
//		System.out.print(" "+union+" ");
//		System.out.println();
//		
//		
//		
//		Set<Integer> intersection=new LinkedHashSet<Integer>(set1); 
//		intersection.retainAll(set2);
//		System.out.print("elements are");
//		System.out.print(" "+intersection+" ");
		
		
		String s1="welcome";
		int no=1;
		for(int i=0;i<s1.length()-1;i++)
		{
			char ch = s1.charAt(i);
			if(ch=='a'|ch=='e'|ch=='i'|ch=='o'|ch=='u')
			{
				System.out.print(ch+" is present");
				no++;
				System.out.println();
			}
			
			
		}
		System.out.println(no);
		
		
		
		
		
		

	}

}
