package Stack;

public class DynamicMain {
    public static void main(String[] args) throws StackExceptions {
        DynamicStackImplementation DS = new DynamicStackImplementation(5);
        DS.push(23);
        DS.push(26);
        DS.push(3);
        DS.push(2);
        DS.push(13);
        DS.push(22);
        DS.push(24);
        DS.push(27);

        System.out.println(DS.pop());
        System.out.println(DS.pop());
        System.out.println(DS.pop());
        System.out.println(DS.pop());
        System.out.println(DS.pop());
        System.out.println(DS.pop());
    }
}
