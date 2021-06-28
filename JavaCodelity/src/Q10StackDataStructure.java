
class Stack
{
	private int arr[];
	private int top;
	private int capacity;
	
	//constructor to initialize the stack
	Stack(int size)
	{
		arr = new int[size];
		capacity = size;
		top = -1;
	}
	
	//function to add element 'x' to stack
	public void push(int x)
	{
		if(isFull())
		{
			System.out.println("Overflow");
			System.exit(1);
		}
		System.out.println("Inserting " +x);
		arr[++top]=x;
	}
		//function to pop a top element from the stack
		public int pop()
		{
			if(isEmpty())
			{
				System.out.println("Underflow");
				System.exit(1);
			}
			System.out.println("Removing " +peek());
			return arr[top--];
		}
		//function to return the top element of the stack
		public int peek()
		{
			if(!isEmpty())
			{
				return arr[top];
			}
			else
			{
				System.exit(1);
			}
			return -1;
		}
		//function to return the size of the stack
		public int size()
		{
			return top + 1;
		}
		//function to check if the stack is empty or not
		public boolean isEmpty() {
			return top == -1;
		}
		//function to check stack is full or not
		public boolean isFull()
		{
			return top == capacity-1;
		}
		
}
public class Q10StackDataStructure {

		public static void main(String[] args) {
		
		Stack stack = new Stack(3);
		
		stack.push(1);
		stack.push(2);
		stack.push(3);
		//stack.push(4);
		
		stack.pop();
		stack.pop();
		//stack.pop();
		//stack.pop();
		
		
		System.out.println("The top element is " +stack.peek());
		System.out.println("The stack size is " +stack.size());
		
		//check if the stack is empty
		if(stack.isEmpty())
		{
			System.out.println("The stack is empty");
		}
		else
		{
			System.out.println("The stack is not empty");
		}
	}
}
