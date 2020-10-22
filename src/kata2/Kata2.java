
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
        //Integer[] data = {2, 4, 5, 2, 7, 4, 4, 8, 8, 5, 2, 6, 5, 7, 2};
        String[] data = {"Rosa", "Pepe", "María", "Pepe", "Pepe", "Rosa"};
        Histogram histo = new Histogram(data);
        
        Map<String, Integer> histogr = histo.getHistogram();
        
        for(String key : histogr.keySet()){
            System.out.println("Key: "+ key + " ==> " + histogr.get(key));
        }
    }
    
}
