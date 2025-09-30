package Trees;

public class Node {

	int id;
	Node left;
	Node right;
	
	public Node() {
		// TODO Auto-generated constructor stub
	}

	public Node(int id) {
		super();
		this.id = id;
		this.left = null;
		this.right = null;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Node getLeft() {
		return left;
	}

	public void setLeft(Node left) {
		this.left = left;
	}

	public Node getRight() {
		return right;
	}

	public void setRight(Node right) {
		this.right = right;
	}

	@Override
	public String toString() {
		return "Node [id=" + id + ", left=" + left + ", right=" + right + "]";
	}
	
	
}
