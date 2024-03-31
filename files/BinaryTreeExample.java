class TreeNode 
{
    int data;
    TreeNode left;
    TreeNode right;

    public TreeNode(int data) 
	{
        this.data = data;
        this.left = null;
        this.right = null;
    }
}

class BinaryTree 
{
    private TreeNode root;

    public BinaryTree() 
	{
        this.root = null;
    }

    public void insert(int data) 
	{
        root = insertRec(root, data);
    }

    private TreeNode insertRec(TreeNode root, int data)
	{
        if (root == null) 
		{
            root = new TreeNode(data);
            return root;
        }

        if (data < root.data) 
		{
            root.left = insertRec(root.left, data);
        } 
		else if (data > root.data) 
		{
            root.right = insertRec(root.right, data);
        }

        return root;
    }

    public void inorderTraversal() 
	{
        System.out.print("In-order Traversal: ");
        inorderTraversal(root);
        System.out.println();
    }

    private void inorderTraversal(TreeNode root) 
	{
        if (root != null) 
		{
            inorderTraversal(root.left);
            System.out.print(root.data + " ");
            inorderTraversal(root.right);
        }
    }
}

public class BinaryTreeExample 
{
    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree();

        // Insert some nodes into the tree
        tree.insert(50);
        tree.insert(30);
        tree.insert(20);
        tree.insert(40);
        tree.insert(70);
        tree.insert(60);
        tree.insert(80);

        // Perform in-order traversal
        tree.inorderTraversal();
    }
}
