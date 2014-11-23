import java.util.Collections;
import java.util.List;
import java.util.ArrayList;

class Node {

	private char name;
	private ArrayList<Node> adjacency;

	public Node(char name, ArrayList<Node> parents, ArrayList<Node> children) {
		this.name = name;
		adjacency = new ArrayList<Node>();
		
		// put current node to the adjaceny list of all its ancestors
		for(Node n : notNull(parents)) {
			n.adjacency.add(this);
		}

		// put the successors of current node in its adjacency list
		for(Node n : notNull(children)) {
			adjacency.add(n);
		}
	}

	public List<Node> notNull(ArrayList<Node> list) {
		if(list == null) {
			return Collections.EMPTY_LIST;
		}
		else {
			return list;
		}
	}

	public List<Node> getAdjacency() {
		return notNull(adjacency);
	}

	public char getName() {
		return name;
	}

	public String printAdjacency() {
		return this.adjacency.toString();
	}

	@Override
	public String toString() {
		return String.valueOf(name);
	}

}