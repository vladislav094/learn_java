package leetcode;



public class IsSymmetric101 {
    public boolean isSymmetric(Tree root) {
        return isSymmetric(root, root);
    }

    private boolean isSymmetric(Tree node1, Tree node2) {
        if (node1 == null && node2 == null) {
            return true;
        }
        if (node1 == null || node2 == null) {
            return false;
        }
        return  (node1.value == node2.value) && (isSymmetric(node1.left, node2.right)) && (isSymmetric(node1.right, node2.left));

    }




    public static void main(String[] args) {
        Tree x = new Tree(1);
        x.left = new Tree(2);
        x.right = new Tree(3);

        Tree y = new Tree(1);
        y.left = new Tree(2);
        y.right = new Tree(3);

        System.out.println(isSymmetric(x, y));
    }
}
