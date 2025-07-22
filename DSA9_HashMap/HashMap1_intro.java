package DSA9_HashMap;
//importing hashMap library
import java.util.*;
public class HashMap1_intro {
    public static void main(String[] args) {
        //make obj of hashmap class
        HashMap<Integer,String> hashmap = new HashMap<>(); //HashMap<key_type,Value_type>
        
        //Functionality of put function
        hashmap.put(1, "Priya");
        hashmap.put(3, "Asha");
        hashmap.put(5, "Karan");
        hashmap.put(8, "Astha");

        //printing hashmap
        System.out.println("HashMap of the given data is: "+hashmap);

        //get Function
        System.out.println("Value for the given key 3 is: "+hashmap.get(3));

        //containsKey Function: returns boolean value weather key is present in hashmap or not
        System.out.println(hashmap.containsKey(2));

        //remove Function:
        hashmap.remove(1);
        System.out.println("Updated HashMap: "+hashmap);

        //entrySet() Function   
        //iterating using for loop
        System.out.println("HashMap");
        for(Map.Entry<Integer,String> obj: hashmap.entrySet()){
            System.out.println(obj.getKey() + " : "+obj.getValue());
        }
    }
}