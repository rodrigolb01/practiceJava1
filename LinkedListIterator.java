public class LinkedListIterator<TYPE> {
  private Value<TYPE> value;

  public LinkedListIterator(Value<TYPE> _value) {
    this.value = _value;
  }

  public boolean nextexists() {
    if (value.getNext() == null) {
      return false;
    } else {
      return true;
    }
  }

  public Value<TYPE> getNext() {
    value = value.getNext();
    return value;
  }
}
