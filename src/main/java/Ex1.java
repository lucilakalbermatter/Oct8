package main.java;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Ex1 {

    public static void main(String[] args) {
        //Demo
        System.out.println(trap("This goes traaa"));
    }

    public static boolean trap (String sourceText){
        //Compile the string to a regex Pattern
        Pattern p = Pattern.compile("trap");

        //Create a matcher for the above input
        Matcher m = p.matcher(sourceText.toLowerCase());
        boolean result = m.find();
        if (result) {
            System.out.println("BOO!!");
        } else {
            System.out.println("Relax, there is no trap");
        }
    return result;
    }

}