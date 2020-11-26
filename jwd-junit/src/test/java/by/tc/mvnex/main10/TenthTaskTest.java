package by.tc.mvnex.main10;
import org.junit.Assert;
import org.junit.Test;
import java.lang.Exception;
import java.lang.Math;
public class TenthTaskTest {
	@Test
	public void testGetFunction01() 
	{
		try {
		double i = 1.0;
		
		double expected = 1.5574;
		double actual;
		double delta = 0.01;
		
		TenthTask obj = new TenthTask();
		
		actual = obj.getFunction(i);
		Assert.assertEquals(expected,actual, delta); 
	}
		catch (Exception e) {
			final String expected = "Error. The tangent of pi/2 is not defined. Try again.";
			Assert.assertEquals(expected, e.getMessage());
		}
	}
	
	@Test
	public void testGetFunction02() 
	{
		try {
		double i = -0.1234;
		
		double expected = -0.124;
		double actual;
		double delta = 0.01;
		
		TenthTask obj = new TenthTask();
		
		actual = obj.getFunction(i);
		Assert.assertEquals(expected,actual, delta); 
	}
		catch (Exception e) {
			final String expected = "Error. The tangent of pi/2 is not defined. Try again.";
			Assert.assertEquals(expected, e.getMessage());
		}
}
	
	@Test
	public void testGetFunction03() 
	{
		try {
		double i = Math.PI/2;
		
		double expected = -0.124;
		double actual;
		double delta = 0.01;
		
		TenthTask obj = new TenthTask();
		
		actual = obj.getFunction(i);
		Assert.assertEquals(expected,actual, delta); 
	}
		catch (Exception e) {
			final String expected = "Error. The tangent of pi/2 is not defined. Try again.";
			Assert.assertEquals(expected, e.getMessage());
		}
}
}
