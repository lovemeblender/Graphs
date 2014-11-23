import java.util.Collections;
import java.util.List;
import java.util.ArrayList;

class Node {

	private char name;
	private ArrayList<Node> adjacency;
	private String color; // Used in BFS/DFS, "WHITE", "GRAY", "BLACK"
	private int pre, post; // Used in DFS 

	public Node(char name, ArrayList<Node> parents, ArrayList<Node> children) {
		this.name = name;
		pre = post = 0;
		color = "WHITE";
		adjacency = new ArrayList<Node>();
		
		// Put current node to the adjaceny list of all its ancestors
		for(Node n : notNull(parents)) {
			n.adjacency.add(this);
		}

		// Put the successors of current node in its adjacency list
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

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public void setPre(int pre) {
		this.pre = pre;
	}

	public int getPre() {
		return pre;
	}

	public void setPost(int post) {
		this.post = post;
	}

	public int getPost() {
		return post;
	}

	public String printAdjacency() {
		return this.adjacency.toString();
	}

	@Override
	public String toString() {
		return String.valueOf(name);
	}
}