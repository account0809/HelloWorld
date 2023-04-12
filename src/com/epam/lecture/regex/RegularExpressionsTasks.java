package com.epam.lecture.regex;

import java.util.Arrays;
import java.util.regex.Pattern;

public class RegularExpressionsTasks {

    public static void main(String[] args) {
        //removeTags();
        //xyTest("xxxy");
        splitSentence();
    }

    public static void splitSentence() {
        String text = "Oh-oh-oh-oh-oh-oh-oh, eh-eh oh, ya-ya, la-la-lu-la";
        Pattern pattern = Pattern.compile("[,\\s]+|-+");

        System.out.println(Arrays.toString(pattern.split(text)));
    }

    public static void patentTest(String textToTest) {
        String regex = "(RE|PP)\\d{6}";
        Pattern pattern = Pattern.compile(regex);
        System.out.println(pattern.matcher(textToTest).matches());
    }

    public static void xyTest(String text) {
        String pattern = "x+y";
        Pattern pattern1 = Pattern.compile(pattern);
        System.out.println(pattern1.matcher(text).matches());
    }

    public static void removeTags() {
        String textWithTags = "<head>Orders</head><body>From: Supplier corp.</body>";
        String regex = "(</?\\w+>)";

        System.out.println(textWithTags.replaceAll(regex, ""));
    }
}
