package by.tc.mvnex.main09;
import java.lang.Exception;
import org.junit.Assert;
import org.junit.Test;

public class NinthTaskTest {
	@Test
	public void testGetAreaAndLength01() 
	{
		try {
		double R = 2.0;
		
		double expected1 = 12.56637;
		double actual1;
		double delta = 0.01;
		
		double expected2 = 12.56637;
		double actual2;
		
		NinthTask obj = new NinthTask();
		
		actual1 = obj.getArea(R);
		actual2 = obj.getLength(R);
		Assert.assertEquals(expected1,actual1, delta); 
		Assert.assertEquals(expected2,actual2, delta); 
		}
		catch (Exception e) {
			final String expected = "Error. R can't be <= 0. Try again.";
			Assert.assertEquals(expected, e.getMessage());
		}
	}
	
	@Test
	public void testGetAreaAndLength02() 
	{
		try {
		double R = 0;
		
		double expected1 = 12.56637;
		double actual1;
		double delta = 0.01;
		
		double expected2 = 12.56637;
		double actual2;
		
		NinthTask obj = new NinthTask();
		
		actual1 = obj.getArea(R);
		actual2 = obj.getLength(R);
		Assert.assertEquals(expected1,actual1, delta); 
		Assert.assertEquals(expected2,actual2, delta); 
		}
		catch (Exception e) {
			final String expected = "Error. R can't be <= 0. Try again.";
			Assert.assertEquals(expected, e.getMessage());
		}
	}
	
	@Test
	public void testGetAreaAndLength03() 
	{
		try {
		double R = -12;
		
		double expected1 = 12.56637;
		double actual1;
		double delta = 0.01;
		
		double expected2 = 12.56637;
		double actual2;
		
		NinthTask obj = new NinthTask();
		
		actual1 = obj.getArea(R);
		actual2 = obj.getLength(R);
		Assert.assertEquals(expected1,actual1, delta); 
		Assert.assertEquals(expected2,actual2, delta); 
		}
		catch (Exception e) {
			final String expected = "Error. R can't be <= 0. Try again.";
			Assert.assertEquals(expected, e.getMessage());
		}
	}
}
