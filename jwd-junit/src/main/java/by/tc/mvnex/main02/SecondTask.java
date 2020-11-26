package by.tc.mvnex.main02;
import java.lang.Exception;
import java.util.Scanner;

public class SecondTask {
	//Составить программу, которая по заданным году и номеру месяца определяет количество дней в этом месяце 
		//и корректно определялись все високосные года.
			        public int findNumberOfDays(int year, int month) throws Exception {
			        int days=0;
			        String e = " Error. The number of year can't be less than 1 & the number of month can't be less than 1 and more than 12. Try again. ";
			        if (year<1 || month<1 || month>12)  {throw new Exception (e);}
			        if (year>0 || month >0 || month < 13)
			      	if (year%4!=0 || (year%4==0 && year%100==0 && year%400!=0)) 
					{
						if (month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12) 
						{
							days=31;
						} else
						if ( month == 4 || month == 6 || month == 9 || month == 11) 
						{
							days=30;
						}
						else
						{
					    if (month == 2)
							    {
							    	days=28;
							    }
						}
					}
					else
					{
						if (month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12) 
						{
							days=31;
						} else
						if (month == 4 || month == 6 || month == 9 || month == 11) 
						{
							days=30;
						} else 
						{
							if (month == 2)
						    {
						    	days=29;
						    }
						}
					}			        
					return days;
			    }
			        public static void main(String[] args) {
			        	try {
						System.out.println("Input the year: "); 
						Scanner y = new Scanner(System.in);
						int year = y.nextInt();
						System.out.println("Input the month: ");
						Scanner m = new Scanner(System.in);
						int month = m.nextInt();
						SecondTask obj = new SecondTask();
						int days = obj.findNumberOfDays(year, month);
						System.out.println("The number of days in this month is: "+ days);
				        y.close();
				        m.close();
			        	}
			    		catch (Exception e) {
			    			System.out.println(" Error. The number of year can't be less than 1 & the number of month can't be less than 1 and more than 12. Try again. ");
			    		}
			        }
}
