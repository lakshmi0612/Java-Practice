package Tree;

public class AVLMain {
    public static void main(String[] args) {


        AdelsonVelskiiLandisTree tree = new AdelsonVelskiiLandisTree();

        for (int i = 0; i < 1000; i++) {
            tree.insert(i);

        }

        tree.display();

    }

}
