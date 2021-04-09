/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GraphWO5;
import java.util.*;
/**
 *
 * @author RifqiFebri
 */
public class Dfs {
     int V;    
    LinkedList<Integer> adjList[]; 
    
    
    Dfs(int v) {
        System.out.println("Visit by using Depth First Search algorithm :");
        V = v;
        adjList = new LinkedList[v];
        for (int i=0; i<v; ++i)
		{
            adjList[i] = new LinkedList();  
		}
    }
   
    void addEdgesToGraph(int v, int u)
    {
        adjList[v].add(u);     
    }
	
    void DFTraversal(int v,int visited[])
    {
        visited[v] = 1;
            System.out.print(v + " ");
        Iterator<Integer> i = adjList[v].listIterator();
        while (i.hasNext())
        {
            int n = i.next();
            if (visited[n]==0)
                DFTraversal(n, visited);
        }
    }
	
    void DFSearch(int v)
    {
        
        int visited[] = new int[V];
		
        DFTraversal(v, visited);
		for (int i=1;i<V;i++)
		{
			if(visited[i]==0)
			{
		     DFTraversal(i, visited);
			}
		}
    }
    
    public static void main(String args[])
    {
     Dfs obj = new Dfs(10);
        
        obj.addEdgesToGraph(1,3);
        obj.addEdgesToGraph(5,4);
        obj.addEdgesToGraph(3,5);
        obj.addEdgesToGraph(3,6);
        obj.addEdgesToGraph(6,7);
        obj.addEdgesToGraph(6,8);
        obj.addEdgesToGraph(6,9);
        obj.addEdgesToGraph(2,9);
        obj.addEdgesToGraph(9,4);
        
        obj.DFSearch(1);
    }   
}

