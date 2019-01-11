import java.util.ArrayList;

/**
 * BinaryTreeNode class.
 * <p>
 * Very basic class for building a basic binary tree of integers. Helper class,
 * of sorts, for a tree sort from the IntSorter class.
 * </p>
 * 
 * @author Steven Yi
 *
 */
public class BinaryTreeNode {
	private int value;
	private BinaryTreeNode left, right;

	/**
	 * Constructor.
	 * <p>
	 * Takes a value as an input, and creates a new tree node with that value.
	 * </p>
	 * 
	 * @param newValue value to be placed in this node
	 */
	public BinaryTreeNode(int newValue) {
		this.value = newValue;
		left = null;
		right = null;
	}

	/**
	 * Size of tree.
	 * <p>
	 * Recursively calculates the size (number of nodes) of the tree.
	 * </p>
	 * 
	 * @return the size of the tree, from that current position
	 */
	public int size() {
		int leftSize = 0, rightSize = 0;
		if (left != null) {
			leftSize = left.size();
		}
		if (right != null) {
			rightSize = right.size();
		}
		return leftSize + rightSize + 1;
	}

	/**
	 * Insert method.
	 * <p>
	 * Method to insert an integer value into the current binary tree, traversing
	 * down the tree as necessary.
	 * </p>
	 * 
	 * @param newValue value to be inserted in the binary tree
	 */
	public void insert(int newValue) {
		if (newValue <= value) {
			if (left == null) {
				left = new BinaryTreeNode(newValue);
			} else {
				left.insert(newValue);
			}
		} else {
			if (right == null) {
				right = new BinaryTreeNode(newValue);
			} else {
				right.insert(newValue);
			}
		}
	}

	/**
	 * In-order traversal.
	 * <p>
	 * Returns an array of integers representing the in-order traversal of the tree
	 * from this point in the tree.
	 * </p>
	 * 
	 * @return list of integers from this point of the tree, sorted
	 */
	public int[] inOrder() {
		if (left == null && right == null) {
			int[] sorted = {value};
			return sorted;
		}
		int[] sorted = new int[this.size()];
		int index = 0;
		if (left != null) {
			for (int value : left.inOrder()) {
				sorted[index++] = value;
			}
		}
		sorted[index++] = this.value;
		if (right != null) {
			for (int value : right.inOrder()) {
				sorted[index++] = value;
			}
		}
		return sorted;
	}
}
