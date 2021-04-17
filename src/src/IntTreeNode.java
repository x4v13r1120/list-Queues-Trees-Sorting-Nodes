// IntTreeNode objects stores a single node of a binary tree of ints.

public class IntTreeNode {
    public char data; // data stored at this node
    public IntTreeNode left; // reference to left subtree
    public IntTreeNode right; // reference to right subtree

    // Constructs a leaf node with the given data.
    public IntTreeNode(char data) {
        this(data, null, null);
    }

    // Constructs a leaf or branch node with the given data and links.
    public IntTreeNode(char data, IntTreeNode left, IntTreeNode right) {
        this.data = data;
        this.left = left;
        this.right = right;
    }
}