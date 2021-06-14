package BreadthFirstSearch;

//import java.io.*;
import java.util.*;

public class Graph {
    protected int v; //vertives
    protected LinkedList<Integer> adj[]; 

    public Graph(int vertice){
        this.v = vertice;
        this.adj = new LinkedList[vertice]; //made a link list with 4 empty slot
        for (int i = 0; i < vertice; ++i) {
            adj[i] = new LinkedList<>(); //each empty slot assign as object
        }
    }

    public void addEdge(int v, int w){
        adj[v].add(w);
    }

    public void BFS(int s){
        boolean visited[] = new boolean[v];
        
        LinkedList<Integer> queue = new LinkedList<Integer>();
        
        visited[s] = true;
        queue.add(s);
        
        while (queue.size() != 0) {
            s = queue.poll();
            System.out.print(s + " ");

            Iterator<Integer> i = adj[s].listIterator();
            while (i.hasNext()) {
                int n = i.next();
                if (!visited[n]) {
                    visited[n] = true;
                    queue.add(n);
                }
            }
        }
    }
}
