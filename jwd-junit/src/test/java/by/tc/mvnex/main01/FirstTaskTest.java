package by.tc.mvnex.main01;
import org.junit.Assert;
import org.junit.Test;

public class FirstTaskTest {
	@Test
	public void testFindSquareOfLastDigit01() 
	{
		int i = 123456789;
		
		int expected = 1;
		int actual;
		
		FirstTask obj = new FirstTask();
		
		actual = obj.findSquareOfLastDigit(i);
		
		Assert.assertEquals(expected, actual);
	}
	

	@Test
	public void testFindSquareOfLastDigit02() 
	{
		int i = 1234323454;
		
		int expected = 6;
		int actual;
		
		FirstTask obj = new FirstTask();
		
		actual = obj.findSquareOfLastDigit(i);
		
		Assert.assertEquals(expected, actual);
	}
	
	@Test
	public void testFindSquareOfLastDigit03() 
	{
		int i = -12;
		
		int expected = 4;
		int actual;
		
		FirstTask obj = new FirstTask();
		
		actual = obj.findSquareOfLastDigit(i);
		
		Assert.assertEquals(expected, actual);
	}
}
