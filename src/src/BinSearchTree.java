public class BinSearchTree {

	TreeNode root = null;

	////////////////////////////////////////
	//insert newInt into the bst
	boolean insert(int newInt) {
		TreeNode p = root, q = null;

		while (p != null) {

			// search succeeds, no need to insert
			if (p.info == newInt)
				return false;

			// q, the parent, is now p
			q = p;

			// left < parent < right
			if (newInt < p.info) {
				p = p.left;
			} else {
				p = p.right;
			}
		}// once out of the loop, the search has failed

		//create and insert node
		TreeNode v = new TreeNode(newInt);
		if (q == null) {
			System.out.println("Insert at root " + v.info);
			root = v;  // new tree with v as root
		} else if (newInt < q.info) {
			System.out.println("Insert " + v.info + " left to " + q.info);
			q.left = v;
		} else {
			System.out.println("Insert " + v.info + " right to " + q.info);
			q.right = v;
		}

		return true;
	}

	///////////////////////////////////////////
	// Recursive insert methods	
	public void sInsert(int key) {
		TreeNode el = new TreeNode(key);
		if (root == null) {
			root = el;
			return;
		}
		if (root.info > key)
			insL(root, el);
		else
			insR(root, el);
	}

	//insert left
	protected void insL(TreeNode n, TreeNode el) {
		if (n.left == null) {
			n.left = el;
			return;
		}
		if (n.left.info > el.info) {
			insL(n.left, el);
			return;
		}
		insR(n.left, el);
	}

	//insert right
	protected void insR(TreeNode n, TreeNode el) {
		if (n.right == null) {
			n.right = el;
			return;
		}
		if (n.right.info > el.info) {
			insL(n.right, el);
			return;
		}
		insR(n.right, el);
	}



	/*// Recursive delete methods
	public void sDelete(int key) {
		TreeNode el = new TreeNode(key);

		if (root == null) {
			return; // tree empty
		}
		if (root.info > key)
			delL(root, el);
		else
			delR(root, el);
	}

	//delete left
	protected void delL(TreeNode n, TreeNode el) {
		if (n.left == null) {
			return;
		}

		if (n.left.info > el.info) {
			delL(n.left, el);
			return;
		}
		delR(n.left, el);
	}

	//delete right
	protected void delR(TreeNode n, TreeNode el) {
	if (n.right == null) {
		n.right = el;
		return;
	}
	if (n.right.info > el.info) {
		delL(n.right, el);
		return;
	}
	delR(n.right, el);
	}
*/



	//////////////////////////////////////////////	
	//delete the node with info = key, uses the successor as replacement
	public int delete(int key) {
		TreeNode p = root, q = null;

		// search for the node with the key
		// p = the node to remove and 
		// q = its parent, if any
		while (p != null && p.info != key) {
			q = p;
			if (key < p.info)
				p = p.left;
			else
				p = p.right;
		}

		// the key does not exist in the tree; leave the tree unchanged
		if (p == null)
			return -1;

		//int result = p.info;

		// set the variable rp to the node that will replace node(p)
		// first two cases: the node to be deleted has at most one child
		TreeNode rp;
		if (p.left == null)
			rp = p.right;
		else if (p.right == null)
			rp = p.left;
		else {
			// third case: node(p) has two children
			// Set rp to the inorder SUCCESSOR of p and 
			// f to the parent of rp
			TreeNode f = p;
			rp = p.right;
			TreeNode s = rp.left;

			// s is always the left child of rp
			while (s != null) {
				f = rp;
				rp = s;
				s = rp.left;
			}

			// At this point, rp is the inorder successor of p
			if (f != p) {
				// p is not the parent of rp and rp == left(f)
				f.left = rp.right;
				// remove node(rp) from its current position and
				// replace it with the right child of node(rp)
				// node(rp) takes the place of node(p)
				rp.right = p.right;
			}

			// set the left child of node(rp) so that
			// node(rp) takes the place of node(p)
			rp.left = p.left;
		} // end if

		// insert node(rp) into the position formerly occupied by
		// node(p)
		if (q == null)    // node(p) was the root of the tree
			root = rp;
		else if (p == q.left)
			q.left = rp;
		else
			q.right = rp;

		// return the info of the replacement (of the node we deleted)
		// or -100 if node was replaced with null
		return rp != null ? rp.info : -100;
	}

	public String toString() {
		if (root == null)
			return "";
		return toS(root.left) + " (" + root.info + ") " + toS(root.right);
	}

	protected String toS(TreeNode n) {
		if (n == null)
			return "";
		return toS(n.left) + " " + n.info + " " + toS(n.right);
	}

	protected int partition (int x[], int lb, int ub){
		int down, up, a, temp;

		a = x[lb];  // the pivot element
		up = ub;
		down = lb;
		//traverse the array and swap elements
		while (down < up){
			while (x[down] <= a && down < ub)
				down++;
			while (x[up] > a)
				up--;
			if (down < up){
				temp = x[down];
				x[down] = x[up];
				x[up] = temp;
			}
		}

		x[lb] = x[up];
		x[up] = a;

		//return the index where the pivot is now at

		return up;
	} // end partition

	// main qsort method with array, lower and upper bound
	public void quicksort(int x[], int lb, int ub){
		// lower bound crossed upper bound
		if(lb >= ub)	return;

		// index j = the index of the "pivot"
		int j = partition(x, lb, ub);
		// ^^ this function will choose
		// which element to partition
		// around

		quicksort(x, lb, j-1); // quicksort on left of j
		quicksort(x, j+1, ub); // quicksort on the right of j
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

}