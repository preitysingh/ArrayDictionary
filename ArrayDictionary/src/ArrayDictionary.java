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
        //add an key-value pair to the dictionary
        if(keys.contains(key)){
            System.out.println("It already exists");
        } else {
            //add key AND value
            keys.add(key);
            values.add(value);
        }
    }
    T get(E key) {
        //get the value associated with a given key
        return null;
    }
    T remove(E key) {
        //remove a key-value pair and return its value
        return null;
    }
    boolean contains(E key) {
        //returns true if the given key has an associated value
        return keys.contains(key);
    }
    boolean isEmpty() {
        //returns true if the dictionary is empty
        if (keys.size() == 0){
            return true;
        } else {
            return false;
        }
    }
    int size(){
        //returns the number of key-value pairs in the dictionary
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
