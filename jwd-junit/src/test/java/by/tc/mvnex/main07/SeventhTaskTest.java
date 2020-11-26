package by.tc.mvnex.main07;
import org.junit.Assert;
import org.junit.Test;

public class SeventhTaskTest {
	@Test
	public void testGetNearest01() 
	{
		double x1 = 1;
		double y1 = 1;
		double x2 = 0;
		double y2 = 0;
		
		String expected = "B closer";
		String actual;		
		SeventhTask obj = new SeventhTask();		
		actual = obj.getNearest(x1, y1, x2, y2);
		Assert.assertEquals(expected,actual);
	}
	
	@Test
	public void testGetNearest02() 
	{
		double x1 = 0;
		double x2 = 0;
		double y1 = 0;
		double y2 = 0;
		String expected = "the same distance";
		String actual;		
		SeventhTask obj = new SeventhTask();		
		actual = obj.getNearest(x1, y1, x2, y2);
		Assert.assertEquals(expected,actual);
	}
	
	@Test
	public void testGetNearest03() 
	{
		double x1 = 1;
		double y1 = 1;
		double x2 = -2;
		double y2 = -2;
		
		String expected = "A closer";
		String actual;		
		SeventhTask obj = new SeventhTask();		
		actual = obj.getNearest(x1, y1, x2, y2);
		Assert.assertEquals(expected,actual);
	}
}
