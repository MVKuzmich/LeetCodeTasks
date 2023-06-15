package easy.breadthfirstsearch;

public class SymmetricTree {

    public boolean isSymmetric(TreeNode root) {
        return checkNodes(root.left, root.right);
    }

    private boolean checkNodes(TreeNode left, TreeNode right) {
        if (left == null || right == null) {
            return left == right;
        }
        return left.val == right.val && checkNodes(left.left, right.right) && checkNodes(left.right, right.left);

    }

}
