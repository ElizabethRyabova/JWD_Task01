package by.tc.mvnex.main04;
import org.junit.Assert;
import org.junit.Test;

public class FourthTaskTest {
	@Test
	public void testIsABCD01() 
	{
		int A = 1;
		int B = 2;
		int C = 3;
		int D = 4;
		
		boolean expected = true;
		boolean actual;
		
		FourthTask obj = new FourthTask();
		
		actual = obj.isABCD(A, B, C, D);
		
		Assert.assertEquals(expected, actual);
	}
	
	@Test
	public void testIsABCD02() 
	{
		int A = 1;
		int B = 0;
		int C = 0;
		int D = 0;
		
		boolean expected = true;
		boolean actual;
		
		FourthTask obj = new FourthTask();
		
		actual = obj.isABCD(A, B, C, D);
		
		Assert.assertEquals(expected, actual);
	}
	
	@Test
	public void testIsABCD03() 
	{
		int A = 1;
		int B = 1;
		int C = 101;
		int D = 1;
		
		boolean expected = false;
		boolean actual;
		
		FourthTask obj = new FourthTask();
		
		actual = obj.isABCD(A, B, C, D);
		
		Assert.assertEquals(expected, actual);
	}
	
	@Test
	public void testIsABCD04() 
	{
		int A = 1;
		int B = -2;
		int C = 3;
		int D = -4;
		
		boolean expected = true;
		boolean actual;
		
		FourthTask obj = new FourthTask();
		
		actual = obj.isABCD(A, B, C, D);
		
		Assert.assertEquals(expected, actual);
	}
}
