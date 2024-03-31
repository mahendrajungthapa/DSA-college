// Define a basic structure for a binary tree node
class TreeNode 
{
    int data;
    TreeNode left;
    TreeNode right;

    public TreeNode(int data) {
        this.data = data;
        this.left = null;
        this.right = null;
    }
}

public class TreeTraversal 
{
    // In-order traversal: Left, Root, Right
    public static void inOrderTraversal(TreeNode root) 
	{
        if (root != null) 
		{
            inOrderTraversal(root.left);
            System.out.print(root.data + " ");
            inOrderTraversal(root.right);
        }
    }

    // Pre-order traversal: Root, Left, Right
    public static void preOrderTraversal(TreeNode root) {
        if (root != null) {
            System.out.print(root.data + " ");
            preOrderTraversal(root.left);
            preOrderTraversal(root.right);
        }
    }

    // Post-order traversal: Left, Right, Root
    public static void postOrderTraversal(TreeNode root) {
        if (root != null) {
            postOrderTraversal(root.left);
            postOrderTraversal(root.right);
            System.out.print(root.data + " ");
        }
    }

    public static void main(String[] args) {
        // Creating a sample binary tree
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);
		root.right.left = new TreeNode(6);
		root.right.right = new TreeNode(7);

        // Performing tree traversals
        System.out.println("In-order traversal:");
        inOrderTraversal(root);

        System.out.println("\nPre-order traversal:");
        preOrderTraversal(root);

        System.out.println("\nPost-order traversal:");
        postOrderTraversal(root);
    }
}
