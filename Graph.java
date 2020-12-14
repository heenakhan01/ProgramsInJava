import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;

public class Graph {

	private HashMap<Integer, Node> nodeLookUp = new HashMap<>();
	public static class Node {
		int id;
		LinkedList<Node> adjacent = new LinkedList<>();
		public Node(int id) {
			this.id=id;
		}
	}
	
	private Node getNode(int id) {
		return nodeLookUp.get(id);
	}
	
	public void addNode(int id) {
		Node newNode = new Node(id);
		nodeLookUp.put(id, newNode);
	}
	public void addEdge(int source, int dest) {
		Node s = getNode(source);
		Node d = getNode(dest);
		s.adjacent.add(d);
	}
	public void hasPathDFS(int source, int dest) {
		Node s = getNode(source);
		Node d = getNode(dest);
		HashSet<Integer> visited = new HashSet<Integer>();
		return hasPathDFS(s, d,visited);
	}
	public boolean hasPathDFS(Node source,Node dest,HashSet<Integer> visited) {
		if(visited.contains(source.id)) {
			return false;
		}
		visited.add(source.id);
		if(source==dest) {
			return true;
		}
		for(Node child : source.adjacent) {
			if(hasDFS(child,dest,visited)) {
				return true;
			}
		}
		return false;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	}

}
