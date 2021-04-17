// An IntTree object represents an entire binary tree of ints.
public class IntTree {
    IntTreeNode overallRoot;

    // Constructs an empty binary tree
    public IntTree() {
        overallRoot = null;
    }

    // Constructs a binary tree with the given node as its root.
    public IntTree(IntTreeNode overallRoot) {
        this.overallRoot = overallRoot;
    }

    // Prints a pre-order traversal of this tree.
    public void printPreOrder() {
        printPreOrder(overallRoot);
        System.out.println();
    }

    // Prints a pre-order traversal of the tree starting at the specified root
    private void printPreOrder(IntTreeNode root) {
        // implicit base case: do nothing if we reach a null root
        if (root != null) {
            System.out.print(root.data + " ");
            printPreOrder(root.left);
            printPreOrder(root.right);
        }
    }

    // Prints an in-order traversal of this tree.
    public void printInOrder() {
        printInOrder(overallRoot);
        System.out.println();
    }

    // Prints an in-order traversal of the tree starting at the specified root
    private void printInOrder(IntTreeNode root) {
        if (root != null) {
            printInOrder(root.left);
            System.out.print(root.data + " ");
            printInOrder(root.right);
        }
    }

    // Prints a post-order traversal of this tree.
    public void printPostOrder() {
        printPostOrder(overallRoot);
        System.out.println();
    }

    // Prints a post-order traversal of the tree starting at the specified root
    private void printPostOrder(IntTreeNode root) {
        if (root != null) {
            printPostOrder(root.left);
            printPostOrder(root.right);
            System.out.print(root.data + " ");
        }
    }
}