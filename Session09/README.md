# Session 9

## Table of Contents
1. [Graphs](#graphs)
    1. [Applications](#applications)
    2. [Classification](#classification)
    3. [Representation](#representation)
    4. [Terminology](#terminology)
    5. [Traversals and Algorithms](#traversals)
    6. [Problems](#problems)
    7. [An Extensive List of Graph Topics](#gfg-graphs)
2. [Assignments](#assignments)
    1. [HackerRank](#hackerrank)
    2. [LeetCode](#leetcode)
    
    
### <a name="graphs"></a>Graphs
A graph is a set of finite set of vertices, along with edges that connect these vertices.

Graphs are a vast topic, with dozens of algorithms that can be performed on them.

#### <a name="applications"></a>Applications

1. Social Networks
2. Geographical Data (Google Maps, Air Navigation Routes)
3. Networking (Routers, Switches, Hubs)
4. Databases (Neo4J)
5. Web Scraping (PageRank)
6. Gaming (Path solving)

#### <a name="classification"></a>Classification

Graphs can be categorized on the basis of
1. Weightedness
    1. Unweighted - All edges have the same weight / unit weight.
    2. Weighted - Each edge can have a different weight.
2. Directedness
    1. Undirected - If u is reachable from v, then vice versa is also true.
    2. Directed - If u is reachable from v, then v may or may not be reachable from u, i.e. each edge has a direction.

#### <a name="representation"></a>Representation

Graphs can be represented either by means of

1. Adjacency Matrix - A 2D matrix that holds the weight from every ith vertex to every jth vertex. Infinity implies the vertices are not connected.  
```java
class Graph {
    int[][] adjacencyMatrix;

    public boolean isAdjacent(int u, int v) {
        return adjacencyMatrix[u][v] != Integer.MAX_VALUE;
    }

    ...
}
```

2. Adjacency Lists - Each Vertex maintains a list of its adjacent vertices  
```java  
class Vertex {
    Set<Vertex> neighbors;

    public Set<Vertex> getAdjacentVertices() {
        return new HashSet<>(neighbors);
    }
}

class Graph {
    Set<Vertex> allVertices;

    public boolean isAdjacent(Vertex u, Vertex v) {
        return u.getAdjacentVertices().contains(v);
    }
}
```

#### <a name="terminology"></a>Terminology

1. Indegree - The number of vertices from which this vertex is reachable
2. Outdegree - The number of vertices reachable from this vertex
3. Sink Vertex - A vertex with outdegree = 0

#### <a name="traversals"></a>Traversals

1. Breadth First Search

   This is typically used to find the shortest path from one node to another, or to search for a particular node. The following psuedo code is a general piece of code that you can use for any application of the algorithm
   ```
   bfs(Graph g, source s)
        Let Q be a queue
        Let visited be a set

        Q.enqueue(s)
        put s into the visited set

        while Q is not empty:
            current = Q.dequeue()
            for all unvisited neighbors x of current:
                Q.enqueue(x)
                put x into the visited set
   ```
   BFS will always visit vertices at a particular depth i before all vertices at depth > i.

2. Depth First Search

    This is typically used for backtracking algorithms. One of the most popular problems solved by using DFS is the n-Queen problem.
    ```
    dfs(Graph g, source s)
        Let St be a stack
        Let visited be a set

        St.push(s)
        Put s into the visited set

        while St is not empty:
            current = St.pop()
            for all unvisited neighbors x of current:
                St.push(x)
                put x into the visited set
    ```

Note that both the algorithms are identical, except for a single data structure choice (queue vs stack)

#### <a name="problems">Problems
1. One of the constraints on using an adjacency matrix as a choice of representation of a graph is that the vertices have to be numbered. Can you think of a similar solution if the vertices are not numbered (A, B, C instead of 1,2,3)?
2. Come up with at least three examples for each combination of weighted/unweighted and directed/undirected graphs, i.e. you should have a total of 12 examples. (You're free to use Google search, the idea is to be aware of various applications)
3. Implement the BFS algorithm for an unweighted, undirected graph. It should accept an adjacency matrix, a source vertex, and a goal vertex.It should print out three things:  
    1. Whether or not the goal vertex is reachable from the source vertex  
    2. The distance to be traversed to reach the goal vertex (if the goal vertex is indeed reachable)  
    3. The shortest path from the source vertex to the goal vertex
    Write your code step by step, using the pseudo code above as a starting point. Think and reason about whether your algorithm would work for directed graphs as well. Then try it out.
4. Implement the DFS algorithm for an unweighted, undirected graph, to determine whether or not there are cycles in the graph. (Hint: you will ALWAYS encounter a vertex that is already on the stack in case there is a cycle)
5. Study and implement [Djikstra's algorithm](https://www.hackerearth.com/practice/notes/dijkstras-algorithm/) for the shortest path in a weighted, directed graph. (It is pronounced as Dyke-stra)

#### <a name="gfg-graphs"></a>An Extensive List of Graph Topics
Go through the topic list for the [Graph section at GeeksForGeeks](http://www.geeksforgeeks.org/graph-data-structure-and-algorithms/), and read the following topics thoroughly:  
1. Introduction, DFS and BFS
2. Detecting cycles
3. Topological sorting
4. Minimum Spanning Tree (Either of Prim/Kruskal should suffice)
5. n-Queen and Knight's tour problems
6. m Coloring problem
7. Finding the number of islands (This can be rephrased in a lot of different ways, for example, see [this](https://en.wikipedia.org/wiki/Connected-component_labeling))

### <a name="assignments"></a>Assignments

#### <a name="hackerrank"></a>HackerRank
1. https://www.hackerrank.com/challenges/bfsshortreach
2. https://www.hackerrank.com/challenges/the-quickest-way-up

#### <a name="leetcode"></a>LeetCode
1. https://leetcode.com/problems/all-paths-from-source-to-target
