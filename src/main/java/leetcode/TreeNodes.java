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

}

public class TreeNodes {

    public static List<Integer> inorderTraversal(Tree root) {
        List<Integer> answer = new ArrayList<>();
        Stack<Tree> stack = new Stack<>();

        Tree current = root;

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
