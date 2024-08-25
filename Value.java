public class Value {
    private String value;
    private Value next;

    public Value(String _value)
    {
        this.value = _value;
    }

    public Value getNext() {
        return next;
    }

    public void setNext(Value next) {
        this.next = next;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String values) {
        this.value = values;
    }


}
