package JAVAPrograms;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;

public class BFS {
	//Map
	private Map<Integer, List<Integer>> graph;
	//Constructor
	public BFS()
	{
		graph=new HashMap<Integer, List<Integer>>();
	}
	public void addEdge(int u,int v)
	{
		//if graph not contains u add in the new arrayList
		if(!graph.containsKey(u))
		{
			graph.put(u, new ArrayList<Integer>());
		}
		//if graph not contains v add in the new arrayList
		if(!graph.containsKey(v))
		{
			graph.put(v, new ArrayList<Integer>());
		}
		//get u add to the v
		graph.get(u).add(v);
		//get v add to the u
		graph.get(v).add(u);
	}
	public List<Integer> bfs(int start)
	{
		List<Integer> visited=new ArrayList<Integer>();
		Queue<Integer> queue=new LinkedList<Integer>();
		
		visited.add(start);
		queue.offer(start);
		// if queue is empty 
		while(!queue.isEmpty())
		{
			// remove the head queue
			int vertex=queue.poll();
			// using for loop get neighbor vertex 
			for(int neighbor:graph.get(vertex))
			{
				//check whether list contain neighbor vertex
				if(!visited.contains(neighbor))
				{
					// add them to list
					visited.add(neighbor);
					queue.offer(neighbor);
				}
			}
		}
		return visited;
	}
	public static void main(String[] args) {
		BFS  bfs=new BFS();
		
		bfs.addEdge(0, 1);
		bfs.addEdge(0, 2);
		bfs.addEdge(1, 2);
		bfs.addEdge(2, 3);
		bfs.addEdge(3, 3);
		List<Integer> result=bfs.bfs(2);
		System.out.println(result);
	}
}
