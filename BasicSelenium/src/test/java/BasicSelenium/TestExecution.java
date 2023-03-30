package BasicSelenium;

//import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestExecution {

	public static void main(String[] args) {
		int[] arr1={1,10,2,2,10,3,3,3,4,5,5};
//		int [] arr2={};
		
		int n=arr1.length;
		int temp[] =new int[]{};;
		int j=0;
		for(int i=0;i<n-1;i++)
		{
			System.out.print(arr1[i]+" ");
			if(arr1[i]!=arr1[i+1])
			{
				temp[j]=arr1[i];
				j++;
//			}else
//			{
//				System.out.println("equal");
//				
//			}
		}
//		for(int i=0;i<n-1;i++)
//		{
//			if(arr1[i]!=arr1[i+1])
//			{
//				temp[j]=arr1[i];
//				j++;
//			}
//			temp[j]=arr1[n-1];
//		}
		

	}
	}

}
