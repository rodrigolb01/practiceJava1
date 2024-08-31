import java.util.ArrayList;
import java.util.Scanner;

public class App {

  static int[] heapSort(int[] arr) {
    int n = arr.length;
    for (int i = n / 2 - 1; i >= 0; i--) {
      heap(arr, i, n);
    }
    for (int i = n - 1; i > 0; i--) {
      int temp = arr[i];
      arr[0] = arr[i];
      arr[i] = temp;

      heap(arr, i, 0);
    }
    return arr;
  }

  private static void heap(int[] arr, int i, int n) {
    int root = i;
    int right = (i * 2) + 2;
    int left = (i * 2) + 1;

    if (left < n && arr[left] > arr[root]) {
      root = left;
    }
    if (right < n && arr[right] > arr[root]) {
      root = right;
    }

    if (root != i) {
      int temp = arr[i];
      arr[i] = arr[root];
      arr[root] = temp;
      heap(arr, root, n);
    }
  }

  static int[] selectionSort(int[] arr) {
    int smaller, temp;
    for (int i = 0; i < arr.length; i++) {
      smaller = i;
      for (int j = i + 1; j < arr.length; j++) {
        if (arr[j] < arr[smaller]) {
          smaller = j;
        }
      }
      temp = arr[smaller];
      arr[smaller] = arr[i];
      arr[i] = temp;
    }
    return arr;
  }

  static int[] insertionSort(int[] arr) {
    for (int i = 1; i < arr.length; i++) {
      int temp = i;
      int j = i - 1;
      while (j >= 0 && i - 1 < arr[j]) {
        arr[j + 1] = arr[j];
        j--;
      }
      arr[j + 1] = temp;
    }
    return arr;
  }

  static int[] bubbleSort(int[] arr) {
    for (int i = 0; i < arr.length; i++) {
      for (int j = i + 1; j < arr.length; j++) {
        if (arr[j] < arr[i]) {
          int temp = arr[i];
          arr[i] = arr[j];
          arr[j] = temp;
        }
      }
    }
    return arr;
  }

  static int binarySearch(int target, int[] arr) {
    int start = 0;
    int end = arr.length - 1;
    int mid = 0;
    boolean found = false;

    while (start <= end) {
      mid = (int) ((end + start) / 2);
      if (arr[mid] == target) {
        found = true;
        break;
      } else if (arr[mid] < target) {
        start = mid + 1;
      } else if (arr[mid] > target) {
        end = mid - 1;
      }
    }
    if (found == true) {
      return mid;
    } else {
      return -1;
    }
  }

  public static void main(String[] args) {
    // TESTING SORTING ALGORITHIMS
    int[] arr = new int[10];
    for (int i = 0; i < arr.length; i++) {
      arr[i] = (int) (Math.random() * 10);
    }
    for (int i = 0; i < arr.length; i++) {
      System.out.println(arr[i]);
    }
    // arr = bubbleSort(arr);
    // arr = insertionSort(arr);
    // arr = selectionSort(arr);
    arr = heapSort(arr);
    System.out.println("sorted:");
    for (int i = 0; i < arr.length; i++) {
      System.out.println(arr[i]);
    }
    // // TESTING BINARY SEARCH
    // int[] list = new int[10];
    // for (int i = 0; i < 10; i++) {
    //   list[i] = i * 2;
    // }

    // for (int i = 0; i < list.length; i++) {
    //   System.out.println(list[i]);
    // }

    // Scanner sc = new Scanner(System.in);
    // System.out.println("find number: ");
    // int target = sc.nextInt();
    // int res = binarySearch(target, list);
    // System.out.println("number " + target + " found in position " + res);
    // sc.close();

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

    // // NORMAL LINKED LIST//
    // LinkedList<Integer> list2 = new LinkedList<Integer>();

    // for (int i = 0; i < 10000; i++) {
    //   list2.add(i);
    // }

    // long startTime = System.currentTimeMillis();
    // for (int i = 0; i < list2.getSize(); i++) {
    //   // System.out.println(
    //   //   "value in position " + i + " : " + list2.get(i).getValue()
    //   // );
    //   list2.get(i);
    // }
    // long endTime = System.currentTimeMillis();
    // long elapsedTime = endTime - startTime;
    // System.out.println(
    //   "The elapsed time for acessing linked list was: " +
    //   elapsedTime +
    //   " miliseconds."
    // );

    // // LINKED LIST WITH ITERATOR //

    // LinkedList<Integer> l2Iterate = new LinkedList<Integer>();

    // startTime = System.currentTimeMillis();
    // for (int i = 0; i < 10000; i++) {
    //   l2Iterate.add(i);
    // }

    // LinkedListIterator<Integer> iterator = l2Iterate.getIterator();

    // while (iterator.nextexists()) {
    //   iterator.getNext();
    // }
    // endTime = System.currentTimeMillis();
    // elapsedTime = endTime - startTime;
    // System.out.println(
    //   "The elapsed time for acessing linked list with interation was: " +
    //   elapsedTime +
    //   " miliseconds."
    // );

    // // ARRAY LIST//

    // startTime = System.currentTimeMillis();
    // ArrayList<Integer> al = new ArrayList<Integer>();
    // for (int i = 0; i < 10000; i++) {
    //   al.add(i);
    // }

    // for (int i = 0; i < al.size(); i++) {
    //   al.get(i);
    // }
    // endTime = System.currentTimeMillis();
    // elapsedTime = endTime - startTime;
    // System.out.println(
    //   "The elapsed time for acessing arraylist was: " +
    //   elapsedTime +
    //   " miliseconds."
    // );
    // LinkedList<Employee> list3 = new LinkedList<Employee>();
    // System.out.println("current size: " + list3.getSize());

    // Employee e1 = new Employee("Joe Doe", 33);
    // Employee e2 = new Employee("John Doe", 23);
    // Employee e3 = new Employee("Poe Doe", 32);

    // list3.add(e1);
    // list3.add(e2);
    // list3.add(e3);
    // System.out.println("current size: " + list3.getSize());
    // for (int i = 0; i < list3.getSize(); i++) {
    //   System.out.println(
    //     "value in position " + i + " : \n" + list3.get(i).getValue()
    //   );
    // }

  }
}
