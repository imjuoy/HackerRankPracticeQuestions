/**
 * The below program creates a dummy adjacency list
 */


import java.util.LinkedList;

public class AdjacencyList {

	static class Graph
	{
		int size;
		LinkedList<Integer> adjacencyListArray[];
		
		Graph(int v)
		{
			this.size = v;
			adjacencyListArray = new LinkedList[v];
			
			for(int i=0;i< v;i++)
			{
				adjacencyListArray[i] = new LinkedList<Integer>();
			}
		}
	}
	
	public static void addEdge(Graph graph, int src, int dest)
	{
	graph.adjacencyListArray[src].addFirst(dest);	
	//Since it is undirected graph
	graph.adjacencyListArray[dest].addFirst(src);
	}
	
	
	public static void printGraph(Graph graph)
	{
		for(int i=0;i< graph.size;i++)
		{
			System.out.println("Below are the edges and vertices of the graph");
			for(Integer pCrawl:graph.adjacencyListArray[i])
				System.out.println("-->"+pCrawl);
			System.out.println("/n");
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int V = 5;
        Graph graph = new Graph(V);
        addEdge(graph, 0, 1);
        addEdge(graph, 0, 4);
        addEdge(graph, 1, 2);
        addEdge(graph, 1, 3);
        addEdge(graph, 1, 4);
        addEdge(graph, 2, 3);
        addEdge(graph, 3, 4);
      
        // print the adjacency list representation of 
        // the above graph
        printGraph(graph);
		
	}

}
