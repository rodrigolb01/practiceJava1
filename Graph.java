import java.util.ArrayList;

public class Graph<TYPE> {
  private ArrayList<Node<TYPE>> nodes;
  private ArrayList<Edge<TYPE>> edges;

  public Graph() {
    this.nodes = new ArrayList<Node<TYPE>>();
    this.edges = new ArrayList<Edge<TYPE>>();
  }

  public void addNode(TYPE data) {
    this.nodes.add(new Node<TYPE>(data));
  }

  public void addEdge(double weight, TYPE startValue, TYPE endValue) {
    Node<TYPE> startEdge = getNode(startValue);
    Node<TYPE> endEdge = getNode(endValue);
    Edge<TYPE> newEdge = new Edge<TYPE>(weight, startEdge, endEdge);
    startEdge.addEdgeOut(newEdge);
    endEdge.addEdgeIn(newEdge);
    this.edges.add(newEdge);
  }

  public Node<TYPE> getNode(TYPE target) {
    Node<TYPE> res = null;
    for (int i = 0; i < this.nodes.size(); i++) {
      if (nodes.get(i).getData().equals(target)) {
        res = nodes.get(i);
        break;
      }
    }
    return res;
  }

  //busca em largura
  public void breadthFirstSearch() {
    ArrayList<Node<TYPE>> marked = new ArrayList<Node<TYPE>>();
    ArrayList<Node<TYPE>> queue = new ArrayList<Node<TYPE>>();
    Node<TYPE> current = this.nodes.get(0);
    System.out.print("[");
    System.out.print(current.getData() + ", ");
    queue.add(current);
    while (queue.size() > 0) {
      Node<TYPE> visited = queue.get(0);
      for (int i = 0; i < visited.getEdgesOut().size(); i++) {
        Node<TYPE> next = visited.getEdgesOut().get(i).getEnd();
        if (!marked.contains(next)) { //se o vertice ainda nao foi marcado
          marked.add(next);
          System.out.print(next.getData() + ", ");
          queue.add(next);
        }
      }
      queue.remove(0);
    }
    System.out.print("]");
  }
}
