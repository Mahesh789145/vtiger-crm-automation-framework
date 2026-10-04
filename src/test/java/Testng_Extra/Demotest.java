package Testng_Extra;

import org.junit.Assert;
import org.testng.annotations.Test;

public class Demotest {
   @Test(priority =-1)
	
	public void Demotest(){
		
		Assert.assertTrue(true);
		System.out.println("Demotest");
		
	}
	
   @Test
   public void Demotest1(){
		
		Assert.assertTrue(false);
		System.out.println("Demotest1");
		
	}
	@Test(priority=1)
   public void Demotest2(){
		
		Assert.assertTrue(true);
		System.out.println("Demotest2");
		
	}
	
	
	
	
}
