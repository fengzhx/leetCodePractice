package self.practice14;

import generate.Node;
import self.module.CommonTree;

import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        Node root = CommonTree.getRoot();
//        preOrder(root);
//        inOrder(root);
        posOrder(root);
    }


    public static void preOrder(Node root){
        if(root == null){
            return;
        }
        Stack<Node> stack = new Stack<>();
        stack.push(root);
        while(!stack.isEmpty()){
            Node pop = stack.pop();
            System.out.println(pop.val);
            if(pop.right != null){
                stack.push(pop.right);
            }
            if(pop.left != null){
                stack.push(pop.left);
            }
        }
    }

    public static void inOrder(Node root){
        if(root == null){
            return;
        }
        Stack<Node> stack = new Stack<>();
        while(!stack.isEmpty() || root != null){
            while(root != null){
                stack.push(root);
                root = root.left;
            }
            root = stack.pop();
            System.out.println(root.val);
            root = root.right;
        }
    }

    public static void posOrder(Node root){
        if(root == null){
            return;
        }
        Stack<Node> stack = new Stack<>();
        Stack<Node> help = new Stack<>();
        stack.push(root);
        while(!stack.empty()){
            Node pop = stack.pop();
            help.push(pop);
            if(pop.left != null){
                stack.push(pop.left);
            }
            if(pop.right != null){
                stack.push(pop.right);
            }
        }
        while (!help.isEmpty()){
            System.out.println(help.pop().val);
        }
    }
}
