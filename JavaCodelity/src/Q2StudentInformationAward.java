import java.util.Scanner;

/*WJP to store 5 student information and award the students with 1st rank, 2nd rank and 3rd rank according to marks 
obtained where each student has student name, student marks and student reg no information.*/

class Student
{
	String name;
	int marks;
	int reg_no;
	
	Student()
	{
		this.name = " ";
		this.marks = 0;
		this.reg_no = 0;
	}
}

public class Q2StudentInformationAward {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Input number of students: ");
		int n = sc.nextInt();
		System.out.println("Enter the name, marks and registration number : ");
		for(int i=0;i<n;i++)
		{
			String name = sc.next();
			int marks = sc.nextInt();
			int reg_no = sc.nextInt();
		}
		
	}
}
