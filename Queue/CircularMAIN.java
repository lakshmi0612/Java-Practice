package Queue;

public class CircularMAIN {
    public static void main(String[] args) throws Exception {
        CircularQueue Circular1 = new CircularQueue(5);
        Circular1.insert(1);
        Circular1.insert(2);
        Circular1.insert(3);
        Circular1.insert(4);
        Circular1.insert(5);

        Circular1.display();

        Circular1.remove();
        Circular1.display();
    }
}
