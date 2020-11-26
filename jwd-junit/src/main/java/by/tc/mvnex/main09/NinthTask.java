package by.tc.mvnex.main09;
import java.util.Scanner;
import java.lang.Math;
import java.lang.Exception;
public class NinthTask {
	//Вычислить длину окружности и площадь круга одного и того же заданного радиуса R
	double pi = Math.PI;
		public double getArea(double R)throws Exception {
			String e = "Error. R can't be <= 0. Try again.";
			if (R<=0)  {throw new Exception (e);}
        double area = pi*R*R;
        return area;
	}
		public double getLength(double R)throws Exception {
			String e = "Error. R can't be <= 0. Try again.";
			if (R<=0)  {throw new Exception (e);}
	        double length= 2*pi*R;
	        return length;
		}
		public static void main(String[] args) {
			try {
			System.out.println("Input R: ");	
			Scanner s = new Scanner (System.in);
			double R = s.nextDouble();
			NinthTask obj = new NinthTask();
			double area = obj.getArea(R);
			double length = obj.getLength(R);
			System.out.println("area = " + area);
		    System.out.println("length = " + length);
		    s.close();
		    }
			catch (Exception e) {
				System.out.println("Error. R can't be <= 0. Try again.");
			}
		}
}
