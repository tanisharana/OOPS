import java.util.StringTokenizer;
import java.lang.*;

public class tokenizer {
    public static void main(String Args[]) {
        String str = new String("The quick * brown / fox jumps / over the * lazy dog ");
        StringTokenizer st = new StringTokenizer(str);
        StringBuffer str1 = new StringBuffer(str);
        System.out.println("Before initialization :");
        System.out.println("capacity of string is " + str1.capacity());
        System.out.println("length of string is " + str1.length() + "\n");
        System.out.println("After initialization : ");
        System.out.println("capacity of string is " + str1.capacity());
        System.out.println("length of string is " + str1.length());
        int count = st.countTokens();
        System.out.println("Total number of tokens is " + count);
        System.out.println("Printing tokens with default parameters :");
        while (st.hasMoreTokens()) {
            System.out.println(st.nextToken());
        }
        StringTokenizer st1 = new StringTokenizer(str, "* /");
        int c1 = st1.countTokens();
        System.out.println("Total number of tokens after delimiters is " + c1);
    }
}
