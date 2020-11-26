package by.tc.mvnex.main03;
import java.lang.Exception;
import org.junit.Assert;
import org.junit.Test;

public class ThirdTaskTest {
	@Test
	public void testFindAreaOfSecondSquare01() 
	{
		try {
		double square1 = 2.0;
		
		double expected = 1.0;
		double actual;
		double delta = 0.01;
		
		ThirdTask obj = new ThirdTask();
		
		actual = obj.findAreaOfSecondSquare(square1);		
		Assert.assertEquals(expected,actual, delta); 
		}
		catch (Exception e) {
			final String expected = "Error. The area of a square can't be <= 0. Try again.";
			Assert.assertEquals(expected, e.getMessage());
		}
	}
	
	@Test
	public void testFindAreaOfSecondSquare02() 
	{
		try {
		double square1 = 4.05;
		
		double expected = 2.025;
		double actual;
		double delta = 0.01;
		
		ThirdTask obj = new ThirdTask();
		
		actual = obj.findAreaOfSecondSquare(square1);		
		Assert.assertEquals(expected,actual, delta); 
	}
	catch (Exception e) {
		final String expected = "Error. The area of a square can't be <= 0. Try again.";
		Assert.assertEquals(expected, e.getMessage());
	}
	}
	
	@Test
	public void testFindAreaOfSecondSquare03() 
	{
		try {
		double square1 = 12.09;
		
		double expected = 6.045;
		double actual;
		double delta = 0.01;
		
		ThirdTask obj = new ThirdTask();
		
		actual = obj.findAreaOfSecondSquare(square1);		
		Assert.assertEquals(expected,actual, delta); 
	}
	catch (Exception e) {
		final String expected = "Error. The area of a square can't be <= 0. Try again.";
		Assert.assertEquals(expected, e.getMessage());
	}
	}
		
		@Test
		public void testFindAreaOfSecondSquare04() 
		{
			try {
			double square1 = -12.0;
			
			double expected = 6.0;
			double actual;
			double delta = 0.01;
			
			ThirdTask obj = new ThirdTask();
			
			actual = obj.findAreaOfSecondSquare(square1);		
			Assert.assertEquals(expected,actual, delta); 
		}
		catch (Exception e) {
			final String expected = "Error. The area of a square can't be <= 0. Try again.";
			Assert.assertEquals(expected, e.getMessage());
		}
}
		
		@Test
		public void testFindAreaOfSecondSquare05() 
		{
			try {
			double square1 = 0;
			
			double expected = 6.0;
			double actual;
			double delta = 0.01;
			
			ThirdTask obj = new ThirdTask();
			
			actual = obj.findAreaOfSecondSquare(square1);		
			Assert.assertEquals(expected,actual, delta); 
		}
		catch (Exception e) {
			final String expected = "Error. The area of a square can't be <= 0. Try again.";
			Assert.assertEquals(expected, e.getMessage());
		}
}
}
