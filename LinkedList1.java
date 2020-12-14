
public class LinkedList1 {
	static Node head;

	static class Node {
		int data;
		Node next;

		public Node(int data) {
			this.data = data;
		}

	}

	public static void append(int data) {
		if (head == null) {
			head = new Node(data);
			return;
		}

		Node current = head;
		while (current.next != null) {
			current = current.next;
		}
		current.next = new Node(data);
		

	}

	public static void prepend(int data) {
		Node newHead = new Node(data);
		newHead.next = head;
		head = newHead;
		
	}

	public static void deleteWithValue(int data) {
		if (head == null)
			return;
		if (head.data == data) {
			head = head.next;
			return;
		}
		Node current = head;
		while (current.next != null) {
			if (current.next.data == data) {
				current.next = current.next.next;
				return;
			}
			current = current.next;
		}
		
	}

	public static void removeDuplicates(Node head) {
	
		Node current = head;
		while (current != null) {
			Node runner = current;
			while (runner.next != null) {
				if (runner.next.data == current.data) {
					runner.next = runner.next.next;
				} else {
					runner = runner.next;
				}
			}
			current = current.next;
		}
	}

	public static void print() {
		while (head != null) {
			System.out.print(head.data + " ");
			head = head.next;
		}
	}

	public static void main(String args[]) {
LinkedList1 list = new LinkedList1();
		list.head = new Node(65);

		head.next = new Node(55);
		head.next.next=new Node(65);
		head.next.next.next= new Node(75);

		removeDuplicates(head);
		print();
	
	}
}
