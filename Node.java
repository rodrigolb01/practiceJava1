import java.util.ArrayList;

public class Node<TYPE> {
  private TYPE data;
  private ArrayList<Edge<TYPE>> edgesIn;
  private ArrayList<Edge<TYPE>> edgesOut;

  public Node(TYPE _data) {
    this.data = _data;
    this.edgesIn = new ArrayList<Edge<TYPE>>();
    this.edgesOut = new ArrayList<Edge<TYPE>>();
  }

  public TYPE getData() {
    return data;
  }

  public void setData(TYPE data) {
    this.data = data;
  }

  public void addEdgeIn(Edge<TYPE> newEdge) {
    this.edgesIn.add(newEdge);
  }

  public void addEdgeOut(Edge<TYPE> newEdge) {
    this.edgesOut.add(newEdge);
  }

  public ArrayList<Edge<TYPE>> getEdgesIn() {
    return edgesIn;
  }

  public ArrayList<Edge<TYPE>> getEdgesOut() {
    return edgesOut;
  }
}
