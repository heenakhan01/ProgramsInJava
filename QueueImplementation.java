//FIFO movie example
public class QueueImplementation {
	
	static Node head; // add things here
	static Node tail; // remove things from here
	static class Node{
		int data;
		Node next;
		public Node(int data) {
			this.data = data;
		}
		
	}
		public static boolean isEmpty() {
			return head==null;
		}
		public int peek() {
			return head.data;
		}
		
		public  void add(int data) {
			Node node = new Node(data);
			if(tail!=null) {
				tail.next=node;
			}
			tail=node;
			if(head==null) {
				head=node;
			}
		}
		public  int remove() {
			int data =  head.data;
			head=head.next;
			if(head==null) {
				tail=null;
			}
			return data;
		}
		
		public static void main(String args[]) {
			QueueImplementation q = new QueueImplementation();
			q.head=new Node(10);
			q.head.next=new Node(20);
			q.head.next.next=new Node(30);
			int d =q.remove();
			System.out.println(d);
		}
	
}

