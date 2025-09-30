package Trees;

public class Demo {

	int id;
	Demo left;
	Demo right;
	
	public Demo() {
		// TODO Auto-generated constructor stub
	}

	public Demo(int id) {
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

	public Demo getLeft() {
		return left;
	}

	public void setLeft(Demo left) {
		this.left = left;
	}

	public Demo getRight() {
		return right;
	}

	public void setRight(Demo right) {
		this.right = right;
	}
	
	
	
}


