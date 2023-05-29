package leetcode;

public class MaxDepth {
    public static int maxDepth(Tree root) {
        if (root == null) {
            return 0;
        }
        int l = maxDepth(root.left);
        int r = maxDepth(root.right);
        return Math.max(l, r) +1;
    }


    public static void main(String[] args) {
        System.out.println();
    }
}
