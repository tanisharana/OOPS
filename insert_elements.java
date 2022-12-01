import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.*;

public class insert_elements {
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
        int index;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter index at which you want to insert element");
        index = sc.nextInt();
        String s;
        System.out.println("enter string");
        s = sc.next();
        list.add(index, s);

        System.out.println(list);
    }
}
