/**
 * Integer binary tree.
 * <p>
 * Binary tree class. There's really not much, if any, code that can't be placed
 * into IntSorter, but I do feel like it makes life a bit easier, and makes
 * IntSorter look just a bit cleaner. Small caveat that this tree does allow for
 * duplicate values. For convention, they'll be to the left.
 * </p>
 * 
 * @author Steven Yi
 *
 */
public class BinaryTree {
	private BinaryTreeNode root;

	/**
	 * Default constructor.
	 * <p>
	 * Default constructor. Root becomes null, and honestly, there's no real good
	 * use for this.
	 * </p>
	 */
	public BinaryTree() {
		root = null;
	}

	/**
	 * Constructor with list of values.
	 * <p>
	 * Takes a list as input, and iterates through the list, inserting the values
	 * where they go in the tree. Should end with a binary search tree that
	 * satisfies the ordering property.
	 * </p>
	 * 
	 * @param values list of values to be inserted to the tree
	 */
	public BinaryTree(int[] values) {
		root = new BinaryTreeNode(values[0]);
		for (int k = 1; k < values.length; k++) {
			root.insert(values[k]);
		}
	}
	
	public int size() {
		return root.size();
	}

	/**
	 * In-order traversal.
	 * <p>
	 * In-order traversal of the binary tree, starting at the root.
	 * </p>
	 * 
	 * @return list of all the values in the binary tree, sorted.
	 */
	public int[] inOrder() {
		return root.inOrder();
	}
}
