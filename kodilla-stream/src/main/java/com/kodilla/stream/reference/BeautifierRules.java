package com.kodilla.stream.reference;

import static jdk.nashorn.internal.objects.NativeString.toUpperCase;

public class BeautifierRules {
    public static String AbcBeforeAfter(String text){
        return "ABC" + text + "ABC";
    }

    public static String Uppercase(String text){
        return toUpperCase(text);
    }

    public static String colorGreen(String text){
        return "\u001B[32m" + text + "\u001B[37m";

    }

}
