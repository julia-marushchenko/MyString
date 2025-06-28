// Java program to demonstrate String class
package com.mystring;

import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;

// Main class
public class Main {

    // Method main() to run java program
    public static void main(String[] args) throws UnsupportedEncodingException {

        // Creating strings differently

        // String literal
        String str = "I am String";

        // Using new keyword
        String str1 = new String("I am a new String");

        // Printing str and str1 to console
        System.out.println(str);
        System.out.println(str1);

        // Creating a new string by decoding the byte array
        byte [] byte_array = {74, 65, 86, 65};
        String str2 = new String(byte_array);

        // Printing str2 to console
        System.out.println(str2); // JAVA

        // Construct a new string by decoding the byte array
        byte [] byte_array1 = {74, 65, 86, 65, 33};
        Charset cs = Charset.defaultCharset();
        String str3 = new String(byte_array1, cs);

        // Printing str3 to console
        System.out.println(str3); // JAVA!

        // Construct a new string by decoding the byte array using char_set_name for decoding
        byte [] byte_array2 = {74, 65, 86, 65, 42};
        String str4 = new String(byte_array2, "US-ASCII");

        // Printing str3 to console
        System.out.println(str4); // JAVA*

        // Construct a new string by decoding the byte array depending on starting symbol and length
        byte [] byte_array3 = {74, 65, 86, 65, 42};
        String str5 = new String(byte_array2, 2, 3);

        // Printing str5 to console
        System.out.println(str5); // VA*

        // Construct a new string by decoding the byte array depending on starting symbol and length
        // using char_set for decoding
        byte [] byte_array4 = {74, 65, 86, 65, 42};
        Charset charset = Charset.defaultCharset();
        String str6 = new String(byte_array4, 3, 2, charset);

        // Printing str6 to console
        System.out.println(str6); // A*

        // Construct a new string by decoding the byte array depending on starting symbol and length
        // using char_set_name for decoding
        byte [] byte_array5 = {74, 65, 86, 65, 42};
        String str7 = new String(byte_array5, 3, 2, "US-ASCII");

        // Printing str7 to console
        System.out.println(str7); // A*

        // Creating a new String from given Character array
        char [] char_array = {'J', 'a', 'v', 'a'};
        String str8 = new String(char_array);

        // Printing str8 to console
        System.out.println(str8); // Java

        // Creating a new String from given Character array but choose characters from starting index and length
        char [] char_array1 = {'J', 'a', 'v', 'a'};
        String str9 = new String(char_array, 1, 2);

        // Printing str9 to console
        System.out.println(str9); // av

        // Creating a new string using a StringBuffer
        StringBuffer str_buffer = new StringBuffer("JAVA");
        String str10 = new String(str_buffer);

        // Printing str10 to console
        System.out.println(str10); // JAVA

        // Creating a new string using a StringBuilder
        StringBuilder str_builder = new StringBuilder("Java");
        String str11 = new String(str_builder);

        // Printing str11 to console
        System.out.println(str11); // Java
    }
}