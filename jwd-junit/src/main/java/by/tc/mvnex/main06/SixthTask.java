package by.tc.mvnex.main06;
import java.lang.Exception;
import java.util.Scanner;

public class SixthTask {
	//Идет n-я секунда суток, определить, сколько полных часов, полных минут и секунд прошло к этому моменту.
			public int getHour(int seconds)throws Exception {
			String e = " Error. The number of seconds can't be less than 1 and more than 86400. Try again. ";
			if (seconds<1 || seconds>86400)  {throw new Exception (e);}
			seconds--;
			int hours = seconds/3600;
			return hours;
			}
			
			public int getMinute(int seconds)throws Exception {
				seconds--;
				int hours = seconds/3600;
				int minutes = (seconds - hours*3600)/60;
				return minutes;
				}
			
			public int getSecond(int seconds)throws Exception {
				seconds--;
				int hours = seconds/3600;
				int minutes = (seconds - hours*3600)/60;
				int secs = seconds-hours*3600-minutes*60;
				return secs;
				}

				public static void main(String[] args) {
					try {
				System.out.println("Input seconds: ");	
				Scanner s = new Scanner (System.in);
				int seconds = s.nextInt();
				SixthTask obj = new SixthTask();		
				int hours = obj.getHour(seconds);
				int minutes = obj.getMinute(seconds);
				int secs = obj.getSecond(seconds);
				System.out.println(hours + " hours  " + minutes + " minutes  "+ secs + " seconds");	
				s.close();
				}
					catch (Exception e) {
						System.out.println(" Error. The number of seconds can't be less than 1 and more than 86400. Try again. ");
					}
				}
}

