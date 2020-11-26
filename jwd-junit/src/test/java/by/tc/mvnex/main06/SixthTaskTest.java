package by.tc.mvnex.main06;
import java.lang.Exception;
import org.junit.Assert;
import org.junit.Test;

public class SixthTaskTest {
	@Test
	public void testGetHourMinuteSecond01() 
	{
		try {
		int seconds = 0;
		
		int expected1 = 0;
		int actual1;		
		SixthTask obj = new SixthTask();		
		actual1 = obj.getHour(seconds);
		
		int expected2 = 0;
		int actual2;			
		actual2 = obj.getMinute(seconds);
		
		int expected3 = 0;
		int actual3;				
		actual3 = obj.getSecond(seconds);
		
		Assert.assertEquals(expected1, actual1);
		Assert.assertEquals(expected2, actual2);
		Assert.assertEquals(expected3, actual3);
		}
		catch (Exception e) {
			final String expected = " Error. The number of seconds can't be less than 1 and more than 86400. Try again. ";
			Assert.assertEquals(expected, e.getMessage());
		}
	}
	
	@Test
	public void testGetHourMinuteSecond02() 
	{
		try {
		int seconds = 3602;
		
		int expected1 = 1;
		int actual1;		
		SixthTask obj = new SixthTask();		
		actual1 = obj.getHour(seconds);
		
		int expected2 = 0;
		int actual2;			
		actual2 = obj.getMinute(seconds);
		
		int expected3 = 1;
		int actual3;				
		actual3 = obj.getSecond(seconds);
		
		Assert.assertEquals(expected1, actual1);
		Assert.assertEquals(expected2, actual2);
		Assert.assertEquals(expected3, actual3);
		}
		catch (Exception e) {
			final String expected = " Error. The number of seconds can't be less than 1 and more than 86400. Try again. ";
			Assert.assertEquals(expected, e.getMessage());
		}
	}
	
	@Test
	public void testGetHourMinuteSecond03() 
	{
		try {
		int seconds = 86401;
		
		int expected1 = 24;
		int actual1;		
		SixthTask obj = new SixthTask();		
		actual1 = obj.getHour(seconds);
		
		int expected2 = 0;
		int actual2;			
		actual2 = obj.getMinute(seconds);
		
		int expected3 = 1;
		int actual3;				
		actual3 = obj.getSecond(seconds);
		
		Assert.assertEquals(expected1, actual1);
		Assert.assertEquals(expected2, actual2);
		Assert.assertEquals(expected3, actual3);
		}
		catch (Exception e) {
			final String expected = " Error. The number of seconds can't be less than 1 and more than 86400. Try again. ";
			Assert.assertEquals(expected, e.getMessage());
		}
	}
	
	@Test
	public void testGetHourMinuteSecond04() 
	{
		try {
		int seconds = 86400;
		
		int expected1 = 23;
		int actual1;		
		SixthTask obj = new SixthTask();		
		actual1 = obj.getHour(seconds);
		
		int expected2 = 59;
		int actual2;			
		actual2 = obj.getMinute(seconds);
		
		int expected3 = 59;
		int actual3;				
		actual3 = obj.getSecond(seconds);
		
		Assert.assertEquals(expected1, actual1);
		Assert.assertEquals(expected2, actual2);
		Assert.assertEquals(expected3, actual3);
		}
		catch (Exception e) {
			final String expected = " Error. The number of seconds can't be less than 1 and more than 86400. Try again. ";
			Assert.assertEquals(expected, e.getMessage());
		}
	}
	
	@Test
	public void testGetHourMinuteSecond05() 
	{
		try {
		int seconds = 12345;
		
		int expected1 = 3;
		int actual1;		
		SixthTask obj = new SixthTask();		
		actual1 = obj.getHour(seconds);
		
		int expected2 = 25;
		int actual2;			
		actual2 = obj.getMinute(seconds);
		
		int expected3 = 44;
		int actual3;				
		actual3 = obj.getSecond(seconds);
		
		Assert.assertEquals(expected1, actual1);
		Assert.assertEquals(expected2, actual2);
		Assert.assertEquals(expected3, actual3);
		}
		catch (Exception e) {
			final String expected = " Error. The number of seconds can't be less than 1 and more than 86400. Try again. ";
			Assert.assertEquals(expected, e.getMessage());
		}
	}
}
