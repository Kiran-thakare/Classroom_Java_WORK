import java.util.Calendar;
import java.util.Date;
import java.util.Timer;

public class JavaDateTime {
   
	public static void main(String[] args) {
		 
		System.out.println(new Date().getMonth()+1);
		
		Calendar calendar=Calendar.getInstance();
		int day=calendar.get(calendar.DATE);
		int month=calendar.get(calendar.MONTH)+1;
		int year=calendar.get(calendar.YEAR);
		System.out.println(day+"/"+String.format("%02d",month)+"/"+year);
	}
}
