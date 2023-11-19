
public class bus {
private int busno;
private boolean ac;
private int capacity;
bus(int busno,boolean ac,int cap)
{
	this.busno=busno;
	this.ac=ac;
	this.capacity=cap;
}
public void setbusno(int no) {this.busno=no;}
public void setac(boolean ac ) {this.ac=ac;}
public void setcap(int cap) {this.capacity=cap;}
public int getbusno() {return busno;}
public boolean getac() {return ac;}
public int getcap() {return capacity;}
void displayBusInfo() {
		System.out.println("Bus No:" + busno + " Ac:" + ac + " Total Capacity: " + capacity);
	}
}

