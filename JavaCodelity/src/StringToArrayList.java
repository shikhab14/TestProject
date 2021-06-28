import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class StringToArrayList {

	public static void main(String[] args) {
		
		String num = "12,05,19,14,88,86";
		String[] str = num.split(",");
		
		List<String> al = new ArrayList<String>();
		al = Arrays.asList(str);
		for(String s:al)
		{
			System.out.println(s);
		}
		
	}
}
