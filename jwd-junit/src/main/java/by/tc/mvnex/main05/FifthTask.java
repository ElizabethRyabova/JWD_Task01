package by.tc.mvnex.main05;
import java.util.Scanner;
public class FifthTask {
	//Составить программу, печатающую значение true, если указанное высказывание является истинным, 
	//и false — в противном случае: является ли целое число совершенным (сумма делителей равна самому числу).
		public boolean findSumOfDivisors(int number){
			int num=number;
			int sum=1;
			for (int i=2; i<number/2+1; i++) 
			{
				if (num%i==0) 
				{
					sum+=i;
				}
			}
			if (sum==number)
			{
				return true;
			}
			else
				return false;
		}
		public static void main(String[] args) {
			System.out.println("Input number: ");
			Scanner s = new Scanner (System.in);
			int number=s.nextInt();
			FifthTask obj = new FifthTask();
			boolean answer = obj.findSumOfDivisors(number);
			System.out.println(answer);
			s.close();
		}
}
