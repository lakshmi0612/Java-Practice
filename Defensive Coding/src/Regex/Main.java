package Regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

    public static void main(String[] args) {


        String sentence = "I am 23 years old!";

        Pattern pattern = Pattern.compile("\\d+");
        Matcher match = pattern.matcher(sentence);

        System.out.println(match.find());
        System.out.println(match.group());

    }

}
