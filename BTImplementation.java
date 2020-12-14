
public class BTImplementation {
	
	static class Node{
		Node left, right;
		int data;
		public Node(int data) {
			this.data=data;
		}
		
		public void insert(int value) {
			if(value<=data) {
				if(left==null) {
					left = new Node(value);
				}else {
					left.insert(value);
				}
			}else {
				if(right==null) {
					right = new Node(value);
				}else {
					right.insert(value);
				}
			}
		}
		
		public boolean contains(int value) {
			if(value==data) {
				return true;
			}else if(value < data) {
				if(left==null) {
					return false;
				}else {
					return left.contains(value);
				}
			}else {
				if(right==null) {
					return false;
				}else {
					return right.contains(value);
				}
			}
		}
		
		public void printOrder() {
			if(left!=null) {
				left.printOrder();
			}
			System.out.print(data + " ");
			if(right!=null) {
				right.printOrder();
			}
		}
	}
	
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BTImplementation bt = new BTImplementation();
		Node node = new Node(10);
		node.left = new Node(5);
		node.right = new Node(15);
		node.insert(8);
		System.out.println(node.contains(85));
		node.printOrder();
	}

}
