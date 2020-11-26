package by.tc.mvnex.main04;
import java.util.Scanner;
public class FourthTask {
	//Составить программу, печатающую значение true, если указанное высказывание является истинным, и 
	//false — в противном случае: среди заданных целых чисел А, В, С, D есть хотя бы два четных.
		public boolean isABCD(int A, int B, int C, int D){
		if ((A%2==0 && B%2==0) || (A%2==0 && C%2==0) || (A%2==0 && D%2==0) || (C%2==0 && B%2==0) || (D%2==0 && B%2==0) || (C%2==0 && D%2==0)) 
		{
			return true;
		}
		else 
			return false;
		}
		public static void main(String[] args) {
			System.out.println("Input A, B, C, D: ");
			Scanner s = new Scanner (System.in);
			int A = s.nextInt();
			int B = s.nextInt();
			int C = s.nextInt();
			int D = s.nextInt();
			FourthTask obj = new FourthTask();
			boolean answer = obj.isABCD(A, B, C, D);
			System.out.println(answer);
			s.close();
		}
}
