package leetcode;

import java.util.*;

class TreeNodee {
    int value;
    TreeNodee left;
    TreeNodee right;

    public TreeNodee(int value, TreeNodee left, TreeNodee right) {
        this.value = value;
        this.left = left;
        this.right = right;
    }

    public TreeNodee(int value) {
        this.value = value;
    }

}

public class TreeNodes {

    public static List<Integer> inorderTraversal(TreeNodee root) {
        List<Integer> answer = new ArrayList<>();
        Stack<TreeNodee> stack = new Stack<>();

        TreeNodee current = root;
        while (current != null || !stack.isEmpty()) {
            while (current != null) {
                stack.push(current);
                current = current.left;
            }
            current = stack.pop();
            answer.add(current.value);
            current = current.right;
        }
        return answer;
    }

    public static void main(String[] args) {

    }
}
