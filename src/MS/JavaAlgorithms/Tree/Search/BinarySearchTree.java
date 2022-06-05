package MS.JavaAlgorithms.Tree.Search;

// Java program to demonstrate
// insert operation in binary
// search tree
class BinarySearchTree {

    /* Class containing left
    and right child of current node
    * and key value*/
    class Node {
        int val;
        Node left, right;

        public Node(int item) {
            val = item;
            left = right = null;
        }
    }

    // Root of BST
    Node root;

    // Constructor
    BinarySearchTree() {
        root = null;
    }

    BinarySearchTree(int value) {
        root = new Node(value);
    }

    // This method mainly calls insertRec()
    void insert(int key) {
        root = insertRec(root, key);
    }

    /* A recursive function to
    insert a new key in BST */
    Node insertRec(Node root, int key) {

		/* If the tree is empty,
		return a new node */
        if (root == null) {
            root = new Node(key);
            return root;
        }

        /* Otherwise, recur down the tree */
        if (key < root.val)
            root.left = insertRec(root.left, key);
        else if (key > root.val)
            root.right = insertRec(root.right, key);

        /* return the (unchanged) node pointer */
        return root;
    }

    // This method mainly calls InorderRec()
    void inorder() {
        inorderRec(root);
    }

    // A utility function to
    // do inorder traversal of BST
    void inorderRec(Node root) {
        if (root != null) {
            inorderRec(root.left);
            System.out.println(root.val);
            inorderRec(root.right);
        }
    }


    // search in interative way
    public Node search(Node root, int key) {
        while (root != null && root.val != key) {
            if (key > root.val) {
                root = root.right;
            } else {
                root = root.left;
            }
        }
        return root;
    }

    // search in recursive way
    public Node searchRec(Node root, int key) {
        // Base Cases: root is null or key is present at root
        if (root==null || root.val==key)
            return root;

        // Key is greater than root's key
        if (root.val < key)
            return searchRec(root.right, key);

        // Key is smaller than root's key
        return searchRec(root.left, key);
    }

    // Driver Code
    public static void main(String[] args) {
        BinarySearchTree tree = new BinarySearchTree();

		/* Let us create following BST
			50
		/	 \
		30	 70
		/ \ / \
	20 40 60 80 */
        tree.insert(50);
        tree.insert(30);
        tree.insert(20);
        tree.insert(40);
        tree.insert(70);
        tree.insert(60);
        tree.insert(80);

        // print inorder traversal of the BST
        tree.inorder();
    }
}
// This code is contributed by Ankur Narain Verma
