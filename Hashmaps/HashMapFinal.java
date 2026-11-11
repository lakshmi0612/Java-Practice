package Hashmaps;
import java.util.*;

public class HashMapFinal<K,V> {
    ArrayList<LinkedList<Entity>> list;

    private int size = 0;
    private float lf = 0.5f;

    public HashMapFinal() {
        list = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            list.add(new LinkedList<>());
        }
    }

    public void put(K key, V value) {
        int hash = (key.hashCode() & 0x7fffffff) % list.size();
        LinkedList<Entity> entities = list.get(hash);

        for (Entity entity : entities) {
            if (entity.key.equals(key)) {
                entity.value = value;
                return;
            }
        }

        // FIX: rehash check must consider new insertion
        if ((float) (size + 1) / list.size() > lf) {
            reHash();
            hash = (key.hashCode() & 0x7fffffff) % list.size();
            entities = list.get(hash);
        }

        entities.add(new Entity(key, value));
        size++;
    }

    // FIX: containsKey should check key, not value
    public boolean containsKey(K key){
        int hash = (key.hashCode() & 0x7fffffff) % list.size();
        LinkedList<Entity> entities = list.get(hash);
        for (Entity entity : entities) {
            if (entity.key.equals(key)) {
                return true;
            }
        }
        return false;
    }

    private void reHash() {
        System.out.println("We are now rehashing");

        ArrayList<LinkedList<Entity>> old = list;
        list = new ArrayList<>();
        size = 0;

        for (int i = 0; i < old.size() * 2; i++) {
            list.add(new LinkedList<>());
        }

        for (LinkedList<Entity> enti : old) {
            for (Entity entry : enti) {
                put(entry.key, entry.value);
            }
        }
    }

    private class Entity {
        K key;
        V value;

        public Entity(K key, V value) {
            this.key = key;
            this.value = value;
        }
    }

    public V get(K key) {
        int hash = (key.hashCode() & 0x7fffffff) % list.size();
        LinkedList<Entity> entities = list.get(hash);

        for (Entity entity : entities) {
            if (entity.key.equals(key)) {
                return entity.value;
            }
        }
        return null;
    }

    // FIX: size should decrement only if key is found
    public void remove(K key) {
        int hash = (key.hashCode() & 0x7fffffff) % list.size();
        LinkedList<Entity> entities = list.get(hash);

        Iterator<Entity> it = entities.iterator();
        while (it.hasNext()) {
            Entity entity = it.next();
            if (entity.key.equals(key)) {
                it.remove();
                size--;
                return;
            }
        }
    }

    @Override
    public String toString(){
        StringBuilder builder = new StringBuilder();
        builder.append("{");

        for (LinkedList<Entity> entities : list) {
            for (Entity entity : entities) {
                builder.append(entity.key)
                        .append("=")
                        .append(entity.value)
                        .append(",");
            }
        }

        if (builder.length() > 1) {
            builder.deleteCharAt(builder.length() - 1); // remove trailing comma
        }

        builder.append("}");
        return builder.toString();
    }
}
