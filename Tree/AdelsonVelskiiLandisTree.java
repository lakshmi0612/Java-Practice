package Tree;

public class AdelsonVelskiiLandisTree {

    public static class Node {
        private int value;
        private int height; // height in edges
        private Node left;
        private Node right;

        public Node(int value) {
            this.value = value;
            this.height = 0; // leaf height = 0 (since null is -1)
        }

        public int getValue() { return value; }
    }

    private Node root;

    public AdelsonVelskiiLandisTree() {}

    // ----- Utilities -----
    private int height(Node n) {
        return (n == null) ? -1 : n.height;
    }

    private int balanceFactor(Node n) {
        return (n == null) ? 0 : height(n.left) - height(n.right);
    }

    private void updateHeight(Node n) {
        n.height = Math.max(height(n.left), height(n.right)) + 1;
    }

    // ----- Rotations -----
    private Node rightRotate(Node p) {
        Node c = p.left;
        Node t = (c != null) ? c.right : null;

        // Rotate
        c.right = p;
        p.left = t;

        // Update heights (child first, then parent)
        updateHeight(p);
        updateHeight(c);

        return c; // new root of this subtree
    }

    private Node leftRotate(Node p) {
        Node c = p.right;
        Node t = (c != null) ? c.left : null;

        // Rotate
        c.left = p;
        p.right = t;

        // Update heights
        updateHeight(p);
        updateHeight(c);

        return c; // new root of this subtree
    }

    private Node rebalance(Node node) {
        int bf = balanceFactor(node);

        // Left heavy
        if (bf > 1) {
            // LL case
            if (balanceFactor(node.left) >= 0) {
                return rightRotate(node);
            }
            // LR case
            node.left = leftRotate(node.left);
            return rightRotate(node);
        }

        // Right heavy
        if (bf < -1) {
            // RR case
            if (balanceFactor(node.right) <= 0) {
                return leftRotate(node);
            }
            // RL case
            node.right = rightRotate(node.right);
            return leftRotate(node);
        }

        return node; // already balanced
    }

    // ----- Insert (AVL) -----
    public void insert(int value) {
        root = insert(root, value);
    }

    private Node insert(Node node, int value) {
        if (node == null) return new Node(value);

        if (value < node.value) {
            node.left = insert(node.left, value);
        } else if (value > node.value) {
            node.right = insert(node.right, value);
        } else {
            // duplicate policy: ignore (or handle as you like)
            return node;
        }

        updateHeight(node);
        return rebalance(node);
    }

    // ----- Queries / Helpers -----
    public boolean isEmpty() { return root == null; }

    public boolean balanced() { return balanced(root); }

    private boolean balanced(Node node) {
        if (node == null) return true;
        int bf = Math.abs(balanceFactor(node));
        return bf <= 1 && balanced(node.left) && balanced(node.right);
    }

    public void display() { display(root, "Root: "); }

    private void display(Node node, String tag) {
        if (node == null) return;
        System.out.println(tag + node.getValue() + " (h=" + node.height + ")");
        display(node.left,  "  L of " + node.getValue() + ": ");
        display(node.right, "  R of " + node.getValue() + ": ");
    }

    public void populate(int[] nums) {
        for (int v : nums) insert(v);
    }

    // Build a balanced tree from sorted array (inclusive indices)
    public void populateSorted(int[] nums) {
        root = buildFromSorted(nums, 0, nums.length - 1);
    }

    private Node buildFromSorted(int[] a, int lo, int hi) {
        if (lo > hi) return null;
        int mid = (lo + hi) >>> 1;
        Node node = new Node(a[mid]);
        node.left  = buildFromSorted(a, lo, mid - 1);
        node.right = buildFromSorted(a, mid + 1, hi);
        updateHeight(node);
        return node;
    }
}
