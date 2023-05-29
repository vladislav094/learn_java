package leetcode;



public class IsSymmetric101 {
    public boolean isSymmetric(Tree root) {
       return isSymetric(root, root);
    }
    private static boolean isSymetric(Tree a, Tree b) {
        if (a == null && b == null) {
            return true;
        }
        if(a == null || b == null) {
            return false;
        }
        return (a.value == b.value) && (isSymetric(a.left, b.right)) && (isSymetric(a.right, b.left));
    }


    public static void main(String[] args) {
        Tree x = new Tree(1);
        x.left = new Tree(2);
        x.right = new Tree(3);

        Tree y = new Tree(1);
        y.left = new Tree(2);
        y.right = new Tree(3);

//        System.out.println(isSymmetric(x, y));
    }
}
