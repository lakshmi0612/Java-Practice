package Tree;

public class SegmentTree {

    private static class Node{
        int data;
        int startInterval;
        int endInterval;
        Node left;
        Node right;

        public Node(int StartInterval, int EndInterval){
            this.startInterval = StartInterval;
            this.endInterval = EndInterval;
        }

    }

    Node root;

    public SegmentTree(int[] arr){

        if(arr==null||arr.length==0){
            this.root =null;
        }else {
            // Create a tree using this array
            this.root = constructTree(arr, 0, arr.length - 1);
        }
    }

    private Node constructTree(int[] arr, int start, int end){

        Node node = new Node(start, end);
        int middle = (start + end)/2;
        if(start==end){
            node.data = arr[start];
            return node;
        }
        node.left = constructTree(arr, start, middle );
        node.right = constructTree(arr, middle+1, end);

        node.data = node.left.data + node.right.data;
        return node;



    }

    public void display(){
        display(this.root);
    }

    private void display(Node node){
        String str = " ";
        if(node.left != null){
            str = str + " Interval = [" + node.left.startInterval + "-" + node.left.endInterval + "] and data: " + node.left.data + "=>";
        }else{
            str = str + "No left child :(";
        }

        //For current node
        str = str + " Interval = [" + node.startInterval + "-" + node.endInterval + "] and data: " + node.data + "<=";

        if(node.right != null){
            str = str + " Interval = [" + node.right.startInterval + "-" + node.right.endInterval + "] and data: " + node.right.data ;
        }else{
            str = str + "No right child :(";
        }

        System.out.println(str + '\n');

        //call recursion

        if(node.left != null){
            display(node.left);
        }

        if (node.right!= null){
            display(node.right);
        }

    }

    //Query

    public int query(int qsi, int qei){
        return this.query(this.root, qsi, qei);
    }

    private int query(Node node, int qsi, int qei ){
        if(node.startInterval>= qsi && node.endInterval <= qei){
            //node is completely lieing inside
            return node.data;
        } else if (node.startInterval >qei || node.endInterval< qsi) {
            //Completely outside
            return 0;
            
        }else{
            return this.query(node.left, qsi,qei) + this. query(node.right, qsi, qei);
        }
    }

    //update
    public void update(int index, int value){
        this.root.data = update(this.root, index, value);
    }

    private int update(Node node, int index, int value){
        if(index >= node.startInterval &&index <= node.endInterval){
            if(index == node.startInterval && index == node.endInterval){
                node.data = value;
                return node.data;
            }else{
                int leftAns = update(node.left, index, value);
                int rightAns = update(node.right, index, value);

                node.data = leftAns + rightAns;
                return node.data;
            }
        }
        return node.data;

    }

}
