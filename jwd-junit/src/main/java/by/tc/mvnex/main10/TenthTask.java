package by.tc.mvnex.main10;
import java.util.Scanner;
import java.lang.Math;
import java.lang.Exception;
public class TenthTask {
	public double getFunction(double i) throws Exception {
		String e = "Error. The tangent of pi/2 is not defined. Try again.";
		if (i==Math.PI/2)  {throw new Exception (e);}
			double F=Math.tan(i);
			return F;
	}
	
	public static void main(String[] args) {
		System.out.println("Input a b h: ");	
		Scanner s = new Scanner (System.in);
		double a = s.nextDouble();
		double b = s.nextDouble();
		double h = s.nextDouble();
		double F=0;
		for(double i=a; i<b; i+=h) 
		{
			if (i==Math.PI/2) 
			{
				System.out.println("Error. The tangent of pi/2 is not defined. Try again.");
			}
			F=Math.tan(i);
			System.out.println("------------------------------------------------------------   ");
			System.out.println("x = " + i + "              |F(x)="+ F );
		}
		s.close();
	}

}
