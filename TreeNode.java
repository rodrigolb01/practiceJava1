public class TreeNode<TYPE> {
  private TYPE value;
  private TreeNode<TYPE> right;
  private TreeNode<TYPE> left;

  public TreeNode(TYPE _value) {
    this.value = _value;
    this.right = null;
    this.left = null;
  }

  public TYPE getValue() {
    return value;
  }

  public void setValue(TYPE value) {
    this.value = value;
  }

  public TreeNode<TYPE> getRight() {
    return right;
  }

  public void setRight(TreeNode<TYPE> right) {
    this.right = right;
  }

  public TreeNode<TYPE> getLeft() {
    return left;
  }

  public void setLeft(TreeNode<TYPE> left) {
    this.left = left;
  }
}
