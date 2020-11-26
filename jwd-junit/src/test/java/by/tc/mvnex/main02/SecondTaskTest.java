package by.tc.mvnex.main02;
import java.lang.Exception;
import org.junit.Assert;
import org.junit.Test;

public class SecondTaskTest {
	@Test
	public void testFindNumberOfDays01() 
	{
		try {
		int year = 2020;
		int month = 2;
		
		int expected = 29;
		int actual;
		
		SecondTask obj = new SecondTask();
		
		actual = obj.findNumberOfDays(year, month);
		Assert.assertEquals(expected, actual);
		}
		catch (Exception e) {
			final String expected = " Error. The number of year can't be less than 1 & the number of month can't be less than 1 and more than 12. Try again. ";
			Assert.assertEquals(expected, e.getMessage());
		}
	}
	

	@Test
	public void testFindNumberOfDays02() 
	{
		try {
		int year = 1700;
		int month = 2;
		
		int expected = 28;
		int actual;
		
		SecondTask obj = new SecondTask();
		
		actual = obj.findNumberOfDays(year, month);
		
		Assert.assertEquals(expected, actual);
		}
		catch (Exception e) {
			final String expected = " Error. The number of year can't be less than 1 & the number of month can't be less than 1 and more than 12. Try again. ";
			Assert.assertEquals(expected, e.getMessage());
		}
	}
	
	@Test
	public void testFindNumberOfDays03() 
	{
		try {
		int year = 2021;
		int month = 2;
		
		int expected = 28;
		int actual;
		
		SecondTask obj = new SecondTask();
		
		actual = obj.findNumberOfDays(year, month);
		
		Assert.assertEquals(expected, actual);
	}
		catch (Exception e) {
			final String expected = " Error. The number of year can't be less than 1 & the number of month can't be less than 1 and more than 12. Try again. ";
			Assert.assertEquals(expected, e.getMessage());
		}
	}
	
	@Test
	public void testFindNumberOfDays04() 
	{
		try {
		int year = -199;
		int month = 14;
		
		int expected = 28;
		int actual;
		
		SecondTask obj = new SecondTask();
		
		actual = obj.findNumberOfDays(year, month);
		
		Assert.assertEquals(expected, actual);
	}
	catch (Exception e) {
		final String expected = " Error. The number of year can't be less than 1 & the number of month can't be less than 1 and more than 12. Try again. ";
		Assert.assertEquals(expected, e.getMessage());
	}
	}
}
