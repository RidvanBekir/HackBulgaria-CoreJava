package Pair;
public class Pair {

    private final Object key;
    private final Object value;

    public Pair(Object key, Object value) {

        this.key = key;
        this.value = value;

    }

    public Object getKey() {
        return key;
    }

    public Object getValue() {
        return value;
    }

    @Override
    public String toString() {

        return  this.getKey() + " " + this.getValue().toString();
    
    }
    
    @Override
    public boolean equals(Object obj) {
        
        Pair other = (Pair) obj;
        return this.getKey().equals(other.getKey()) && this.getValue().equals(other.getValue());
        
    }
}
