package by.tc.mvnex.main05;
import org.junit.Assert;
import org.junit.Test;

public class FifthTaskTest {
	@Test
	public void testFindSumOfDivisors01() 
	{
		int number = 6;
		boolean expected = true;
		boolean actual;
		
		FifthTask obj = new FifthTask();
		
		actual = obj.findSumOfDivisors(number);
		
		Assert.assertEquals(expected, actual);
	}
	
	@Test
	public void testFindSumOfDivisors02() 
	{
		int number = 28;
		boolean expected = true;
		boolean actual;
		
		FifthTask obj = new FifthTask();
		
		actual = obj.findSumOfDivisors(number);
		
		Assert.assertEquals(expected, actual);
	}
	
	@Test
	public void testFindSumOfDivisors03() 
	{
		int number = 496;
		boolean expected = true;
		boolean actual;
		
		FifthTask obj = new FifthTask();
		
		actual = obj.findSumOfDivisors(number);
		
		Assert.assertEquals(expected, actual);
	}
	
	@Test
	public void testFindSumOfDivisors04() 
	{
		int number = 8128;
		boolean expected = true;
		boolean actual;
		
		FifthTask obj = new FifthTask();
		
		actual = obj.findSumOfDivisors(number);
		
		Assert.assertEquals(expected, actual);
	}
	
	@Test
	public void testFindSumOfDivisors05() 
	{
		int number = 33550336;
		boolean expected = true;
		boolean actual;
		
		FifthTask obj = new FifthTask();
		
		actual = obj.findSumOfDivisors(number);
		
		Assert.assertEquals(expected, actual);
	}
	
	@Test
	public void testFindSumOfDivisors06() 
	{
		int number = 12345;
		boolean expected = false;
		boolean actual;
		
		FifthTask obj = new FifthTask();
		
		actual = obj.findSumOfDivisors(number);
		
		Assert.assertEquals(expected, actual);
	}
}
