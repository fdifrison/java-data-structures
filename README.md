# Algorithms and Data structure in Java

## Array

Arrays are containers object of fixed size and single type of element.

* **search on index: O(1)**
* **insert last available position: O(1)**
* **remove last item: O(1)**
* **search for arbitrary item: O(n)**
* **insert at random position: O(n)**
* **remove at random position: O(n)**

The items in the array are located in the heap memory next to each other and therefore can be accessed in O(1)
time through their index (**Random indexing**). The reference to the array (i.e. the local variable to which the array
is associated) is stored in the stack memory. Due to its fix size (static datastructures), resizing an array is an
expensive operation since it
requires to copy the current data in a new larger array, therefore having a O(n) execution
time. Retrieving an arbitrary item has also O(n) since we need to scan the whole
array Removing and inserting an element at the end of the array has O(1) while perform the same operation an arbitrary
element has O(n) since we need to shift all the other elements in the array

## Linked List

* **find/insert/remove item first position: O(1)**
* **find/insert/remove item arbitrary position: O(n)**

Linked list are dynamic datastructures, they can acquire memory at runtime without resizing.
The items are not next to each other in the heap memory, therefore we can't favor random access like
for arrays, but we can potentially store items of different size. Each element contains the data and a reference (link)
to the next element in the list (but not to the previous);
this cause each element to occupy more space. We have direct access to the first node (head node) and the last node is
recognized
because it points to a null. Inserting an element in first position has now O(1) we don't need to shift the other
elements but just update the reference to the head node; on the contrary, inserting an element at the end of the list
has O(n) since we have to traverse the whole list to update the reference of the former last node. Therefore, running
time is poorly predictable since it depends greatly on the operation performed by the user.
**Java implementation of linked list has is actually a doubly linked list**

## Doubly Linked List

* **find/insert/remove item first/last position: O(1)**
* **find/insert/remove item arbitrary position: O(n)**

Very similar to Linked List, Doubly Linked List is a dynamic datastructures that has a pointer both to the next and the
previous element; this increase the size in memory but gives some advantages. We have a reference to both the head and
the tail of the list, both having a null reference, respectively the previous for the head and the next for the tail.
Thanks to the double reference we can traverse the list in both direction and insertion/deletion operation have O(1)
both at the head and at the tail.