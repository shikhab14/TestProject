import java.util.Stack;

//Implement your own queue using Stack data structure.
/*Method 1--> By making enqueue operation costly
While stack1 is not empty, push everything from stack1 to stack2.
Push x to stack1 (assuming size of stacks is unlimited).
Push everything back to stack1.

deQueue(q): 

If stack1 is empty then error
Pop an item from stack1 and return it*/

public class Q14QueueUsingStack {

	static class Queue
	{
		static Stack<Integer> s1 = new Stack<Integer>();
		static Stack<Integer> s2 = new Stack<Integer>();
		
		static void enQueue(int x)
		{
			//Move all the elements from s1 to s2
			while(!s1.isEmpty())
			{
				s2.push(s1.pop());
			}
			s1.push(x);
			
			//push evertything back to s1
			while(!s2.isEmpty())
			{
				s1.push(s2.pop());
			}
		}
		static int deQueue()
		{
			//if first stack is empty
			if(s1.isEmpty())
			{
				System.out.println("Q is Empty");
				System.exit(0);
			}
			
			//return top of s1
			int x = s1.peek();
			s1.pop();
			return x;
		}
	}
	
	public static void main(String[] args) {
		
		Queue q = new Queue();
		q.enQueue(1);
		q.enQueue(2);
		q.enQueue(3);
		
		System.out.println(q.deQueue());
		System.out.println(q.deQueue());
		System.out.println(q.deQueue());
	}
	
}
