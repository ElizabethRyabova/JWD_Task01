package by.tc.mvnex.main08;
import java.util.Scanner;
import java.lang.Math;
import java.lang.Exception;
public class EighthTask {
	//Вычислить значение функции:
		public double getFunction(double x) throws Exception {
			String e1 = "Error. x^3 can't be = 6. Try again.";
			String e2 = "function F tends to negative infinity.";
			String e3 = "function F tends to 0.";
			if (x == Math.cbrt(6))  
			{
				String e = e1;
				throw new Exception (e);
			}
			if (x == Double.POSITIVE_INFINITY)  
			{
				String e = e2;
				throw new Exception (e);
			}
			if (x == Double.NEGATIVE_INFINITY)  
			{
				String e = e3;
				throw new Exception (e);
			}
			double F=0;
			if (x<3)
			{
				F=1/(x*x*x-6);
			}
			else
				F=-(x*x)+3*x+9;
			return F;
		}
		public static void main(String[] args) {
			try {
			System.out.println("Input x: ");	
			Scanner s = new Scanner (System.in);
			double x = s.nextDouble();
			EighthTask obj = new EighthTask();	
			double F = obj.getFunction(x);
			System.out.println("F(x)=  " + F);
			s.close();
			}
		catch (Exception e) {
			System.out.println("Error. x^3 can't be = 6. Try again.");
			}
		}
}
