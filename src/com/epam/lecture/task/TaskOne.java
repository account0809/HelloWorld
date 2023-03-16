package com.epam.lecture.task;

/*
    Show message "comma is found" all the times when comma is found in the text
    and show message "period is found" all the times period is found.

    The text is provided: A dot is usually a small, round spot. Full stop or "period", a sentence terminator.
    The comma, is a punctuation mark that appears in several variants in different languages.
 */
public class TaskOne {

    public static void main(String[] args) {
        String text = "A dot is usually a small, round spot. Full stop or \"period\", a sentence terminator. The comma, is a punctuation mark that appears in several variants in different languages.";

        for(int i = 0; i < text.length(); i++) {
            if (text.charAt(i) == '.') {
                System.out.println("period is found");
            } else if (text.charAt(i) == ',') {
                System.out.println("comma is found");
            }
        }
    }
}
