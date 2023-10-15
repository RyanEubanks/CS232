package Classwork.Labs.Lab7;

public class Oct9 {
    public static void main(String[] args) {
        String str1 = "AG";
        String str2 = "AG";
        String str3 = new String("AG");

        System.out.println(str1 == str2); // true string interning
        System.out.println(str1 == str3); // false

        // String intering
        // In cs string interning is a method of storing only one copy of each distinct 
        // string value, which must be immutable.

        // Character class
        char myChar = 'C';
        if(Character.isUpperCase(myChar)) {
            System.out.println(myChar + " is uppercase");
        }
        myChar = Character.toLowerCase(myChar);
        System.out.println(myChar);

        // To explore all the character functions 
        // type character and put a dot (.)

        // String comparison
        // ==: compare both addresses and values
        // .equals(): compares only value

        String str4 = "JSU";
        String str5 = new String("JSU");
        String str6 = new String("jsu");

        System.out.println(str4 == str5); // false
        System.out.println(str4.equals(str5)); // true
        System.out.println(str4.equalsIgnoreCase(str6)); // true

        System.out.println(str5.compareTo(str6)); // +ve, -ve, 0

        String str7 = new String("Jacksonville State University");
        System.out.println(str7.substring(0, 12));

        // string length()
        System.out.println(str7.length());

        // String charat()
        System.out.println(str7.charAt(11));

        // String startswith()
        System.out.println(str7.startsWith("Jack"));

        // String builder --> helps create mutable strings
        StringBuilder sBuilder1 = new StringBuilder("Jacksonville");
        // reverse
        System.out.println(sBuilder1.reverse());
        sBuilder1.reverse();

        // setCharAt(1, 'Y')
        sBuilder1.setCharAt(1, 'Y');
        System.out.println(sBuilder1);

        // delete()
        sBuilder1.delete(0, 4); // delete part of the string
        System.out.println(sBuilder1);

        // capacity() - refers to the amount of chars storage size in stringBuilder
        StringBuilder sBuilder2 = new StringBuilder("");
        System.out.println(sBuilder2.capacity());


    }
}
