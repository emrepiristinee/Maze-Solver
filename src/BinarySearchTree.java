
public class BinarySearchTree {
	public Node root;

	public BinarySearchTree() {
		root = null;
	}
	
	public void insert(int id) {
		Node newNode = new Node(id);
		if (root == null) {
			root = newNode;
			return;
		}
		Node current = root;
		Node parent = null;
		while (true) {
			
			parent = current;
			if (parent.data > id) {
				parent.setData(id);
			} 
			else {
				current = current.right;
				parent.setData(id);
			}
			// CHECK WHERE TO ADD THE NEW DATA, RETURN AFTER ADDITION ////////////////
			//...........
			//...........
			//...........
			//...........
			//...........
			//...........
			//...........
			//...........
			//...........
			//...........
			//...........
			//...........
			//////////////////////////////////////////////////////////////////////////
		}
	}
	
	public boolean search(int id) {
		Node current = root;		
		while (current != null) {
			
			if (current.data == id) {
				return true;
			} 
			else if (current.data > id) {
				current = current.left;
			} 
			else {
				current = current.right;
			}
			
		}
		return false;
	}

	public boolean delete(int id) {

		Node parent = root;
		Node current = root;

		boolean isLeftChild = false;

		while (current.data != id) {

			parent = current;
			if(current.data>id){
				
				isLeftChild = true;
				current = current.left;
				
			}else{
				
				isLeftChild = false;
				current = current.right;
				
			}
			if (current == null) {
				return false;
			}
		}

		// if we are here that means we have found the node
		// Case 1: if node to be deleted has no children
		if (current.left == null && current.right == null) {

			if (current == root) {

				root = null;
			}
			if (isLeftChild == true) {

				parent.left = null;

			} else {

				parent.right = null;
			}
		}
		// Case 2 : if node to be deleted has only one child
		else if (current.right == null) {

			if (current == root) {

				root = current.left;

			} else if (isLeftChild) {

				parent.left = current.left;

			} else {

				parent.right = current.left;
			}
		} else if (current.left == null) {

			if (current == root) {

				root = current.right;

			} else if (isLeftChild) {

				parent.left = current.right;

			} else {

				parent.right = current.right;
			}
		}
		// Case 3 : if node to be deleted has two children
		else if (current.left != null && current.right != null) {		


			// now we have found the minimum element in the right sub tree
			Node successor = getSuccessor(current);

			if (current == root) {

				root = successor;

			} else if (isLeftChild) {

				parent.left = successor;

			} else {

				parent.right = successor;
			}

			successor.left = current.left;
		}
		return true;
	}

	public Node getSuccessor(Node deletedNode) {
		Node successor = null;
		Node successorParent = null;
		
		if (successor.getData() == deletedNode.getData()) {
			
		}
		// FIND THE SUCCESSOR OF THE DELETED NODE  ////////////////////////////////////////////
		//...........
		//...........
		//...........
		//...........
		//...........
		//...........
		//...........		
		////////////////////////////////////////////////////////////////////////////////////////

		// check if successor has the right child, it cannot have left child for sure
		// if it does have the right child, add it to the left of successorParent.
		if (successor != deletedNode.right) {
			successorParent.left = successor.right;
			successor.right = deletedNode.right;
		}

		return successor;
	}

	public void display(Node root) {
		if (root != null) {
			display(root.left);
			System.out.print(" " + root.data);
			display(root.right);
		}
	}

}
