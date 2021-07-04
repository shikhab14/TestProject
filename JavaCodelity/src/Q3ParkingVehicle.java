import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/*WJP to implement the following. Consider vehicle parking application where each vehicle information which enters into the 
parking location stored in 2 list at the end of each day this list to be merged into single list and one vehicle 
information which has highest parked hour should be retrieved where each vehicle information has vehicle number, model
and total duration parked in minutes.*/

class vehicle implements Comparable<vehicle>
{
	int vehicleNo;
	String vehicleModel;
	int pHour;
	vehicle(int n, String m, int h)
	{
		vehicleNo = n;
		vehicleModel = m;
		pHour = h;
	}
	@Override
	public int compareTo(vehicle o) {
		
		return this.pHour-o.pHour;
	}
	
}

public class Q3ParkingVehicle {
		
	public static void main(String[] args) {
		
		List<vehicle> l1 = new ArrayList<vehicle>();
		l1.add(new vehicle(10,"Honda",5));
		l1.add(new vehicle(20,"Tesla",12));
		l1.add(new vehicle(30,"Audi",8));
		l1.add(new vehicle(40,"Toyota",5));
		
		List<vehicle> l2 = new ArrayList<vehicle>();
		l2.add(new vehicle(80,"Mercedes",20));
		l2.add(new vehicle(50,"BMW",7));
		l2.add(new vehicle(70,"Nisaan",9));
		
		l1.addAll(l2);
		Collections.sort(l1);
		
		for(int i=0;i<l1.size();i++)
		{
			System.out.println(l1.get(i).vehicleNo+ " " +l1.get(i).vehicleModel+ " " +l1.get(i).pHour);
		}
		System.out.println("Car with highest parked hour is "+l1.get(l1.size()-1).vehicleModel+ " with " +l1.get(l1.size()-1).pHour*60+ " minutes");
		
	}
}
