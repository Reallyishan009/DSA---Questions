import java.util.HashMap;

public class INORDERandPOST_ORDERtreeconstruct {
    // Definition for a binary tree node.
    class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            this.val = x;
        }
    }

    public TreeNode buildTree(int[] inorder, int[] postorder) {
        if (inorder == null || postorder == null || inorder.length != postorder.length) {
            return null;
        }
        HashMap<Integer, Integer> inorderMap = new HashMap<>();
        for (int i = 0; i < inorder.length; i++) {
            inorderMap.put(inorder[i], i);
        }
        return buildTreeHelper(inorder, postorder, 0, inorder.length - 1, 0, postorder.length - 1, inorderMap);
    }

    private TreeNode buildTreeHelper(int[] inorder, int[] postorder, int in_start, int in_end, int post_start, int post_end, HashMap<Integer, Integer> inorderMap) {
        // Base case
        if (in_start > in_end || post_start > post_end) {
            return null;
        }

        // Get root value from postorder and create root node
        int root_val = postorder[post_end];
        TreeNode root = new TreeNode(root_val);

        // Find root index in inorder traversal
        int inorder_index = inorderMap.get(root_val);

        // Calculate left subtree size
        int left_tree_size = inorder_index - in_start;

        // Recursively construct left and right subtrees
        root.left = buildTreeHelper(inorder, postorder, in_start, inorder_index - 1, post_start, post_start + left_tree_size - 1, inorderMap);
        root.right = buildTreeHelper(inorder, postorder, inorder_index + 1, in_end, post_start + left_tree_size, post_end - 1, inorderMap);

        return root;
    }
}
