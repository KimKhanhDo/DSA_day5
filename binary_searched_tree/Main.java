package binary_searched_tree;

public class Main {
	public static void main(String[] args) {
		Tree tree = new Tree();

		// Add elements to the binary search tree
		tree.add(10);
		tree.add(5);
		tree.add(15);

		// Check if values are present in the tree
	
		System.out.println(tree.get(15));
		System.out.println(tree.get(8));
	}

}
