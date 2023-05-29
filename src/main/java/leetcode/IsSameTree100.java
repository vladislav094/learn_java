package leetcode;

import java.util.*;

public class IsSameTree100 {
    public static boolean isSameTree(Tree p, Tree q) {
        if(p == null && q == null) {
            return true;
        }
        return (p != null && q != null) && (p.value == q.value) &&
                isSameTree(p.left, q.left) &&
                isSameTree(p.right, q.right);
    }

    public static void main(String[] args) {
        Tree x = new Tree(1);
        x.left = new Tree(2);
        x.right = new Tree(3);

        Tree y = new Tree(1);
        y.left = new Tree(2);
        y.right = new Tree(3);

        System.out.println(isSameTree(x, y));
    }


}

