import java.util.Scanner;

/*Write a program to read monetary amount in cents and print the smallest possible number of coins equaling the amount
Example: monetary amount in cents=288 2 Dollars, 3 quarter, 1 dime, 3 penny. So smallest possible number of coins
equaling the amount 283===9.  */

public class Q5Coins {

public static void coinCount(int cent, int dollar, int quarter, int dime, int nickle, int penny)
{
	int remaining = cent;
	int coinCount = 0;
	
	//count the number of dollars
	if(cent>=dollar)
	{
		dollar = cent/100;
		System.out.println("Total number of dollars required: "+dollar);
		remaining = remaining%100;
		coinCount = coinCount+dollar;
	}
	
	//count the number of quarters
	if(remaining>=quarter)
	{
		quarter = remaining/25;
		remaining = remaining%25;
		System.out.println("Total number of quarters required: "+quarter);
		coinCount = coinCount+quarter;
	}
	
	//count the number of dimes
	if(remaining>=dime)
	{
		dime = remaining/10;
		remaining = remaining%10;
		System.out.println("Total number of dimes required: "+dime);
		coinCount = coinCount + dime;
	}
	
	//count the number of nickles
	if(remaining>=nickle)
	{
		nickle = remaining/5;
		remaining = remaining%5;
		System.out.println("Total number of dimes required: "+nickle);
		coinCount = coinCount + nickle;
	}
	
	//count the number of pennies
	if(remaining!=0)
	{
		penny = remaining/1;
		remaining = remaining%1;
		System.out.println("Total number of penny required: "+penny);
		coinCount = coinCount + penny;
	}
	
	System.out.println("The total number of coins required is = "+coinCount);
}

public static void main(String[] args) {
	
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the amount in cent: ");
	int cent = sc.nextInt();
	
	int dollar = 100;
	int quarter = 25;
	int dime = 10;
	int nickle = 5;
	int penny = 1;
	
	coinCount(cent, dollar, quarter, dime, nickle, penny);
	
}
}
