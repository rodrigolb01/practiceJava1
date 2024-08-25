public class LinkedList {
  private Value first;
  private Value last;
  private int size;

  public void add(String val) {
    Value v = new Value(val);

    if (this.first == null && this.last == null) {
      this.first = v;
      this.last = v;
    } else {
      this.last.setNext(v);
      this.last = v;
    }
    size++;
  }

  public void remove(String val) {
    Value previous = null;
    Value current = this.getFirst();
    for (int i = 0; i < getSize(); i++) {
      if (current.getValue().equalsIgnoreCase(val)) {
        if (this.getSize() == 1) {
          this.setFirst(null);
          this.setLast(null);
        } else if (current == first) {
          this.first = current.getNext();
          current.setNext(null);
        } else if (current == last) {
          this.last = previous;
          previous.setNext(null);
        } else {
          previous.setNext(current.getNext());
          current = null;
        }
        this.size -= 1;
        break;
      }
      previous = current;
      current = current.getNext();
    }
  }

  public Value get(int pos) {
    Value current = getFirst();
    for (int i = 0; i < pos; i++) {
      if (current.getNext() != null) {
        current = current.getNext();
      }
    }
    return current;
  }

  public Value getFirst() {
    return first;
  }

  public void setFirst(Value first) {
    this.first = first;
  }

  public Value getLast() {
    return last;
  }

  public void setLast(Value last) {
    this.last = last;
  }

  public int getSize() {
    return size;
  }

  public void setSize(int size) {
    this.size = size;
  }
}
