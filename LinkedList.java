import java.lang.reflect.Type;

public class LinkedList<TYPE> {
  private Value<TYPE> first;
  private Value<TYPE> last;
  private int size;

  public LinkedList() {
    this.size = 0;
  }

  public void add(TYPE val) {
    Value<TYPE> v = new Value<TYPE>(val);

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
    Value<TYPE> previous = null;
    Value<TYPE> current = this.getFirst();
    for (int i = 0; i < getSize(); i++) {
      if (current.getValue().equals(val)) {
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

  public Value<TYPE> get(int pos) {
    Value current = getFirst();
    for (int i = 0; i < pos; i++) {
      if (current.getNext() != null) {
        current = current.getNext();
      }
    }
    return current;
  }

  public Value<TYPE> getFirst() {
    return first;
  }

  public void setFirst(Value<TYPE> first) {
    this.first = first;
  }

  public Value<TYPE> getLast() {
    return last;
  }

  public void setLast(Value<TYPE> last) {
    this.last = last;
  }

  public int getSize() {
    return size;
  }

  public void setSize(int size) {
    this.size = size;
  }
}
