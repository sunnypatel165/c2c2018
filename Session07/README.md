# Session 7

## Table of Contents
1. [The Collections Framework - Part I](#cfw)
    1. [The Collection Hierarchy](#hierarchy)
    2. [Lists, Queues and Sets](#list-queue-set)
    3. [Problems](#cfwproblems)
3. [Assignments](#assignments)
    1. [HackerRank](#hackerrank)
    2. [LeetCode](#leetcode)

### <a name="cfw"></a>The Collections Framework

The collection framework is a set of interfaces, implementations and algorithms, that allow you to store, retrieve, manipulate, and communicate aggregate data.

An excellent guide to the CFW is [Oracle's Tutorial](https://docs.oracle.com/javase/tutorial/collections/intro/)

#### <a name="hierarchy"></a>The Collection Hierarchy (Part I)

![The Collection FrameWork Hierarchy](http://4.bp.blogspot.com/-DvsfKh9clI0/UU3sK7J17jI/AAAAAAAAARU/VnHJDjImzw4/s1600/java-collection-hierarchy.png)

#### <a name="list-queue-set"></a>Lists, Queues and Sets

For any collection, the most important resource is the JavaDoc. This will tell you everything you need to know about the class, right from constructors, methods and implementation details.

List: https://docs.oracle.com/javase/7/docs/api/java/util/List.html  
Queue: https://docs.oracle.com/javase/7/docs/api/java/util/Queue.html  
Set: http://docs.oracle.com/javase/7/docs/api/java/util/Set.html


#### <a name="cfwproblems"></a>Problems

1. You are given a long list of space separated words. There may be duplicates. Print the list of unique words, each one on a newline that appear in the previous list. It is **not** necessary to print them in the same order as they appeared in the list.  
   Input:
   ```
   is it crazy how saying sentences backwards creates backwards sentences saying how crazy it is
   ```
   Output:
   ```
   is
   it
   crazy
   how
   saying
   sentences
   backwards
   creates
   ```

2. Can you modify the above code to print the words out in alphabetical order?

3. Given two sorted lists of integers of size n and m, create a new list that contains all the integers in sorted order.  
   Input:  
   ```
   3 5
   1
   4
   9
   2
   7
   8
   12
   16
   ```
   Output:  
   ```
   1
   2
   4
   7
   8
   9
   12
   16
   ```

4. You are given a list of n numbers in no particular order. For each number, print out the next highest number in the list. If there is no such number, print -1.  
   Input:  
   ```
   8
   1 4 2 3 6 5 9 4
   ```
   Output:  
   ```
   4 6 3 6 9 9 -1 -1
   ```
   Explanation:  
     * For 1, the next highest number in the list is 4.  
     * For 4 the next highest number in the list is 6.  
     * For 2 the next highest number in the list is 3.
     * For 3, the next highest number inthe list is 6.
     * For 6 and 5 the next highest number in the list is 9.  
     * For 9, there is no next highest number.  
     * For 4, there is no next highest number.  

5. You are given a list of n chess moves. Each move is a string, and can be either:
    1. Any string, such as "c5", "Be6", "Nf3", etc.
    2. "undo".
    3. "print"  
   After each print command, print all the moves made till now in a space separated manner.  
   In case the move is "undo", undo the last move.
   Input:  
   ```
   7
   c5
   print
   Be6
   Nf3
   print
   undo
   print
   ```
   Output:
   ```
   c5
   c5 Be6 Nf3
   c5 Be6
   ```

### <a name="assignments"></a>Assignments

#### <a name="hackerrank"></a>HackerRank
1. https://www.hackerrank.com/challenges/java-list
2. https://www.hackerrank.com/challenges/java-stack
3. https://www.hackerrank.com/challenges/java-hashset
4. https://www.hackerrank.com/challenges/maximum-element (solve using a CFW class)
5. https://www.hackerrank.com/challenges/simple-text-editor (solve using a CFW class)

#### <a name="leetcode"></a>LeetCode
1. https://leetcode.com/problems/find-all-duplicates-in-an-array/description/
2. https://leetcode.com/problems/unique-morse-code-words/description/
3. https://leetcode.com/problems/jewels-and-stones/description/
4. https://leetcode.com/problems/daily-temperatures/description/
