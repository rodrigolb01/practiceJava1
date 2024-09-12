public class BinaryTree<TYPE extends Comparable> {
  private TreeNode<TYPE> root;

  public BinaryTree() {
    this.root = null;
  }

  public void add(TYPE node) {
    TreeNode<TYPE> newNode = new TreeNode<TYPE>(node);

    if (root == null) {
      this.root = newNode;
    } else {
      TreeNode<TYPE> current = this.root;
      while (true) {
        if (newNode.getValue().compareTo(current.getValue()) == -1) {
          // System.out.println(
          //   "new node value: " +
          //   newNode.getValue() +
          //   " is less than current: " +
          //   current.getValue()
          // );

          if (current.getLeft() != null) { //move one position to the next and check again
            current = current.getLeft();
          } else {
            current.setLeft(newNode);
            break;
          }
        } else {
          // System.out.println(
          //   "new node value: " +
          //   newNode.getValue() +
          //   " is higher than current: " +
          //   current.getValue()
          // );

          if (current.getRight() != null) {
            current = current.getRight();
          } else {
            current.setRight(newNode);
            break;
          }
        }
      }
    }
  }

  public TreeNode<TYPE> getRoot() {
    return this.root;
  }

  public void printInOrder(TreeNode<TYPE> current) {
    if (current != null) {
      printInOrder(current.getLeft());
      System.out.println(current.getValue());
      printInOrder(current.getRight());
    }
  }
}
