public class Edge<TYPE> {
  private Double weight;
  private Node<TYPE> start;
  private Node<TYPE> end;

  public Edge(Double _weight, Node<TYPE> _start, Node<TYPE> _end) {
    this.weight = _weight;
    this.start = _start;
    this.end = _end;
  }

  public Node<TYPE> getStart() {
    return start;
  }

  public void setStart(Node<TYPE> start) {
    this.start = start;
  }

  public Node<TYPE> getEnd() {
    return end;
  }

  public void setEnd(Node<TYPE> end) {
    this.end = end;
  }

  public Double getWeight() {
    return weight;
  }

  public void setWeight(Double weight) {
    this.weight = weight;
  }
}
