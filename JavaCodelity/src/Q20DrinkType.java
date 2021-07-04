import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/* WJP for the following store and the number of drink type with quantity. If user wants to drink user should enter drink
 * type if drink quantity greater than one then request should be served and decrease the corresponding quantity by one
 * else no availability message should be printed on screen. 
 */

public class Q20DrinkType {

	public static void main(String[] args) {
		
		Map<String,Integer> hmap = new HashMap<>();
		hmap.put("pepsi", 10);
		hmap.put("fanta", 5);
		Scanner sc = new Scanner(System.in);
		System.out.println("Choose a drink form Pepsi and Fanta: ");
		String drinkName = sc.next();
		
		System.out.println("Enter the quantity of drinks: ");
		int n = sc.nextInt();
		
		if(hmap.containsKey(drinkName))
		{
			if(hmap.get(drinkName)>=1)
			{
				System.out.println(drinkName+ " is Served");
				hmap.put(drinkName, hmap.get(drinkName)-n);
				System.out.println("Remaining drinks: " +hmap);
			}
			else
			{
				System.out.println(drinkName+ " is not available");
			}
		}
		else
		{
			System.out.println("");
		}
		
	}
}
