import java.util.Stack;

public class RemoveDuplicatesFromSortedList {

	static Node head;
	static Node head1;

	static class Node {
		int data;
		Node next;

		public Node(int data) {
			this.data = data;
		}
	}

	public void append(int data) {
		if (head == null) {
			head = new Node(data);
		}
		Node current = head;
		while (current.next != null) {
			current = current.next;
		}
		current.next = new Node(data);

	}

	public void removeDuplicates() {

		Node current = head;
		while (current != null) {
			Node temp = current;
			while (temp != null && temp.data == current.data) {
				temp = temp.next;
			}
			current.next = temp;
			current = current.next;
		}

	}

	public void print(Node head) {
		while (head != null) {
			System.out.print(head.data + " ");
			head = head.next;
		}
	}

	public Node swapNodeUsingSwapping(Node node, int x, int y) {
		if (head == null || head.next == null) {
			return node;
		}
		Node prev1 = null, prev2 = null, t1 = null, t2 = null;

		head = node;
		while (node != null) {
			if (node.data == x) {
				t1 = node;
				break;
			}
			prev1 = node;
			node = node.next;
		}

		node = head;
		while (node != null) {
			if (node.data == y) {
				t2 = node;
				break;
			}
			prev2 = node;
			node = node.next;
		}

		if (t1 == null || t2 == null) {
			return head;
		}

		if (prev1 != null) {
			prev1.next = t2;
		} else {
			head = t2;
		}
		if (prev2 != null) {
			prev2.next = t1;
		} else {
			head = t1;
		}

		Node tmp = t1.next;
		t1.next = t2.next;
		t2.next = tmp;

		return head;
	}

	public Node add2Numbers(Node node1, Node node2) {
		Node result = new Node(0);
		Node l3 = result;
		Node l1 = node1;
		Node l2 = node2;
		int carry = 0;
		while (l1 != null || l2 != null) {
			int l1_data = (l1 != null) ? l1.data : 0;
			int l2_data = (l2 != null) ? l2.data : 0;
			int sum = l1_data + l2_data + carry;
			carry = sum / 10;
			int lastDigit = sum % 10;
			Node newNode = new Node(lastDigit);
			l3.next = newNode;

			if (l1 != null)
				l1 = l1.next;
			if (l2 != null)
				l2 = l2.next;
			l3 = l3.next;
		}

		if (carry > 0) {
			Node newNode = new Node(carry);
			l3.next = newNode;
			l3 = l3.next;
		}
		return result.next;
	}

	public void middleElement(Node head) {
		Node slow = head;
		Node fast = head;
		while (fast != null && fast.next != null) {
			fast = fast.next.next;
			slow = slow.next;
		}

		System.out.println("Middle element is " + slow.data);
	}

	public int getNthnodeFromEnd(Node head, int n) {
		if (head == null || head.next == null) {
			return 0;
		}
		Node p = head;
		Node f = head; // move by n-1 position
		int cnt = 1;
		while (cnt <= n - 1) {
			f = f.next;
			cnt++;
		}
		while (f.next != null) {

			p = p.next;
			f = f.next;
		}

		return p.data;
	}

	public Node removeNthnodeFromEnd(Node head, int n) {
		if (head == null || head.next == null) {
			return null;
		}
		Node p = head;
		Node f = head; // move by n+1 position
		int cnt = 0;
		while (cnt < n + 1) {
			f = f.next;
			cnt++;
		}
		while (f != null) {

			p = p.next;
			f = f.next;
		}

		p.next = p.next.next;

		return p;
	}

	public void pairwiseSwap(Node head) {
		Node temp = head;
		while (temp != null && temp.next != null) {
			int k = temp.data;
			temp.data = temp.next.data;
			temp.next.data = k;
			temp = temp.next.next;
		}

	}

	Node pairWiseSwap(Node node) {

		// If linked list is empty or there is only one node in list
		if (node == null || node.next == null) {
			return node;
		}

		// Initialize previous and current pointers
		Node prev = node;
		Node curr = node.next;

		node = curr; // Change head before proceeeding

		// Traverse the list
		while (true) {
			Node next = curr.next;
			curr.next = prev; // Change next of current as previous node

			// If next NULL or next is the last node
			if (next == null || next.next == null) {
				prev.next = next;
				break;
			}

			// Change next of previous to next next
			prev.next = next.next;

			// Update previous and curr
			prev = next;
			curr = prev.next;
		}
		return node;
	}

