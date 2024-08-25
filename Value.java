public class Value<TYPE> {
  private TYPE value;
  private Value<TYPE> next;

  public Value(TYPE _value) {
    this.value = _value;
  }

  public Value<TYPE> getNext() {
    return next;
  }

  public void setNext(Value<TYPE> next) {
    this.next = next;
  }

  public TYPE getValue() {
    return value;
  }

  public void setValue(TYPE values) {
    this.value = values;
  }
}
