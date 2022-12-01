import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.*;

public class sort_map {
    public static void main(String args[]) {
        TreeMap<Integer, String> map = new TreeMap<Integer, String>();
        map.put(4, " SE20UCSE202 Tanisha");
        map.put(6, "SE20UCSE138 Ridhi");
        map.put(3, "SE20UCSE118 Anvita");
        map.put(4, "SE20UCSE077 Aravind");
        map.put(2, "SE20UCSE042 Eashwar");
        map.put(6, "SE20UCSE109 Navya");
        map.put(1, "SE20UCSE123 XYZ");
        map.put(8, "SE20UCSE456 LMN");
        map.put(7, "SE20UCSE789 KGF");
        map.put(10, "SE20UCSE1010 OPQ");
        Iterator<Integer> it = map.keySet().iterator();
        Map<Integer, String> m = new HashMap<Integer, String>();
        TreeMap<Integer, String> tm = new TreeMap<Integer, String>(map);
        Iterator itr = tm.keySet().iterator();
        while (itr.hasNext()) {
            int key = (int) itr.next();
            System.out.println("Roll no:  " + key + "     name:   " + map.get(key));
        }

    }
}
