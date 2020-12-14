import java.util.HashSet;
import java.util.Stack;

public class LinkyTest {

	static Node head;
	static Node left;

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
			return;
		}
		Node current = head;
		while (current.next != null) {
			current = current.next;
		}
		current.next = new Node(data);
	}

	public void prepend(int data) {
		Node newHead = new Node(data);
		newHead.next = head;
		head = newHead;
	}

	public void deleteWithValue(int data) {
		if (head == null) {
			return;
		}
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

	public void print(Node head) {
		while (head != null) {
			System.out.print(head.data + " ");
			head = head.next;
		}
	}

	public void removeDuplicates() {
		Node current = head;

		while (current.next != null) {
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

	public void removeDuplicatesUsingHashSet() {
		HashSet<Integer> set = new HashSet<>();
		Node current = head;
		Node prev = null;

		while (current != null) {
			int val = current.data;
			if (set.contains(val)) {
				prev.next = current.next;
			} else {
				set.add(val);
				prev = current;
			}
			current = current.next;
		}
	}

	public Node reverseLinky(Node head) {
		Node prev = null;
		Node current = head;
		Node next = null;
		while (current != null) {
			next = current.next; // stash next value as we change in next step so to avoid losing it we save it
			current.next = prev;// advancing the pointers
			prev = current;// advancing the pointers
			current = next;
		}
		head = prev;
		return head;
	}

	public Node reverseUsingRecursion(Node head) {
		if (head == null || head.next == null) {
			return head;
		}

		Node reverseListHead = reverseUsingRecursion(head.next);
		// hey neighbour get me reverse list until it reaches base case
		// once it gets the base case - it calculates reverse list i.e. the last node
		// and then it will pass the value to second last node
		// ->last node says i m reverse list , add yourself to me, so second last does
		// that and this is pass to node before second
		// so on until it reaches top , (while doing this in recursion we also pass the
		// list head up at each recursive call)
		head.next.next = head;
		head.next = null;
		return reverseListHead;

	}

	public boolean chkPalindromeinLinky(Node head) {
		boolean isPalin = true;
		Node node = head;
		Stack<Integer> stack = new Stack<>();
		while (node != null) {
			stack.push(node.data);
			node = node.next;
		}
		while (head != null) {
			int i = stack.pop();
			if (head.data == i) {
				isPalin = true;
			} else {
				isPalin = false;
				break;
			}
			head = head.next;
		}

		return isPalin;

	}

	public boolean chkPalindromeByReversingtheLinky(Node head) {
		Node slow = head;
		Node fast = head;

		while (fast != null && fast.next!=null) {
			fast = fast.next.next;
			slow = slow.next;
		}

		slow = reverseForPalindrome(slow);
		fast = head;

		while (slow != null) {
			if (slow.data != fast.data) {
				return false;
			}
			slow = slow.next;
			fast = fast.next;
		}
		return true;
	}

	public Node reverseForPalindrome(Node head) {

		Node prev = null;
		while (head != null) {
			Node next = head.next; // stash next node of head 
			head.next = prev;// change the ptrs
			prev = head;// advance the ptrs
			head = next;
		}
		return prev;

	}

    public boolean isPalindromeUsingRecursion(Node right) {
    	//30, 40 , 50, 40, 30
    	
    	if(right==null) {
    		return true;
    	}
    	boolean isPal = isPalindromeUsingRecursion(right.next);
    	if(!isPal) {
    		return false;
    	}
    	
    	if(left.data==right.data) {
    		left=left.next;
    		return true;
    	
    	}
    	
    	return false;
    }
    
    
    public Node rotateRight(Node head, int k) {
        if(head==null){
            return null;
        }
      //The main catch here is the newHead will be at node -> n-k  where n is the length of linked list
   //1) Find list length 
        int len = 1;
        Node tail = head;
        while(tail.next!=null){
            len++;
            tail=tail.next;
        }
        //2 take K mod to reduce the number of rotations
        k%=len;
        //special condition if the number of rotations results in the number of nodes
        if(k==0){
            return head;
        }
        //get the newHead location
        int stepsToNewHead= len-k;
        //point the last node's next to first node
        tail.next=head;
        //create a new node to get the newHead
        Node newTail = tail;
        //this loop will help to get the head point to newHead
        while(stepsToNewHead!=0){
            newTail=newTail.next;
            stepsToNewHead--;
        }
        Node newHead = newTail.next;
        //point the newHead's next to null and then return the newHead
            newTail.next=null;
        return newHead;
    }
    public boolean isPalindrome(Node head) {
    	 left= head;
    	return isPalindromeUsingRecursion(head);
    }
	public static void main(String args[]) {
		LinkyTest linky = new LinkyTest();
		linky.head = new Node(1);
		linky.head.next = new Node(2);
		linky.head.next.next = new Node(3);
		linky.head.next.next.next = new Node(4);
		linky.head.next.next.next.next = new Node(5);
		// linky.removeDuplicates();
		// linky.removeDuplicatesUsingHashSet();
		// linky.print(head);
		// head=linky.reverseLinky(head);
		// head=linky.reverseUsingRecursion(head);
		// System.out.println("");
		 //linky.print(head);
		// System.out.println(linky.chkPalindromeinLinky(head));
		//System.out.println(linky.chkPalindromeByReversingtheLinky(head));
		//System.out.println(linky.isPalindrome(head));
		linky.rotateRight(head,2);
		linky.print(head);
	}
}
