package binary_searched_tree;

public class Tree {
	Node root;

	public void add(int value) {
		Node node = new Node(value);

		if (root == null) {
			root = node;
			return;
		}

		Node current = root;
		while (true) {
			if (value < current.value) {
				if (current.left == null) {
					current.left = node;
					break;
				}
				current = current.left;
			} else {
				if (current.right == null) {
					current.right = node;
					break;
				}
				current = current.right;
			}
		}
	}

	public boolean get(int value) {
		Node current = root;
		while (current != null) {
			if (value < current.value)
				current = current.left;
			else if (value > current.value)
				current = current.right;
			else
				return true;
		}
		return false;
	}
}
