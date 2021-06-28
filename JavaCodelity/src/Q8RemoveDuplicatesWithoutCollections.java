import java.util.ArrayList;

//Store user defined employee objects into arraylist and remove duplicates from arraylist without using collections.
	
class Employee	
{
	int eNo;
	String name;

	Employee(int eNo, String name)
	{
		this.eNo = eNo;
		this.name = name;
	}
	 public Employee() 
	 {
	  
	 }
	 //Display all employees data 
	 void display(ArrayList<Employee> list) 
	 {
		System.out.println("Employee Detail: ");
		for(Employee emp: list) 
		{
			System.out.println("Employee Number: "+emp.eNo+ " Employee Name: "+emp.name);
			
		}
	}
	 
}

public class Q8RemoveDuplicatesWithoutCollections	
{
	public static void main(String[] args) {
	
		Employee emp1 = new Employee(1, "Raj");
		Employee emp2 = new Employee(2, "Rahul");
		Employee emp3 = new Employee(3, "Vinod");
		Employee emp4 = new Employee(4, "Shrikant");
		Employee emp5 = new Employee(2, "Rahul");
		
		ArrayList<Employee> list = new ArrayList<Employee>(); 
		
		list.add(emp1);
		list.add(emp2);
		list.add(emp3);
		list.add(emp4);
		list.add(emp5);
		
		Employee temp = new Employee();
		
		temp.display(list);
		
		for(int i=0; i<list.size();i++)
		{
			for(int j=i+1; j<list.size();j++)
			{
				if(list.get(i).equals(list.get(j)))
				{
					list.remove(j);
					j--;
				}
			}
		}	
		System.out.println("After Removing duplicate elements: "+list);
	}
}
