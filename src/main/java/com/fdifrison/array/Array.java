package com.fdifrison.array;

import java.util.ArrayList;

/**
 * Arrays are containers object of fixed size and single type of element.
 *
 * <ul>
 * <li>The items in the array are located in the heap memory next to each other and
 * therefore can be accessed in O(1) time through their index.</li>
 * <li>The reference to the array (i.e. the local variable to which the array is
 * associated) is stored in the stack memory.</li>
 * <li>Due to its fix size, resizing an array is an expensive operation since it requires
 * to copy the current data in a new larger array, therefore having a O(n) execution
 * time.</li>
 * <li>Retrieving an arbitrary item has also O(n) since we need to scan the whole
 * array</li>
 * <li>Removing and inserting an element at the end of the array has O(1) while perform the same operation an arbitrary
 * element has O(n) since we need to shift all the other elements in the array</li>
 * </ul>
 */
public class Array {

    public static void main(String[] args) {

        // we need a fix size in advice, arrays are not dynamic datastructures
        int[] nums = new int[10];
        // insertion has constant time
        for (int j = 0; j < nums.length; j++) {
            nums[j] = j;
        }
        // retrieval in linear time
        for (int i : nums) {
            if (i == 8) System.out.printf("found %s\n", i);
        }

        // ArrayList are the Java wrapper around array
        var names = new ArrayList<String>();
        names.add("John");
        names.add("Jane");
        names.add("Bob");

        // linear time due to the shifting in position of the other elements
        names.remove("John");
        names.add(1, "Jake");

        System.out.println(names);
    }
}
