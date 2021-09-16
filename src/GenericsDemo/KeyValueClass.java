package GenericsDemo;

public class KeyValueClass<K, V> {
    private K key;
    private V value;

    public KeyValueClass(K key, V value){
        this.key = key;
        this.value = value;
    }
}
