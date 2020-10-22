
package kata2;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author marke
 */
public class Kata2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[] data = {2, 4, 5, 2, 7, 4, 4, 8, 8, 5, 2, 6, 5, 7, 2};
        Map<Integer, Integer> histogram = new HashMap<>();
        
        for (int key : data) {
            histogram.put(key, histogram.containsKey(key) ? histogram.get(key)+1 : 1);
        }
        
        for(Integer key : histogram.keySet()){
            System.out.println("Key: "+ key + " ==> " + histogram.get(key));
        }
    }
    
}
