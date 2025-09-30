package Trees;

public class RK {

	int id;
	RK left;
	RK right;
	
	public RK() {
		// TODO Auto-generated constructor stub
	}

	public RK(int id) {
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

	public RK getLeft() {
		return left;
	}

	public void setLeft(RK left) {
		this.left = left;
	}

	public RK getRight() {
		return right;
	}

	public void setRight(RK right) {
		this.right = right;
	}

	@Override
	public String toString() {
		return "RK [id=" + id + ", left=" + left + ", right=" + right + "]";
	}
	
	
	
}
