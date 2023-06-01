package leetcode;

public class HasPathSum {
    public static boolean hasPathSum(Tree root, int targetSum) {
        int total = 0;
        if (root == null && total != targetSum) {
            return false;
        }
        return true;


    }

    public static void main(String[] args) {
//        System.out.println();
    }
}
