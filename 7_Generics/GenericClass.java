class KeyValuePair<K, V> {
    private K key;
    private V value;

    public KeyValuePair() {
    }

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
    public V data;
    public ContactEntry2() {
        super();
    }
    public ContactEntry2(V value) {
        super();
        data = value;
    }
    public ContactEntry2(String key, V value) {
        super(key, value);
    }
    

    public String CheckType(){
        // we can use getSimpleName for the sort form of DataType
        return  data.getClass().getName(); 
            // return "V is Integer";
            // else 
            // return "V is not Integer";
    }
}

class ContactEntry3<S, V> extends KeyValuePair<K, V> {
    public ContactEntry3(K key, V value) {
        super(key, value);
    }

    public void CommonOperator(V a1, V a2){
        a1 === a2;
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
        ContactEntry2<Integer> a = new ContactEntry2<Integer>(123);
        System.out.println(a.CheckType());
    }
}
