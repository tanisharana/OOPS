import java.util.*;
import java.lang.*;

public class string_buffer {
    public static void main(String Args[]) {
        StringBuffer str1 = new StringBuffer("my name is tanisha rana");
        StringBuffer str2 = new StringBuffer("MY NAME IS TANISHA RANA");
        System.out.println("charAt() " + str1.charAt(1));
        System.out.println("append() " + str1.compareTo(str2));
        System.out.println("concat() " + str1.append(str2));
        System.out.print("endsWith() ");
        if (str1.charAt(str1.length() - 1) == 'a') {
            System.out.println("true");
        } else
            System.out.println("false");
        System.out.println("equals() " + str1.equals(str2));
        System.out.println("indexOf() " + str1.indexOf("name"));
        System.out.println("isEmpty() " + str1.isEmpty());
        System.out.println("lastIndexOf() " + str1.lastIndexOf("a"));
        System.out.println("replace() " + str1.replace(3, 6, "xyz"));
        System.out.print("startsWith() ");
        if (str1.charAt(0) == 'm') {
            System.out.println("true");
        } else
            System.out.println("false");
        System.out.println("subSequence() " + str1.subSequence(0, 4));
        System.out.println("substring() " + str1.substring(6));
        System.out.print("toCharArray() ");
        char[] c2 = new char[str1.length()];
        for (int counter = 0; counter < str1.length(); counter++) {

            c2[counter] = str1.charAt(counter);
        }
        for (char newCh : c2) {
            System.out.print(newCh + "");
        }
        System.out.println();
        System.out.print("toLowerCase() ");
        for (int i = 0; i < str2.length(); i++) {
            char ch1 = str2.charAt(i);
            str2.setCharAt(i, Character.toLowerCase(ch1));
        }
        System.out.println(str2);
        System.out.print("toUpperCase() ");
        for (int i = 0; i < str1.length(); i++) {
            char ch1 = str1.charAt(i);
            str1.setCharAt(i, Character.toUpperCase(ch1));
        }
        System.out.println(str1);
        str1.trimToSize();
        System.out.println("trimToSize() " + str1.toString());
        int y = 10;
        String s1 = String.valueOf(y);
        System.out.println("valueOf() " + s1);
        char[] ch = new char[10];
        System.out.print("getChars() ");
        try {
            str1.getChars(6, 10, ch, 0);
            System.out.println(ch);
        } catch (Exception ex) {
            System.out.println(ex);
        }
        System.out.println("getBytes() " + String.valueOf(str1).getBytes());
    }
}
