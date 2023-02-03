import java.util.ArrayList;
import java.util.Collection;

public class ArrayDictionary<T, E> {
    //instance data
    private ArrayList<E> keys; //initalize an array list of all keys
    private ArrayList<T> values; //initalizing an arraylist for all values
    private int size = 0;

    public ArrayDictionary() {
        keys = new ArrayList<>();
        values = new ArrayList<>();
        size = 0;
    }

    void put(E key, T value) {
        //add a key-value pair to the dictionary
        if(!keys.contains(key)){
            //add key AND value into each arraylist dictionary and update size
            size++;
            keys.add(key); //adding key into keys dictionary
            values.add(value); //adding value to values dictionary
        } else {
            System.out.println("It already exists"); //the key already exists in the dictionary
        }
    }
    T get(E key) {
        //get the value associated with "key"
        if(keys.contains(key)){
            return values.get(keys.indexOf(key)); //returns the value that is at the same index of where "key" is in keys
        } else {
            return null; //this means there is the "key" doesn't exist
        }
    }
    T remove(E key) {
        //remove a key-value pair and return the value
        if(keys.contains(key)){
            T removedValue = values.get(keys.indexOf(key));
            keys.remove(keys.indexOf(key));
            values.remove(removedValue);
            size--;
            return removedValue;
        } else {
            return null;
        }
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
