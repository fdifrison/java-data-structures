package com.fdifrison.array;

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
 * <li>Removing a specific element has O(1) since we can again access it by index</li>
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
			if (i == 8)
				System.out.printf("found %s", i);
		}

	}

}
