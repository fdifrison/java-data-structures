# Algorithms and Data structures in Java

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
is associated) is stored in the stack memory. Due to its fix size (static DS), resizing an array is an
expensive operation since it
requires to copy the current data in a new larger array, therefore having a O(n) execution
time. Retrieving an arbitrary item has also O(n) since we need to scan the whole
array Removing and inserting an element at the end of the array has O(1) while perform the same operation an arbitrary
element has O(n) since we need to shift all the other elements in the array

## Linked List

* **find/insert/remove item first position: O(1)**
* **find/insert/remove item arbitrary position: O(n)**

Linked list are dynamic DS, they can acquire memory at runtime without resizing.
The items are not next to each other in the heap memory, therefore we can't favor random access like
for arrays, but we can potentially store items of different size. Each element contains the data and a reference (link)
to the next element in the list (but not to the previous);this cause each element to occupy more space. We have direct
access to the first node (head node) and the last node is recognized because it points to a null. Inserting an element
in first position has now O(1) we don't need to shift the other elements but just update the reference to the head node;
on the contrary, inserting an element at the end of the list has O(n) since we have to traverse the whole list to update
the reference of the former last node. Therefore, running time is poorly predictable since it depends greatly on the
operation performed by the user. **Java implementation of linked list has is actually a doubly linked list**

## Doubly Linked List

* **find/insert/remove item first/last position: O(1)**
* **find/insert/remove item arbitrary position: O(n)**

Very similar to Linked List, Doubly Linked List is a dynamic DS that has a pointer both to the next and the
previous element; this increase the size in memory but gives some advantages. We have a reference to both the head and
the tail of the list, both having a null reference, respectively the previous for the head and the next for the tail.
Thanks to the double reference we can traverse the list in both direction and insertion/deletion operation have O(1)
both at the head and at the tail.

## Stack

Stack is an **abstract data type**, meaning that it defines a behavior that the algorithmic implementation must satisfy.
The stack is based on the **LIFO** principle: **L**ast **I**tem to be added is the **F**irst item to go **O**ut.
The main operation that has to define are **pop()** to get and remove the last inserted item, **push()** to add an item
and the **peek()** witch get the first item (the last inserted one) but without removing it.

### Stack memory

The stack memory is that part of the RAM that is used by the JVM to store local variable and method calls (the method's
stack frame that contains the method's variables). When a method is executed, its corresponding method's frame is popped
from the stack. Stack memory is small in size but fast to access. If the stack memory is filled than we get the infamous
StackOverFlow error, meaning that there is no more space to insert other method's frame.

### Heap memory

The heap memory is another part of the RAM which is used by the JVM to perform dynamic allocation of memory, i.e.
storing objects (while the reference, i.e. the address of the object is stored in the heap, the object itself, i.e. the
reference type is stored in the stack, even if the object is created as a local variable inside a method). Its size is
way larger than the stack but its access time is also greatly slower. The heap memory is freed by the JVM calling the
Garbage Collector to dispose an object whenever it is not used anymore (i.e. there is no live reference to it in the
stack memory).

## Queue

Queue is an **abstract data type**, meaning that it defines a behavior that the algorithmic implementation must satisfy.
The queue is based on the **FIFO** principle: **F**irst **I**tem to be added is the **F**irst item to go **O**ut.
The main operation that has to define are **dequeue()** to get and remove the first inserted item, **enqueue()** to add
an item and the **peek()** witch get the first inserted item but without removing it. A common application of queues is
multithreading, async tasks to ensure consistency and breath-first search algorithm.

## Trees

In graph theory threes are undirected graph in which any two vertices are connected by exactly one path. We have the
definition of a **root node**, which is the only access point of the tree and to which every other node as a path (every
node can be accessed by the via the root node). We can define also a parent-children relation between nodes, and the
vertices of the tree are called **leaf nodes** (i.e. the only nodes that have a parent but not a children). The height
of a tree is represented by the number of layers, or the longest path between the root and the leaves.

### Binary Search Trees

* **find/insert/remove item: O(logN)** (with a worst case of O(N) in the case of imbalance tree)

Binary search trees try to solve the common problem to arrays and linked lists, which is the O(n) complexity in
retrieving an arbitrary value since we have potentially to traverse the whole container. BST instead reach O(logN)
complexity by storing the elements in a sorted order. Having a sorted collection, we can always start to look at the
middle element, look if the value we are looking for is greater or lesser, and discard the half of the collection that
for sure won't contain our element.

BST are particular tree DS in which the edges have a direction, every node can have at most 2 children, left child is
smaller and right child is bigger thant the parent node. This is how, starting from the root node, we can always discard
half of the tree while searching for a value, since the right branch will contain values greater thant the root while
the left branch the opposite.

A tree is called imbalanced if there is a high skewness between left and right nodes and this is a problem since the O(
logN) running time for searching and arbitrary element goes up to O(n) (we are basically traversing a linked list).

Due to the structure of BST also find the min and the max value of the container has O(logN) running time since they
will always be respectively the leftmost and the rightmost leave node.


