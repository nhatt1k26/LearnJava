class KeyValuePair<K, V> {
    private K key;
    private V value;

    public KeyValuePair(K key, V value) {
        this.key = key;
        this.value = value;
    }

    public K getKey() {
        return key;
    }

    public void setKey(K key) {
        this.key = key;
    }

    public V getValue() {
        return value;
    }

    public void setValue(V value) {
        this.value = value;
    }
}

class ContactEntry extends KeyValuePair<String, Integer> {
    public String Entry2;
    public ContactEntry(String key, Integer value, String Entry2) {
        super(key, value);
        this.Entry2 = Entry2;
        //    Can we use both super key word and this key word in the same constructor to invoke another constructor
    }
}

class ContactEntry2<V> extends KeyValuePair<String, V> {
    public ContactEntry2(String key, V value) {
        super(key, value);
    }
}

class ContactEntry3<K, V> extends KeyValuePair<K, V> {
    public ContactEntry3(K key, V value) {
        super(key, value);
    }
}

class ContactEntry4<K, V, T> extends KeyValuePair<K, V> {
    private T obj;

    public ContactEntry4(K key, V value, T obj) {
        super(key, value);
        this.obj = obj;
    }

    public T getObj() {
        return obj;
    }

    public void setObj(T obj) {
        this.obj = obj;
    }
}

class CountType {
    // data.getClass().getSimpleName()
}

public class GenericClass {
    public static void main(String[] args) {
        KeyValuePair<String, String> entry = new KeyValuePair("haha1", "haha2");
        String Key = entry.getKey();
        String Value = entry.getValue();
        System.out.println("Key: " + Key + "\nValue: " + Value);
    }
}
