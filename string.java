import java.util.*;

public class string {
    public static void main(String Args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter string 1 ");
        String str1 = sc.nextLine();
        System.out.println("Enter string 2 ");
        String str2 = sc.nextLine();
        System.out.println("charAt() " + str1.charAt(1));
        System.out.println("compareTo() " + str1.compareTo(str2));
        System.out.println("compareToIgnoreCase() " + str1.compareToIgnoreCase(str2));
        System.out.println("concat() " + str1.concat(str2));
        System.out.println("endsWith() " + str1.endsWith("a"));
        System.out.println("equals() " + str1.equals(str2));
        System.out.println("equalsIgnoreCase() " + str1.equalsIgnoreCase(str2));
        System.out.println("indexOf() " + str1.indexOf("name"));
        System.out.println("isEmpty() " + str1.isEmpty());
        System.out.println("lastIndexOf() " + str1.lastIndexOf("a"));
        System.out.println("replace() " + str1.replace('a', 'e'));
        System.out.println("startsWith() " + str1.startsWith("m"));
        System.out.println("subSequence() " + str1.subSequence(0, 4));
        System.out.println("substring() " + str1.substring(6));
        char[] x = str1.toCharArray();
        System.out.print("toCharArray() ");
        for (int i = 0; i < x.length; i++) {
            System.out.print(x[i]);
        }
        System.out.println();
        System.out.println("toLowerCase() " + str1.toLowerCase());
        System.out.println("toUpperCase() " + str1.toUpperCase());
        System.out.println("trim() " + str1.trim());
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
        byte[] by = str1.getBytes();
        System.out.print("getBytes() ");
        for (int i = 0; i < by.length; i++) {
            System.out.print(by[i]);
        }
        System.out.println();
        System.out.println("regionMatches() " + str1.regionMatches(5, str2, 0, 7));

    }
}
