import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.*;

public class delete_elements {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
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
        int index;
        System.out.println("enter the index to delete element");
        index = sc.nextInt();
        list.remove(index);
        System.out.println(list);
    }

}
