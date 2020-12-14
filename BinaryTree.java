
public class BinaryTree {

	int data;
	BinaryTree left;
	BinaryTree right;

	public BinaryTree(int data) {
		this.data = data;
	}

	public void insert(int value) {
		if (value <= data) {
			if (left == null) {
				left = new BinaryTree(value);
			} else {
				left.insert(data);
			}
		} else {
			if (right == null) {
				right = new BinaryTree(value);
			} else {
				right.insert(value);
			}
		}
	}

	public boolean contains(int value) {
		if (value == data) {
			return true;
		} else if (value < data) {
			if (left == null) {
				return false;
			} else {
				return left.contains(value);
			}
		} else {
			if (right == null) {
				return false;
			} else {
				return right.contains(value);
			}
		}
	}

	// Inorder traversal LRootR , PreOrder - root, left, right , postorder -
	// Left,right,root
	public void printInOrder() {
		if (left != null) {
			left.printInOrder();
		}
		System.out.print(data + " ");
		if (right != null) {
			right.printInOrder();
		}
	}
	
	public void printPreOrder() {
		System.out.print(data + " ");

		if (left != null) {
			left.printInOrder();
		}
		if (right != null) {
			right.printInOrder();
		}
	}

	public void printPostOrder() {

		if (left != null) {
			left.printInOrder();
		}
		if (right != null) {
			right.printInOrder();
		}
		System.out.print(data + " ");

	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		BinaryTree b = new BinaryTree(10);
		b.left = new BinaryTree(5);
		b.left.right = new BinaryTree(8);
		b.right = new BinaryTree(15);
		b.printInOrder();
		System.out.println("");
		b.printPreOrder();
		System.out.println("");
		b.printPostOrder();

	}

}
