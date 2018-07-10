# Session 8

## Table of Contents
1. [Trees](#trees)
    1. [Binary Trees](#binary-trees)
    2. [Binary Search Trees](#bst)
2. [The Object Class, `equals` and `hashCode`](#object)
3. [The Collections Framework - Part II](#cfw)
    1. [Maps!](#maps)
    2. [Problems](#cfwproblems)
4. [Assignments](#assignments)
    1. [HackerRank](#hackerrank)
    2. [LeetCode](#leetcode)
    3. [Miscellaneous](#miscellaneous)


### <a name="trees"></a>Trees

#### <a name="binary-trees"></a>Binary Trees

Binary Trees are a class of tree data structures, with the following property: *Each node may have a maximum of two children.*

Binary Trees by themselves are typically not very useful. By applying additional constraints on top of them, they can be given useful properties. Some examples of binary trees are:
1. Binary Search Trees  
2. Heaps
3. Treaps

Problems:
1. https://www.hackerrank.com/challenges/tree-preorder-traversal
2. https://www.hackerrank.com/challenges/tree-postorder-traversal
3. https://www.hackerrank.com/challenges/tree-inorder-traversal
4. https://www.hackerrank.com/challenges/tree-height-of-a-binary-tree
5. https://www.hackerrank.com/challenges/binary-search-tree-lowest-common-ancestor

#### <a name="bst"></a>Binary Search Trees

A Binary Search Tree (a.k.a BST) is a type of Binary Tree, which has the following constraints added to it:
1. The left subtree of the root node MUST have values less than the root node's value.
2. The right subtree of the root node MUST have values greater than the root node's value.
3. The left and right subtrees must be valid binary search trees.

A binary search tree gives you O(log(n)) access to any element, similar to using binary search in a sorted array.


### <a name="object"></a>The Object Class, `equals` and `hashCode`

1. [The Object class](https://docs.oracle.com/javase/7/docs/api/java/lang/Object.html)
2. [hashCode](https://docs.oracle.com/javase/7/docs/api/java/lang/Object.html#hashCode())
3. [equals](https://docs.oracle.com/javase/7/docs/api/java/lang/Object.html#equals(java.lang.Object))

### <a name="cfw"></a>The Collections Framework - Part 2

#### <a name="maps"></a>Maps

Maps are known by various names in different contexts/languages; dictionaries, associative arrays, symbol table, etc. It is simply a **collection** of key-value pairs.

Maps are not part of the Iterable-Collection *hierarchy*, but they are still part of the framework.

A Map is internally implemented as an array of buckets. Each buckets is in itself a linked list (though this detail can change for the sake of efficiency, e.g. a bst instead of a linked list).

Each key-value pair in the bucket is stored as an `Entry`. The entry class looks something like this:

```java
private static class Entry<K,V> implements Map.Entry<K,V> {
     final K key;
     final int hash;
     V value;
     Entry<K,V> next;
}
```

You can clearly make out the linked list nature of the Entry class because of the `Entry<K,V> next` field.

There are two main operations that you typically perform on a Map:

1. put(key, value)  
    When you call the `put` method, the following steps occur:
    1. The hash of the key is calculated using the `hashCode()` method.   
    2. An index `i` is derived from the resulting hash.  
    3. An instance of the `Entry` class (e) is created, with the relevant fields.   
    3. If there is no entry at the array location `i`, the instance e is set at the location.  
    4. If there *is* an entry at the array location `i`, then:  
        1. If the key passed to the put method as an argument is `equal` to the key of the existing entry, then the value is updated, and the old value is returned.  
        2. If the key passed to the put method as an argument is *not* `equal` to the key of the existing entry, then the instance e is appended to the linked list.

2. get(key)  
    When you call the `get` method, the following steps occur:
    1. The hash of the key is calculated using the `hashCode()` method.  
    2. An index `i` is derived from the resulting hash.  
    3. A linear search for the key is conducted in the linked list at the location `i`, with `equals()` being used to determine if the element is found or not.  
    4. If no element exists in the Map with this key, null is returned.


A simple visualization of the internal structure of the HashMap is:

![HashMap internal structure](https://infinitescript.com/wordpress/wp-content/uploads/2014/09/HashMap-Structure.png)

Sample usage:

```java
// A map from name to house
HashMap<String, String> houseMap = new HashMap<>();
houseMap.put("jaime", "lannister");
houseMap.put("robert", "baratheon");
houseMap.put("theon", "greyjoy");
houseMap.put("bran", "stark");
houseMap.put("ned", "stark"); // RIP

System.out.println(houseMap.get("theon"));    // greyjoy
System.out.println(houseMap.get("thoros"));   // null
```

As usual, one of the best places to understand Maps is the [JavaDocs](https://docs.oracle.com/javase/7/docs/api/java/util/Map.html)

#### <a name="cfwproblems"></a>Problems
1. https://www.codechef.com/problems/MIME2


### <a name="assignments"></a>Assignments

#### <a name="hackerrank"></a>HackerRank
1. https://www.hackerrank.com/challenges/tree-top-view
2. https://www.hackerrank.com/challenges/binary-search-tree-insertion
3. https://www.hackerrank.com/challenges/is-binary-search-tree
4. https://www.hackerrank.com/challenges/phone-book
        
#### <a name="leetcode"></a>LeetCode
01. https://leetcode.com/problems/maximum-depth-of-binary-tree
02. https://leetcode.com/problems/invert-binary-tree
03. https://leetcode.com/problems/find-largest-value-in-each-tree-row
04. https://leetcode.com/problems/merge-two-binary-trees
05. https://leetcode.com/problems/average-of-levels-in-binary-tree
06. https://leetcode.com/problems/maximum-binary-tree
07. https://leetcode.com/problems/trim-a-binary-search-tree
08. https://leetcode.com/problems/binary-tree-pruning
09. https://leetcode.com/problems/sort-characters-by-frequency
10. https://leetcode.com/problems/subdomain-visit-count
11. https://leetcode.com/problems/most-common-word


#### <a name="miscellaneous"></a>Miscellaneous

1. In the directory [binarytree/problems](binarytree/problems), there is an abstract class `BinaryTree`, and a concrete class `BinarySearchTree`. You need to fill in the missing methods, and *write a driver program to ensure that your implementation is correct*. A `TreeNode` class has already been provided for you.  
When reading the code, try to appreciate and understand how an abstract class is being used to provide a default implementation for some of the methods. In particular, think about these points:
   1. Why is `BinaryTree` abstract?  
   2. Why are the methods `insert`, `delete`, `search` and `lowestCommonAncestor` abstract?
2. Companies have several positions that an employee can be at. Employees at the same position get the same salary. Given a list of employees and their salaries, you have to determine how many positions are there at a given company. The input spec is as follows:
    1. The first line is a number (say N)
    2. N lines follow. Each line contains the name of an employee, and his salary (space separated). The salary may range from 10^5 to 10^9
    3. Display the number of positions at this company
3. You have probably heard of the mobile application called TrueCaller. By looking at a phone number, it tells you who is calling. It works like a reverse look-up phone directory.
You have been asked to implement this application.
    1. The first line is a number (say N)
    2. N lines follow
    3. Each line contains a String denoting the name of a person (which may have spaces) and his/her number in a space separated manner
    4. Store the names and numbers
    5. Now start a menu-driven flow to:
        1. Accept a number from the user
            1. If the number has a name associated with it, display it.
            2. If it does not, inform the user that it does not exist, and give him the option to provide a name. Store the name and number.
        2. Display the entire reverse mapping, in the following format:
            1. Number1: Name
            2. Number2: Name
        3. Change a particular phone number’s owner
        4. Quit the program
