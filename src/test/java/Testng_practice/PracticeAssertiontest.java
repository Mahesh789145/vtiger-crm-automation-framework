package Testng_practice;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import junit.framework.Assert;

public class PracticeAssertiontest {

	@Test
	
	public void PracticeAssertiontest(){	
		
		
		
		
		Assert.assertEquals("dinga", "dingi");
		Assert.assertEquals("dinga1", "dinga1");
		
//		SoftAssert  softAssert = new SoftAssert();
//		
//		
//		    softAssert.assertEquals("dinga", "dingi");
//		    softAssert.assertNotEquals("dinga1", "dingi1");
//		    
//            softAssert.assertAll();		    
		
		
		
		
	}
	
	
}
