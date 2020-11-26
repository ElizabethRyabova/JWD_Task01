package by.tc.mvnex.main03;
import java.lang.Math;
import java.util.Scanner;

import java.lang.Exception;
public class ThirdTask {
	//Окружность вписана в квадрат заданной площади. Найти площадь квадрата, вписанного в эту окружность. 
		//Во сколько раз площадь вписанного квадрата меньше площади заданного?
		public double findAreaOfSecondSquare(double square1)throws Exception {
		String e = "Error. The area of a square can't be <= 0. Try again.";
		if (square1<=0)  {throw new Exception (e);}
		double r = Math.sqrt(square1);
		r/=2;
		double side =r * Math.sqrt(2);
		double square2=side*side;
		return square2;
		}
		
		public double findSquareDivision(double square1) {
			double r = Math.sqrt(square1);
			r/=2;
			double side = r * Math.sqrt(2);
			double square2=side*side;
			return square1/square2;
			}
		
		public static void main(String[] args) {
			try {
			System.out.println("Input area of square: ");
			Scanner s = new Scanner (System.in);
			double square1=s.nextDouble();
			ThirdTask obj = new ThirdTask();
			double square2 = obj.findAreaOfSecondSquare(square1);
			double squareDivision = obj.findSquareDivision(square1);
			System.out.println("Area of the second square is:  " + square2);
			System.out.println("Square1/square2:  "+ squareDivision);
			s.close();
			}
			catch (Exception e) {
				System.out.println("Error. The area of a square can't be <= 0. Try again.");
			}
}
}
