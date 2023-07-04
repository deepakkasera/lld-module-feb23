package Strings;

import java.util.Vector;

public class Client {
    public static void main(String[] args) {
        String s1 = "hello";
        String s2 = "hello";
        String s3 = new String("hello");
        String s4 = "Hello";

        System.out.println((s1 == s2) + " " + s1.equals(s2)); //true true
        System.out.println((s2 == s3) + " " + s2.equals(s3)); // false true
        System.out.println((s3 == s4) + " " + s3.equals(s4)); // false false

        System.out.println(s1);

        String s5 = s1.replace('h', 'b');

        System.out.println(s5);

        String s6 = s1.concat("hi");

        System.out.println(s6);
    }
}
