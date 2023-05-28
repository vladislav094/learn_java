package leetcode;

import java.util.*;

class Tree {
    int value;
    Tree left;
    Tree right;

    public Tree(int value, Tree left, Tree right) {
        this.value = value;
        this.left = left;
        this.right = right;
    }

    public Tree(int value) {
        this.value = value;
    }
    public List<Tree> element() {
        List<Tree> list = new ArrayList<>();
        if(left != null) {
            list.add(left);
        }
        if(right != null) {
            list.add(right);
        }
        return list;
    }

}

public class TreeNode {

    public static List<Integer> inorderTraversal(Tree root) {
        List<Integer> arr = new ArrayList<>();
        System.out.println(root.element());
        return arr;
    }

    public static void main(String[] args) {
        int[] nums = {0, 1, 3, 4, 6, 8};

        List<Integer> list= new ArrayList<>();
        inorderTraversal({1, 2, 3, 5});
    }
}
