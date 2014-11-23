import java.util.Set;
import java.util.HashSet;

	/*
	* Directed, unweighted graph implementation
	* Uses adjacency list
	*/

class Graph {

	private Set<Node> nodes; // Stores all vertices in graph (each vertex has an adjacency list)
	private int time; // Used by DFS

	public Graph() {
		nodes = new HashSet<Node>();	
	}

	public void add(Node n) {
		nodes.add(n);
	}

	public Node get(char name) {
		for(Node n : nodes) {
			if(n.getName() == name) {
				return n;
			}
		}
		return null;	
	}

	public void printGraph() {
		for(Node n : nodes) {
			System.out.println(n.getName() + ": " + n.printAdjacency());
		}
	}

	public void DFS() {
		time = 0; // Set time to 0
		
		// For every vertex in Graph
		for(Node u : nodes) {
			if(u.getColor().equals("WHITE")) { // if vertex hasn't been visited
				visit(u);
			}
		}

		// Print timed vertices
		for(Node n : nodes) {
			System.out.println( n.getName()+" Pre: " + n.getPre() + " Post: " + n.getPost());
		}

	}

	public void visit(Node u) {
		u.setPre(++time); // Set u's pre time
		u.setColor("GRAY");

		// For every vertex in u's adjacency list
		for(Node v : u.getAdjacency()) {
			if(v.getColor().equals("WHITE")) { 
				visit(v);	
			}
		}

		u.setColor("BLACK");
		u.setPost(++time);
	}

}