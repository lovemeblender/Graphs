import java.util.List;
import java.util.ArrayList;

class TestGraph {

	public static void main(String []args) {
		
		Graph g = new Graph();

		g.add(new Node( 'A', null, null ));
		
		ArrayList<Node> parentsOfB = new ArrayList<Node>();
		parentsOfB.add(g.get('A'));

		g.add(new Node( 'B', parentsOfB, null ));

		ArrayList<Node> parentsOfC = new ArrayList<Node>();
		parentsOfC.add(g.get('A'));

		ArrayList<Node> childrenOfC = new ArrayList<Node>();
		childrenOfC.add(g.get('B'));

		g.add(new Node('C', parentsOfC, childrenOfC ));

		g.printGraph();
	}
}