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
        if(keys.contains(key)){ //if key actually exists in the keys arraylist
            T removedValue = values.get(keys.indexOf(key)); //store the value that is paired with "key"
            keys.remove(keys.indexOf(key)); //remove key in the keys arraylist using "remove" because it is an arraylist
            values.remove(removedValue); //remove the value associated with that key
            size--; //decrease size by one
            return removedValue; //return the value that was removed
        } else {
            return null; //there is no "key" in the arraylist keys
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
