package DataStructures;
import java.util.Scanner;



public class angle_between_hour_and_minutes {
	
	public static void main (String [] args)
	{
	 Scanner sc = new Scanner (System.in);
	 System.out.println("Please enter the hours");
	 int hour = sc.nextInt();
	 
	 System.out.println("Please enter the minutes");
	 int minutes = sc.nextInt();
	 sc.close();
	 
	 int minuteAngle = 360 * minutes / 60;
	 int hourAngle = 360 * (hour % 12) / 12 + 360 * (minutes / 60) * (1 / 12);
	 int differenceBetweenthem = ( hourAngle - minuteAngle ) % 360;
	 System.out.println(differenceBetweenthem);
	 
	 
	}

}
