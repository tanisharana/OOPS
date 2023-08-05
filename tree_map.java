import java.util.*;

public class tree_map {
    public static void main(String args[]) {
        TreeMap<Integer, String> map = new TreeMap<Integer, String>();
        map.put(1, " SE20UCSE202 Tanisha");
        map.put(2, "SE20UCSE138 Ridhi");
        map.put(3, "SE20UCSE118 Anvita");
        map.put(4, "SE20UCSE077 Aravind");
        map.put(5, "SE20UCSE042 Eashwar");
        map.put(6, "SE20UCSE109 Navya");
        map.put(7, "SE20UCSE123 XYZ");
        map.put(8, "SE20UCSE456 LMN");
        map.put(9, "SE20UCSE789 KGF");
        map.put(10, "SE20UCSE1010 OPQ");
        System.out.println("Tree Map elements are :");
        Collection answer = map.values();
        Iterator itr = answer.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }
    }

}
