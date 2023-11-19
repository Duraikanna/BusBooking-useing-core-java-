import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class booking {
String passengername;
int busno;
Date date;
booking()
{
	Scanner in=new Scanner(System.in);
	System.out.println("enter passenger name:");
	this.passengername=in.next();
	System.out.println("Enter bus no:");
	busno=in.nextInt();
	System.out.println("Enter date (dd-mm-yy)");
	String dateInput = in.next();
	SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
	
	try {
		date = dateFormat.parse(dateInput);
	} catch (ParseException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
}
public boolean isAvailble(ArrayList<bus> buss, ArrayList<booking> Booking) {
	// TODO Auto-generated method stub
	int capacity=0;
	for(bus b:buss)
	{
		if(b.getbusno()==busno)
			capacity=b.getcap();
	}
	int booked=0;
	for(booking book:Booking)
	{
		if(book.busno==busno && book.date.equals(date))
		{
			booked++;
		}
	}
	return booked<capacity?true:false;
}
}
