package by.tc.mvnex.main01;
import java.util.Scanner;
public class FirstTask {
	public int findSquareOfLastDigit(int i) {
		//Написать программу, позволяющую по последней цифре числа определить последнюю цифру его квадрата
	        int last_dig = (Math.abs(i))%10;
	        int square = 0;
	        if (last_dig==0) {
	        	square = 0;
	        } else 
	        	if (last_dig==1 || last_dig == 9) {
	            square = 1;
			} else 
				if (last_dig == 2 || last_dig == 8) {
					square =4;
				}else
					if (last_dig == 3 || last_dig == 7) {
						square =9;
					}else
						if (last_dig == 4 || last_dig == 6) {
						  square =6;
						}else
							if (last_dig == 5) {
								square =5;
							}
	        return square;
		}
	public static void main(String[] args) {
		System.out.println("Input number: ");
		Scanner number = new Scanner( System.in );
	    int i = number.nextInt();
	    System.out.println("Last digit is: "+ Math.abs(i % 10));
	    FirstTask obj = new FirstTask();
	    int square = obj.findSquareOfLastDigit(i);
	    System.out.println("The last digit of the Square is: "+ square);
	    number.close();
	}
}
