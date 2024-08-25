public class App {

  public static void main(String[] args) {
    // int[] arr1 = {1,2,3,4,5};
    // NormalList l = new NormalList(arr1);
    // l.print();

    LinkedList l = new LinkedList();
    System.out.println("current size: " + l.getSize());
    l.add("val1");
    System.out.println("current size: " + l.getSize());
    System.out.println("first value: " + l.getFirst().getValue());
    System.out.println("last value: " + l.getLast().getValue());
    l.add("val2");
    System.out.println("current size: " + l.getSize());
    System.out.println("first value: " + l.getFirst().getValue());
    System.out.println("last value: " + l.getLast().getValue());
    l.add("val3");
    System.out.println("current size: " + l.getSize());
    System.out.println("first value: " + l.getFirst().getValue());
    System.out.println("middle value: " + l.getFirst().getNext().getValue()); //mid
    System.out.println("last value: " + l.getLast().getValue());

    System.out.println("value in position 2 is : " + l.get(2).getValue());

    l.remove("val2");
    System.out.println("removed val2");

    System.out.println("current size: " + l.getSize());
    for (int i = 0; i < l.getSize(); i++) {
      System.out.println(
        "value in position " + i + " : " + l.get(i).getValue()
      );
    }

    l.remove("val3");
    System.out.println("removed val3");

    System.out.println("current size: " + l.getSize());
    for (int i = 0; i < l.getSize(); i++) {
      System.out.println(
        "value in position " + i + " : " + l.get(i).getValue()
      );
    }

    l.add("val5");
    System.out.println("added val5");

    System.out.println("current size: " + l.getSize());
    for (int i = 0; i < l.getSize(); i++) {
      System.out.println(
        "value in position " + i + " : " + l.get(i).getValue()
      );
    }
  }
}
