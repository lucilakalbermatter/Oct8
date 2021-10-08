package main.java;

import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class Ex2 {

    public static void main(String[] args) {

        System.out.println(myVowels("Happy Thanksgiving to all--even the haters and losers!"));

    }

    public static String myVowels (String sourceText) {

        String str = sourceText.toLowerCase();
        String str1 = "";

        Pattern pt = Pattern.compile("[aeiou]");
        Matcher m = pt.matcher(str);

        if (m.find()) {
            return(str.replaceAll("[aeiou]", ""));
        } else {
            return "Happy Thanksgiving to all--even the haters and losers!";
        }
    }
}


