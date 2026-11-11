package Tree;

import java.util.Scanner;

public class BinaryTree {

    public BinaryTree(){

    }

    private static class Node{
        int value;
        Node left;
        Node right;

        public Node(int value){
            this.value= value;
        }

    }
    private Node root;

    public void populate(Scanner scanner){
        System.out.println("Enter the root Node: ");
        int value = scanner.nextInt();
        root = new Node(value);
        populate(scanner, root);

    }
    private void populate(Scanner scanner, Node node){
        System.out.println("Do you want to enter left of " + node.value);
        boolean left = scanner.nextBoolean();
        if(left){
            System.out.println("Enter the value of the left of: " + node.value);
            int value = scanner.nextInt();
            node.left = new Node(value);
            populate(scanner, node.left); //See notes Implementation part

        }

        System.out.println("Do you want to enter right of " + node.value);

        boolean right =scanner.nextBoolean();
        if(right){
            System.out.println("Enter the value of the right of: " + node.value);
            int value = scanner.nextInt();
            node.right = new Node(value);
            populate(scanner, node.right);

        }
    }
    public void display(){
        display(root,"");
    }

    private void display(Node node, String indent){
        if(node == null){
            return;
        }
        System.out.println(indent + node.value);
        display(node.left , indent + "\t"); // if the nodes are on the same level the value of indent also will be same
        display(node.right, indent + "\t");


    }
    public void prettydisplay(){
        prettydisplay(root, 0);

    }

    private void prettydisplay(Node node, int level){
        if(node == null){
            return;
        }
        prettydisplay(node.right, level + 1);

        if(level != 0){
            for(int i =0; i<level-1; i++){
                System.out.print("|\t\t");
            }
            System.out.println("|------>"+node.value);

        }else{
            System.out.println(node.value);
        }

        prettydisplay(node.left, level + 1);


    }
    public void preorder(){
        preorder(root);
    }
    private void preorder(Node node){ //Time complexity = O(n)
        if(node == null){
            return;
        }
        System.out.println(node.value + " ");
        preorder(node.left);
        preorder(node.right);
    }

    public void inorder(){
        inorder(root);
    }

    private void inorder(Node node){ //Time complexity = O(n)
        if(node == null){
            return;
        }

        preorder(node.left);
        System.out.println(node.value + " ");
        preorder(node.right);
    }

    public void postorder(){
        inorder(root);
    }

    private void postorder(Node node){ //Time complexity = O(n)
        if(node == null){
            return;
        }

        preorder(node.left);
        preorder(node.right);
        System.out.println(node.value + " ");
    }



    public static void main(String[] args) {
        Scanner SC = new Scanner(System.in);
        BinaryTree tree = new BinaryTree();
        tree.populate(SC);
        tree.prettydisplay();
    }

}
