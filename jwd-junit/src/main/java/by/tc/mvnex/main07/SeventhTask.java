package by.tc.mvnex.main07;
import java.util.Scanner;
import java.lang.Math;
public class SeventhTask {
	public String getNearest(double x1, double y1, double x2, double y2) {
		//Даны две точки А(х1, у1) и В(х2, у2). Составить алгоритм, определяющий, которая из точек находится ближе к началу координат. x y.
				String str1 = "B closer";
				String str2 = "A closer";
				String str3 = "the same distance";
				if (Math.sqrt(x1*x1+y1*y1)>Math.sqrt(x2*x2+y2*y2)) 
				{
					return str1;
				}
				else if(Math.sqrt(x1*x1+y1*y1)<Math.sqrt(x2*x2+y2*y2)) 
				{
					return str2;
				}
				else
					return str3;
			}
	public static void main(String[] args) {
		System.out.println("Input x1 y1 x2 y2: ");	
		Scanner s = new Scanner (System.in);
		double x1 = s.nextInt();
		double y1 = s.nextInt();
		double x2 = s.nextInt();
		double y2 = s.nextInt();
		SeventhTask obj = new SeventhTask();		
		String answer = obj.getNearest(x1, y1, x2, y2);
		System.out.println(answer);
		s.close();
	}
}
