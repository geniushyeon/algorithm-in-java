package leetcode.easy;

public class MinimumAbsoluteDifferenceInBST {

    boolean init;
    int min;
    int prev;

    public int getMinimumDifference(TreeNode root) {
        init = false;
        min = Integer.MAX_VALUE;
        inorder(root);

        return min;
    }

    private void inorder(TreeNode root) {
        if (root == null) return;

        inorder(root.left);

        // self 처리
        if (!init) {
            init = true;
        } else {
            min = Math.min(min, root.val - prev);
        }

        prev = root.val;
        inorder(root.right);
    }
}
