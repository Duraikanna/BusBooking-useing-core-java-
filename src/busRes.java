import java.util.ArrayList;
import java.util.Scanner;

public class busRes {
public static void main(String[] args) {
	Scanner sc1=new Scanner(System.in);
	int useropt=1;
	ArrayList<bus>buss=new ArrayList<bus>();
	ArrayList<booking>Booking=new ArrayList<booking>();
	buss.add(new bus(1,true,2));
	buss.add(new bus(2,true,30));
	buss.add(new bus(3,false,10));
	for(bus b:buss)
		b.displayBusInfo();
	
	
	while(useropt==1) {
		System.out.println("Enter 1 to booking or 2 to exit");
		useropt=sc1.nextInt();
		if(useropt==1)
		{
			booking Bookings=new booking();
			if(Bookings.isAvailble(buss,Booking))
			{
				Booking.add(Bookings);
				System.out.println("Succesfully ticked bookied ....:)");
				for(bus b:buss)
					b.displayBusInfo();
			}
			else
				System.out.println("Sorry seat full try another bus or date :(");
		}
		else
			System.out.println("thank you");
	}
}
}
