import java.util.ArrayList;
import java.util.Collection;

public class ArrayDictionary {
    private ArrayList<E> keys;
    private ArrayList<T> values;
    private int size = 0;

    public ArrayDictionary() {
        key = new ArrayList<>();
        value = new ArrayList<>();
        size = 0;
    }

    void put(E key, T value) {
        //add a key-value pair to the dictionary
        if(keys.contains(key)){
            System.out.println("It already exists");
        } else {
            //add key AND value
            keys.add(key);
            values.add(value);
        }
    }
    T get(E key) {
        //get the value associated with "key"
        if(contains(key)){
            return values.(keys.indexOf(key));
        } else {
            return null;
        }
    }
    T remove(E key) {
        //remove a key-value pair and return the value
        return null;
    }
    boolean contains(E key) {
        //returns true if "key" is associated with a value
        return keys.contains(key);
    }
    boolean isEmpty() {
        //returns whether dictionary is empty or not
        if (keys.size() == 0){
            return true;
        } else {
            return false;
        }
    }
    int size(){
        //returns the number of key-value pairs
        return size;
    }
    Collection<E> keys() {
        //returns a Collection¹ of keys
        return new ArrayList<>(keys);
    }
    Collection<T>  values() {
        //returns a Collection of values
        return new ArrayList<>(values);
    }
}
