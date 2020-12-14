
public class StackImplementation {
	
	static Node top;
	static class Node{
		int data;
		Node next;
		public Node(int data) {
			this.data = data;
		}
	}
	
	public boolean isEmpty() {
		return top==null;
	}
	public int peek() {
		return top.data;
	}
	public void push(int data) {
		Node node = new Node(data);
		if(top==null) {
			top=node;
		}
		node.next=top; //node.next will point to old top
		top=node; // top needs to points to node
	}
	public int pop() {
		if(top==null) {
			System.out.println("The stack is empty");
			return -1;
		}else {
			int data = top.data;
			top=top.next;
			return data;
		}
	}

	public static void main(String[] args) {
		StackImplementation st = new StackImplementation();
		st.top= new Node(10);
		st.top.next= new Node(20);
		st.top.next.next = new Node(30);
		 System.out.println(st.pop());
		
	}

}
