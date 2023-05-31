package leetcode;

import java.util.*;

public class IsSameTree100 {
    public static boolean isSameTree(Tree p, Tree q) {
        if(p == null && q == null) {
            return true;
        }
        return (p != null && q != null) && (p.value == q.value) && isSameTree(p.left, q.left) && isSameTree(p.right, q.right);

    }
}

