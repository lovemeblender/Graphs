import java.util.Set;
import java.util.HashSet;

class Graph {


	Set<Node> nodes = new HashSet<Node>();

	public Graph() {

	}

	public void add(Node n) {
		nodes.add(n);
	}

	public Node get(char name) {
		for(Node n:nodes) {
			if(n.getName() == name) {
				return n;
			}
		}
		return null;	
	}

	public void printGraph() {
		for(Node n : nodes) {
			System.out.println(n.getName()+": "+ n.printAdjacency());
		}
	}
}