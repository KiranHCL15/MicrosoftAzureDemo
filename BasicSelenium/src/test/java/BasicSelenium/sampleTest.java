package BasicSelenium;

import org.testng.annotations.Test;
class Car {
	   public void brake() {
	      System.out.println("brake() method of Car");
	   }
	   public final void accelerate() {
	      System.out.println("accelerate() method of Car");
	   }
	   
	}
public class sampleTest extends Car {
	public static void main(String[] args) {
		sampleTest k2=new sampleTest();
		k2.brake();
		k2.accelerate();
	}
	


}
