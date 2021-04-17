import com.sun.source.tree.Tree;
import org.w3c.dom.Node;

import java.util.Arrays;

public class SortedTree {
    TreeNode root;

    public SortedTree(int[] input) {
        root = buildTree(input, 0, input.length - 1); // this calls your method
    }

    public TreeNode buildTree(int[] input, int i, int i1) {
        int mid = (i + i1) / 2; //finds the mid by adding the start to the end and splitting it
        TreeNode p = new TreeNode(input[mid]); // creates root node at the middle

        if (i == i1) //checks to see if  we are at the end of the index[]
            return p;
        if (i > i1) //check if we have a unbalanced tree somewhere
            return null;

        p.left = buildTree(input, i, mid - 1); //recursive left and right
        p.right = buildTree(input, mid + 1, i1);

        return p;
    }

    // Prints an in-order traversal of this tree.
    public void printInOrder() {
        printInOrder(root);
        System.out.println();
    }

    // Prints an in-order traversal of the tree starting at the specified root
    private void printInOrder(TreeNode root) {
        if (root != null) {
            printInOrder(root.left);
            System.out.print(root.info + " ");
            printInOrder(root.right);
        }
    }

    public int nodeCount(TreeNode rt) {
        if (rt == null)
            return 0;
        return 1 + (nodeCount(rt.left) + nodeCount(rt.right));
    }

    // return the height/depth of a binary tree:
	public int height(TreeNode rt){
        if (rt == null)
            return 0;

        int LDepth = height(rt.left);
        int RDepth = height(rt.right);

        if (LDepth > RDepth){
            return LDepth + 1;
        } else {
            return RDepth + 1;
        }
    }

    // return the sum of the values for all of the nodes of the binary tree
    public int sumAll(TreeNode rt){
        if (rt == null)
            return 0;

        return rt.info + sumAll(rt.left) + sumAll(rt.right);
    }

    // In Java automatic garbage collection
    // happens, so we can simply make root
    // null to delete the tree
    public void deleteTree(TreeNode n)
    {
        root = null;
    }

    // Delete leaf nodes from binary search tree.
    public TreeNode leafDelete(TreeNode rt)
    {
        if (rt == null) {
            return null;
        }
        if (rt.left == null && rt.right == null) {
            return null;
        }

        // Else recursively delete in left and right
        // subtrees.
        rt.left = leafDelete(rt.left);
        rt.right = leafDelete(rt.right);

        return rt;
    }
    /* A recursive function to
     delete an existing key in BST
    */
    public TreeNode deleteRec(TreeNode rt, int key) {
        /* Base Case: If the tree is empty */
        if (rt == null)
            return rt;

        /* Otherwise, recur down the tree */
        if (key < rt.info)
            rt.left = deleteRec(rt.left, key);
        else if (key > rt.info)
            rt.right = deleteRec(rt.right, key);

            // if key is same as root's
            // key, then This is the
            // node to be deleted
        else {
            // node with only one child or no child
            if (rt.left == null)
                return rt.right;
            else if (rt.right == null)
                return rt.left;

            // node with two children: Get the inorder
            // successor (smallest in the right subtree)
            rt.info = minValue(rt.right);

            // Delete the inorder successor
            rt.right = deleteRec(rt.right, rt.info);
        }

        return rt;
    }

    public int minValue(TreeNode rt) {
        int minv = rt.info;
        while (rt.left != null)
        {
            minv = rt.left.info;
            rt = rt.left;
        }
        return minv;
    }
    /* preorder*/
    public void preTrav(TreeNode tree){
        if(tree!=null){
            System.out.println(tree.info);  // visit the root
            preTrav(tree.left);  // traverse the left subtree
            preTrav(tree.right); //traverse the right subtree
        }
    }

    /* postorder*/
    public void postTrav(TreeNode tree){
        if(tree!=null){
            postTrav (tree.left);  // traverse the left subtree
            postTrav (tree.right); //traverse the right subtree
            System.out.println(tree.info);  // visit the root
        }
    }

    /* inorder*/
    public void inTrav(TreeNode tree){
        if(tree!=null){
            inTrav(tree.left);  // traverse the left subtree
            System.out.println(tree.info);  // visit the root
            inTrav(tree.right); //traverse the right subtree
        }
    }


}