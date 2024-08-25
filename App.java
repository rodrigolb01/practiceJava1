public class App {

  public static void main(String[] args) {
    // int[] arr1 = {1,2,3,4,5};
    // NormalList l = new NormalList(arr1);
    // l.print();

    // LinkedList<String> l = new LinkedList<String>();
    // System.out.println("current size: " + l.getSize());
    // l.add("val1");
    // System.out.println("current size: " + l.getSize());
    // System.out.println("first value: " + l.getFirst().getValue());
    // System.out.println("last value: " + l.getLast().getValue());
    // l.add("val2");
    // System.out.println("current size: " + l.getSize());
    // System.out.println("first value: " + l.getFirst().getValue());
    // System.out.println("last value: " + l.getLast().getValue());
    // l.add("val3");
    // System.out.println("current size: " + l.getSize());
    // System.out.println("first value: " + l.getFirst().getValue());
    // System.out.println("middle value: " + l.getFirst().getNext().getValue()); //mid
    // System.out.println("last value: " + l.getLast().getValue());

    // System.out.println("value in position 2 is : " + l.get(2).getValue());

    // l.remove("val2");
    // System.out.println("removed val2");

    // System.out.println("current size: " + l.getSize());
    // for (int i = 0; i < l.getSize(); i++) {
    //   System.out.println(
    //     "value in position " + i + " : " + l.get(i).getValue()
    //   );
    // }

    // l.remove("val3");
    // System.out.println("removed val3");

    // System.out.println("current size: " + l.getSize());
    // for (int i = 0; i < l.getSize(); i++) {
    //   System.out.println(
    //     "value in position " + i + " : " + l.get(i).getValue()
    //   );
    // }

    // l.add("val5");
    // System.out.println("added val5");

    // System.out.println("current size: " + l.getSize());
    // for (int i = 0; i < l.getSize(); i++) {
    //   System.out.println(
    //     "value in position " + i + " : " + l.get(i).getValue()
    //   );
    // }

    // LinkedList<Integer> list2 = new LinkedList<Integer>();
    // System.out.println("current size: " + list2.getSize());
    // list2.add(1);
    // list2.add(2);
    // list2.add(3);
    // System.out.println("current size: " + list2.getSize());
    // for (int i = 0; i < list2.getSize(); i++) {
    //   System.out.println(
    //     "value in position " + i + " : " + list2.get(i).getValue()
    //   );
    // }

    LinkedList<Employee> list3 = new LinkedList<Employee>();
    System.out.println("current size: " + list3.getSize());

    Employee e1 = new Employee("Joe Doe", 33);
    Employee e2 = new Employee("John Doe", 23);
    Employee e3 = new Employee("Poe Doe", 32);

    list3.add(e1);
    list3.add(e2);
    list3.add(e3);
    System.out.println("current size: " + list3.getSize());
    for (int i = 0; i < list3.getSize(); i++) {
      System.out.println(
        "value in position " + i + " : \n" + list3.get(i).getValue()
      );
    }
  }
}
