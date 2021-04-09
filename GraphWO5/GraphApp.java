/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GraphWO5;
import java.lang.RuntimeException;
/**
 *
 * @author RifqiFebri
 */
public class GraphApp {
    public static void main (String [] args) {
        
        Graph thegraph = new Graph();
        
        // Graph g = new Graph(4);
        
        thegraph.addvertex ('A');
        thegraph.addvertex ('B');
        thegraph.addvertex ('C');
        thegraph.addvertex ('D');
        thegraph.addvertex ('E');
        
        thegraph.addedge(0, 1);
        thegraph.addedge(1, 2);
        thegraph.addedge(2, 3);
        thegraph.addedge(3, 4);
        
        /*
        g.addEdge(0,1);
        g.addEdge(1,2);
        g.addEdge(2,3);
        g.addEdge(3,4);
        */
        
        thegraph.display();
        thegraph.bfs();
        
        /*
        System.out.println(
            "Following is Depth First Traversal "
            + "(starting from vertex 2)");
        */
        // g.DFS(2);
        
        
    }  
        
 }
  
    


