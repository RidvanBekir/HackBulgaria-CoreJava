package InsertingNullNotAllowed;

import java.util.HashMap;

@SuppressWarnings("serial")
public class MyHashMap<K, V> extends HashMap<K, V> {

    private boolean allowNull = false;

    public MyHashMap() {
    }

    public MyHashMap(boolean allowNull) {
        this.allowNull = allowNull;
    }

    public void setNotAllowNull() {
        this.allowNull = true;
    }

    @Override
    public V put(K key, V value) throws NullValueException {
        if (allowNull == true) {
            if ((key == null) || (value == null)) {
                throw new NullValueException("Tried to insert null as key or value !");
            }
        }
        return super.put(key, value);
    }

    @Override
    public V get(Object key) throws NullValueException {
        if (allowNull == true) {
            if (key == null) {
                throw new NullValueException("Tried to get null key !");
            }
        }
        return super.get(key);
    }
}
