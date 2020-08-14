import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapExample {
    public static void main(String[] args) {
       // HashMap is used for unordered data collection
        Map<String, String> map = new HashMap<>();
        map.put("Bihar", "Patna");
        map.put("Jharkhand", "Ranchi");
        map.put("UP", "Lucknow");

        System.out.println(map);
        /*
        Map is like key value pairs just as json in JS
         */
        map.put("Karnataka", "Bengaluru");
        System.out.println(map);
        /*
        The order of the items in the hashmap is not guaranteed
        that is why it is suitable for unordered data collection
        whereas with tha arrayList we have got the data in the
        order as we have added them to the list
         */

        // Getting an item form Hashmap
        String cap = map.get("Bihar");
        System.out.println("Capital of Bihar is "+cap);

        // Removing an item from the Hashmap
        map.remove("Karnataka");
        System.out.println(map);
        /*
        While removing we provide the key of the data pair to be removed
        and the key and the data both are gone as we can see
         */

        /*
        We can get a set of keys that are there in the hashMap
        which guarantees uniques values that we can't get with
        arrayList
                 */
        Set<String> keySet = map.keySet();
        System.out.println("Key set is "+keySet);

        /*
        We can get the data from the hashmap that we have
        created using the newly created keySet here,
        using an iterator
         */

        Iterator<String> iterator = keySet.iterator();
        while (iterator.hasNext()){
            String key = iterator.next();
            System.out.println("The capital of "+key+" is "+map.get(key));
        }

        // Getting data from the hashmap using forEach loop
         for (String key : keySet){
             System.out.println("The capital of "+key+" is "+map.get(key));
         }

    }
}
