
import java.util.Map;
import java.util.TreeMap;

// WJP to store 5 student information in a treeMap. Note: Student object has student name and student reg no.

public class Q1StudentInformationUsingTreeMap {

	public static void main(String[] args) {
		
		
		TreeMap<Integer,String> student = new TreeMap<Integer,String>();
		
		student.put(100, "Vaibhav");
		student.put(400, "Rahul");
		student.put(500, "Arjun");
		student.put(200, "Abhishek");
		student.put(300, "Ankit");
		
		for(Map.Entry m:student.entrySet())
		{
			System.out.println(m.getKey()+ " "+m.getValue());
		}
	}
}
