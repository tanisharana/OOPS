import java.util.*;

public class array_list {

    public static void main(String args[]) {
        ArrayList<String> list = new ArrayList<String>();
        list.add("SE20UCSE202");
        list.add("SE20UCSE138");
        list.add("SE20UCSE109");
        list.add("SE20UCSE118");
        list.add("SE20UCSE077");
        list.add("SE20UCSE051");
        list.add("SE20UCSE089");
        list.add("SE20UCSE123");
        list.add("SE20UCSE1010");
        list.add("SE20UCSE190");
        Collections.reverse(list);
        System.out.println(list);
    }

}
