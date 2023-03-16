package com.epam.lecture.task;

/*
    Display all the array elements that are grater or equal 5 and less than 15.

    Array: -1, 12, 45, -1, 22, 17, 9, -15, 15, 71, 39.
 */
public class TaskTwo {

    public static void main(String[] args) {
        int[] array = {-1, 12, 45, -1, 22, 17, 9, -15, 15, 71, 39};

        for (int element : array) {
            if ((element >= 5) && (element < 15)) {
                System.out.println(element);
            }
        }
    }
}
