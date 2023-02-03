//Preity's testdriver for ArrayDictionary
//2-3-23
public class testDriver {
    public static void main(String[] args){
        //testing size and isEmpty
        ArrayDictionary<Integer, String> dict = new ArrayDictionary<>();
        System.out.println("0: " + dict.size());
        System.out.println("true: " + dict.isEmpty());

        //testing put, size, and isEmpty
        dict.put(1,"orange");
        System.out.println("1: " + dict.size());
        System.out.println("false: " + dict.isEmpty());
        dict.put(1,"apple");
        System.out.println("^^trying to assign 'apple' to key of '1' --> supposed to print out 'it already exists'");

        //testing get and making sure it doesn't remove value from list
        System.out.println("orange: " + dict.get(1));
        System.out.println("1: " + dict.size());
        System.out.println("null: " + dict.get(2));

        //testing put
        dict.put(2, "bananas");
        dict.put(3, "mangoes");
        dict.put(4, "peaches");

        //returns whole array list
        System.out.println("[1,2,3,4]: " + dict.keys());
        System.out.println("[orange, bananas, mangoes, peaches]: " + dict.values());

        //testing remove and contains
        System.out.println("null: " + dict.remove(5));
        System.out.println("false: " + dict.contains(5));
        System.out.println("true: " + dict.contains(2));
        System.out.println("bananas: " + dict.remove(2));
        System.out.println("3: " + dict.size());

        //returns whole (updated) dictionary
        System.out.println("[1,3,4]: " + dict.keys());
        System.out.println("orange, mangoes, peaches]: " + dict.values());
    }
}
