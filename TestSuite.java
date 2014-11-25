import java.util.List;
import java.util.ArrayList;

class TestGraph {

	public static void main(String []args) {
		
		Graph g = new Graph();

		g.add(new Node( 'A', null, null )); // Create vertex A
		
		ArrayList<Node> parentsOfB = new ArrayList<Node>();
		parentsOfB.add(g.get('A')); // A points to B
		g.add(new Node( 'B', parentsOfB, null )); // Create vertex B

		ArrayList<Node> parentsOfC = new ArrayList<Node>();
		parentsOfC.add(g.get('A')); // A points to C
		ArrayList<Node> childrenOfC = new ArrayList<Node>();
		childrenOfC.add(g.get('B')); // C points to B
		g.add(new Node('C', parentsOfC, childrenOfC )); // Create vertex C

		ArrayList<Node> parentsOfD = new ArrayList<Node>();
		parentsOfD.add(g.get('B')); // B points to D
		ArrayList<Node> childrenOfD = new ArrayList<Node>();
		childrenOfD.add(g.get('B')); // D points to B
		g.add(new Node('D', parentsOfD, childrenOfD )); // Create vertex D

		g.printGraph(); // Print adjacency list

		g.DFS(); // Traverse the graph DFS
	}
}
