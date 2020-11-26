package by.tc.mvnex.main08;
import org.junit.Assert;
import org.junit.Test;

public class EighthTaskTest {
	@Test
	public void testGetFunction01() 
	{
		try {
		double x = Math.cbrt(6);
		
		double expected = 1.0;
		double actual;
		double delta = 0.01;
		
		EighthTask obj = new EighthTask();
		
		actual = obj.getFunction(x);		
		Assert.assertEquals(expected,actual, delta); 
		}
		catch (Exception e) {
			final String expected = "Error. x^3 can't be = 6. Try again.";
			Assert.assertEquals(expected, e.getMessage());
		}
	}
	
	@Test
	public void testGetFunction02() 
	{
		try {
		double x = 3.0;
		
		double expected = 9.0;
		double actual;
		double delta = 0.01;
		
		EighthTask obj = new EighthTask();
		
		actual = obj.getFunction(x);		
		Assert.assertEquals(expected,actual, delta); 
		}
		catch (Exception e) {
			final String expected = "Error. x can't be = . Try again.";
			Assert.assertEquals(expected, e.getMessage());
		}
	}
	
	@Test
	public void testGetFunction03() 
	{
		try {
		double x = 1.0;
		
		double expected = -0.2;
		double actual;
		double delta = 0.01;
		
		EighthTask obj = new EighthTask();
		
		actual = obj.getFunction(x);		
		Assert.assertEquals(expected,actual, delta); 
		}
		catch (Exception e) {
			final String expected = "Error. x can't be = . Try again.";
			Assert.assertEquals(expected, e.getMessage());
		}
	}
	
	@Test
	public void testGetFunction04() 
	{
		try {
		double x = 5.012;
		
		double expected = -1.084144;
		double actual;
		double delta = 0.01;
		
		EighthTask obj = new EighthTask();
		
		actual = obj.getFunction(x);		
		Assert.assertEquals(expected,actual, delta); 
		}
		catch (Exception e) {
			final String expected = "Error. x can't be = . Try again.";
			Assert.assertEquals(expected, e.getMessage());
		}
	}
	
	@Test
	public void testGetFunction05() 
	{
		try {
		double x = Double.POSITIVE_INFINITY;
		
		double expected = 0;
		double actual;
		double delta = 0.01;
		
		EighthTask obj = new EighthTask();
		
		actual = obj.getFunction(x);		
		Assert.assertEquals(expected,actual, delta); 
		}
		catch (Exception e) {
			final String expected = "function F tends to negative infinity.";
			Assert.assertEquals(expected, e.getMessage());
		}
	}
	
	@Test
	public void testGetFunction06() 
	{
		try {
		double x = Double.NEGATIVE_INFINITY;
		
		double expected = 0;
		double actual;
		double delta = 0.01;
		
		EighthTask obj = new EighthTask();
		
		actual = obj.getFunction(x);		
		Assert.assertEquals(expected,actual, delta); 
		}
		catch (Exception e) {
			final String expected = "function F tends to 0.";
			Assert.assertEquals(expected, e.getMessage());
		}
	}
}
