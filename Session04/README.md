# Session 4

## Table of Contents
1. [Sorting](#sorting)
2. [Assignments](#assignments)
    1. [HackerRank](#hackerrank)
    2. [Miscellaneous](#miscellaneous)
   
### <a name="sorting"></a>Sorting

Sorting is simply ordering a collection according to natural ordering, or some comparator logic. For instance, an array of integers can be sorted in ascending order, an array of Strings can be sorted in lexicographical (dictionary) order, and so on.  

There are dozens of sorting algorithms, which we will see in a later session. For now, remember that very rarely will you have to write a sorting algorithm from scratch. It is only in certain problems where you have to modify an existing sorting algorithm to get to the solution. In most other cases, if you want to sort an array (or any other collection), it is best to use in built methods since they have been scrutinized and optimized far beyond what a hand-written algorithm would be capable of.  

In Java, you can use `Arrays.sort` static (overloaded) method from the [Arrays](https://docs.oracle.com/javase/7/docs/api/java/util/Arrays.html) utility class from the `java.util` package.

There are various other types of sorts which you must know about(from the point of view of interview prep) and are discussed below.

#### Count Sort

```
for i from 0 until n:
  frequency[a[i]]++;
```
Count Sort is an extremely simple and useful sorting technique. This sort works when the nunmber of unique elements are finite and are known. 

Create a frequency array each index of which represents the number of times that element is present in the list. 

Finally, printing each element as many times as its frequency leads you to sorted data!

This sorting will be extremely helpful for a lot of problems in competitive:

1. When the array elements are <=10000
2. When in a String problem you need to deal with order of characters (Frequency array of 26)

##### Practical applications:
Let's say 5 friends go to a restaurent and here are the things each of those people wish to eat.
1. P1: 1 Pizza + 1 Coke
2. P2: 1 Pizza + 1 Burger
3. P3: 1 Burger + 1 Coke 
4. P4. 1 Pizza + 2 Burgers
5. P5. 2 Cokes. 

How do you place this order? The same way as written above? Or simply - 3 Pizzas, 4 Cokes, 4 Burgers? You count the number of times each item is being ordered! Count sort!

#### Selection Sort

```
for i from 0 until n:
    find the min in the range [i, n)
    swap it with the element at a[i]
```

Selection sort simply _selects_ the smallest (or largest) element at every iteration, and puts it in its rightful place.

Selection sort also has the same property as bubble sort, in that in the first k iterations, the first k elements are in their final sorted order (and will never be moved again).

##### Practical applications:

1. You have a pile of books and you are asked to arrange them such that the largest book is at the bottom. Probably you would select the biggest book and place it at the bottom. And repeat this for all books except the bottom one. This is selection sort!
2. There are 30 pairs of shoes and you are asked to arrange them by size. What would you do? 
#### Insertion Sort

```
for i from 1 until n:
    tmp = a[i]

    j = i - 1

    while j >= 0 and tmp < a[j]:
        a[j + 1] = a[j]
        j = j - 1

    a[j + 1] = tmp
```

Insertion sort is typically useful when you already have a sorted array, and have to insert elements into it.

##### Practical applications:
1. You are playing a game of cards and you wish to hold the cards in a sorted order based on their values. What you do is pick a card that's incorrectly placed and insert it in its correct position which shifts the cards to its right by one position. This is insertion sort!
2. Was your class asked to stand height-wise in school? How did you all go about it starting from a random arrangement?

#### Quick Sort

```
# Note, this is an in place algorithm, it modifies the original array
def sort(a):
    p = partition(a)
    n = size(a)

    sort(a[0, p])
    sort(a[p, n-1])


def partition(a):
    n = size(a)
    pivot = a[n - 1]

    toSwap = 0

    for i from 0 until n - 1:
        if a[i] < pivot:
            swap a[toSwap] and a[i]
            toSwap = toSwap + 1

    swap a[n-1] and a[toSwap]
    return toSwap    
```

At each iteration of a quick sort, the pivot element is put into its rightful place.

### <a name="assignments"></a>Assignments

#### HackerRank
1. https://www.hackerrank.com/challenges/tutorial-intro
2. https://www.hackerrank.com/challenges/insertionsort1
3. https://www.hackerrank.com/challenges/insertionsort2
4. https://www.hackerrank.com/challenges/correctness-invariant
5. https://www.hackerrank.com/challenges/quicksort1
6. https://www.hackerrank.com/challenges/quicksort2
7. https://www.hackerrank.com/challenges/quicksort3
8. https://www.hackerrank.com/challenges/countingsort1
9. https://www.hackerrank.com/challenges/countingsort2
16. https://www.hackerrank.com/challenges/countingsort3
