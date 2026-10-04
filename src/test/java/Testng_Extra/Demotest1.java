package Testng_Extra;

import org.junit.Assert;
import org.testng.annotations.Test;

public class Demotest1 {
   @Test()
	
	public void Demotest(){
		
		Assert.assertTrue(true);
		System.out.println("Demotest");
		
	}
	
   @Test(dependsOnMethods = "Demotest")
   public void Demotest1(){
		
		Assert.assertTrue(false);
		System.out.println("Demotest1");
		
	}
	@Test(dependsOnMethods = "Demotest1" , alwaysRun = true)
   public void Demotest2(){
		
		Assert.assertTrue(true);
		System.out.println("Demotest2");
		
	}
	
	
	
	
}
