public class ArrayDictionary {
    private Node<E> key;

    private int size = 0;

    public ArrayDictionary() {
        key = new Node();
    }

    void put(E key, T value) {
        //add an key-value pair to the dictionary
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
        return false;
    }
    boolean isEmpty() {
        //returns true if the dictionary is empty
        return false;
    }
    int size(){
        //returns the number of key-value pairs in the dictionary
        return 0;
    }
    Collection<E> keys() {
        //returns a Collection¹ of keys
        return null;
    }
    Collection<T>  values() {
        //returns a Collection of values
        return null;
    }
}
