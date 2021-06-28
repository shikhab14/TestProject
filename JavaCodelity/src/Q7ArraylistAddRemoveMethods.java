import java.util.Scanner;

//WJP to implement your own arraylist which has two methods add() and remove() and store 5 student information in your arraylist.

public class Q7ArraylistAddRemoveMethods {

	private Object[] myStore;
	private int actSize = 0;
	
	public Q7ArraylistAddRemoveMethods()
	{
		myStore = new Object[10];
	}
	
	public Object get(int index)
	{
		if(index<actSize)
		{
			return myStore[index];
		}
		else
		{
			throw new ArrayIndexOutOfBoundsException();
		}
	}
	public void add(Object obj)
	{
		if(myStore.length-actSize <=5)
		{
			increaseListSize();
		}
		myStore[actSize++] = obj;
	}

	private void increaseListSize() {
		// TODO Auto-generated method stub
		
	}
}
