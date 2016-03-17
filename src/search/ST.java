package search;

/**
 * Created by Bowen on 2016-02-23.
 */
public class ST<Key, Value> {
    public ST() {

    }

    public void put(Key key, Value val) {

    }

    public Value get(Key key) {

        return null;
    }

    public void delete(Key key) {
        put(key, null);
    }

    public boolean contains(Key key) {
        return get(key) != null;
    }

    public boolean isEmpyt() {
        return size() == 0;
    }

    public int size() {
        return 0;
    }

    public Iterable<Key> keys() {
        return null;
    }
}
