import java.util.ArrayList;

/*WJP to implement your own arraylist which has two methods add() and remove() and store 5 student information 
in your arraylist.*/

public class Q7CustomArrayList {

	int size=5;
	
	class Student
	{
		//global variables of the class to be added in Arraylist
		int sID;
		String sName;
		int sGrade;
		
		//constructor of the class that contains types of data which are required
		Student(int sID, String sName, int sGrade)
		{
			//initializing the variables from main function to the global variable of the class
			this.sID=sID;
			this.sName=sName;
			this.sGrade=sGrade;
		}
	}
	
	public static void main(String[] args) {
		
		int sID[] = {1,2,3,4,5};
		String sName[] = {"Khushi","Meera","Diya","Mitthi","Rishaan"};
		int sGrade[] = {1,4,5,2,6};
		
		//creating an object of the class
		Q7CustomArrayList ownarraylist = new Q7CustomArrayList();
		ownarraylist.addElements(sID, sName, sGrade);
		ownarraylist.removeElement(sID, sName, sGrade);
	}

	public void removeElement(int[] sID, String[] sName, int[] sGrade) {
		// TODO Auto-generated method stub
		ArrayList<Student> arraylist = new ArrayList<>();
		for(int i=0; i<size; i++)
		{
			arraylist.remove(1);
		}
		
	}

	public void addElements(int[] sID, String[] sName, int[] sGrade) {
		// TODO Auto-generated method stub
		ArrayList<Student> arraylist = new ArrayList<>();
		for(int i=0; i<size; i++)
		{
			arraylist.add(new Student(sID[i],sName[i],sGrade[i]));
		}
		//calling the methods to print the elements of the arraylist
		displayElements(arraylist);
	}

	public void displayElements(ArrayList<Q7CustomArrayList.Student> arraylist) {
		// TODO Auto-generated method stub
		
		System.out.println("Student ID " + " Student Name " + " Student Grade");
		System.out.println("--------------------------------------------------");
		
		for(int i=0; i<size; i++)
		{
			Student student = arraylist.get(i);
			System.out.println( student.sID+"            "+ " " +student.sName+"        "+" " +student.sGrade);
		}
	
	}
}