	public Node add2NumbersUsingStack(Node node1, Node node2) {

		Node l1 = node1;
		Node l2 = node2;
		Stack<Integer> s1 = new Stack<>();
		Stack<Integer> s2 = new Stack<>();
		int carry = 0;
		while (l1 != null) {
			s1.push(l1.data);
			l1 = l1.next;
		}
		while (l2 != null) {
			s2.push(l2.data);
			l2 = l2.next;
		}

		Node result = null;
		Node l3 = result;
		while (!s1.empty() || !s2.empty()) {
			int a = 0, b = 0;
			if (!s1.empty()) {
				a = s1.peek();
				s1.pop();
			}
			if (!s2.empty()) {
				b = s2.peek();
				s2.pop();
			}
			int sum = a + b + carry;
			carry = sum / 10;
			int lastDigit = sum % 10;
			Node newNode = new Node(lastDigit);
			if (result == null) {
				result = newNode;
			} else {
				newNode.next = result;
				result = newNode;
			}
		}
		if (carry > 0) {
			Node newNode = new Node(carry);
			newNode.next = result;
			result = newNode;
		}
		return result;
	}

	public void detectLoop(Node head) {
		Node slow = head;
		Node fast = head;
		int flag = 0;
		while (slow != null && fast != null && fast.next != null) {
			slow = slow.next;
			fast = fast.next.next;
			if (slow == fast) {
				flag = 1;
				break;
			}

		}
		if (flag == 1) {
			System.out.println("Loop is present");
		} else {
			System.out.println("Loop is not present");
		}
	}

	public Node getMiddle(Node head) {
	
		Node slow = head;
		Node fast = head;
		while (fast.next != null & fast!= null) {
			slow = slow.next;
			fast = fast.next.next;
		}
		return slow;
	}

	public Node mergeSortOnLinkedList(Node head) {
		// Base condition
		// 1)Get middle of element
		// 2)Set next of middle to null
		// 3)Apply merge sort on left list
		// 4)apply merge sort on right list
		// 5)Merge the two sorted list
		if (head == null || head.next == null) {
			return head;
		}

		Node middle = getMiddle(head);
		Node nextOfMiddle = middle.next;
		middle.next = null;
		Node left = mergeSortOnLinkedList(head);
		Node right = mergeSortOnLinkedList(nextOfMiddle);
		Node sortedList = mergeSortedList(left, right);
		return sortedList;
	}

	public Node mergeSortedList(Node a, Node b) {
		Node result = null;
		if (a == null) {
			return b;
		}
		if (b == null) {
			return a;
		}
		if (a.data <= b.data) {
			result = a;
			result.next = mergeSortedList(a.next, b);
		} else {
			result = b;
			result.next = mergeSortedList(a, b.next);
		}
		return result;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RemoveDuplicatesFromSortedList linky = new RemoveDuplicatesFromSortedList();
		/*
		 * linky.head = new Node(1); linky.head.next = new Node(2); linky.head.next.next
		 * = new Node(3); linky.head.next.next.next = new Node(4);
		 * linky.head.next.next.next.next = new Node(5);
		 */

		// linky.head.next.next.next.next.next = new Node(6);
		// linky.head.next.next.next.next.next.next = new Node(7);

//		System.out.println("Linked list before calling pairwiseSwap() ");
//		linky.print(head);
//		Node st = linky.pairWiseSwap(head);
//		System.out.println("");
//		System.out.println("Linked list after calling pairwiseSwap() ");
//		linky.print(st);
//		System.out.println("");
//		linky.head1 = new Node(7);
//		linky.head1.next = new Node(0);
//		linky.head1.next.next = new Node(1);
		// linky.removeDuplicates();
		// Node result = linky.swapNodeUsingSwapping(head, 12, 14);
		// Node result = linky.add2Numbers(head, head1);
		// linky.print(result); //123+107= 230
		// linky.middleElement(head);
		// System.out.println(linky.getNthnodeFromEnd(head, 4));
		// linky.removeNthnodeFromEnd(head, 4);
		// linky.pairwiseSwap(head);

		// Node result = linky.add2NumbersUsingStack(head, head1);
		// linky.print(result);
//		linky.append(20);
//		linky.append(4);
//		linky.append(15);
//		linky.append(10);
//		linky.head.next.next.next.next = linky.head;
		// linky.detectLoop(head);

		/*
		 * linky.head = new Node(50); linky.head.next = new Node(20);
		 * linky.head.next.next = new Node(15); linky.head.next.next.next = new Node(4);
		 * linky.head.next.next.next.next = new Node(10);
		 * 
		 * // Creating a loop for testing head.next.next.next.next.next =
		 * head.next.next; linky.detectAndRemoveLoop(head);
		 * System.out.println("Linked List after removing loop : "); linky.print(head);
		 * linky.detectAndRemoveLoop(head); linky.print(head);
		 */

		linky.head1 = new Node(7);
		linky.head1.next = new Node(0);
		linky.head1.next.next = new Node(1);
		linky.head1.next.next.next = new Node(6);
		linky.head1.next.next.next.next = new Node(4);
		linky.head1.next.next.next.next.next = new Node(8);

		// Apply merge Sort
		Node result = linky.mergeSortOnLinkedList(head1);
		System.out.print("\n Sorted Linked List is: \n");
		linky.print(result);
	}

}
