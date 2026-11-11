package Tree;

import java.util.Arrays;

public class BSTMain {
    public static void main(String[] args) {
        BinarySearchTree BST = new BinarySearchTree();
//        BST.insert(15);
//        BST.insert(10);
//        BST.insert(20);
//        BST.insert(5);
//        BST.insert(12);
        int[] nums = {15,10,20,5,12};
        BST.populate(nums);
        BST.display();

        BinarySearchTree BST1 = new BinarySearchTree();
        int[] nums1 = {1,2,3,4,5,6,7,8,9,10};
        BST1.populateSorted(nums1);
        BST1.display();
    }

}
