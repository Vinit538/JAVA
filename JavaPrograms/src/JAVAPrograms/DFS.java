package JAVAPrograms;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Stack;

//Depth first Search
public class DFS {
	private Map<Integer,List<Integer>> graph;
	
	//Constructor 
	public DFS()
	{
		graph=new HashMap<Integer,List<Integer>>();
	}
	//Method to add the Edge
	public void addEdge(int u,int v)
	{
		if(!graph.containsKey(u))
		{
			graph.put(u,new ArrayList<Integer>());
		}
		if(!graph.containsKey(v))
		{
			graph.put(v, new ArrayList<Integer>());
		}
		graph.get(u).add(v);
		graph.get(v).add(u);
	}
	
	public List<Integer> dfs(int start)
	{
		List<Integer> visited=new ArrayList<Integer>();
		Stack<Integer> stack=new Stack<Integer>();
		
		stack.push(start);
		//Check the stack is empty or not 
		while(!stack.isEmpty())
		{
			// pop the top of stack and give to vertex
			int vertex=stack.pop();
			//check whether the visited list contain vertex or not
			if(!visited.contains(vertex))
			{
				// add vertex to visited list 
				visited.add(vertex);
				// add neighbor vertex to the stack
				for(int neighbor:graph.get(vertex))
				{
					stack.push(neighbor);
				}
			}
		}
		//return the visited list
		return visited;
	}
	
	public static void main(String []args)
	{
		DFS dfs=new DFS();
		
		dfs.addEdge(0, 1);
		dfs.addEdge(0, 2);
		dfs.addEdge(1, 2);
		dfs.addEdge(2, 3);
		dfs.addEdge(3, 3);
		
		List<Integer> result=dfs.dfs(2);
		System.out.println(result);
	}
}
