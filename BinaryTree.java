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
          if (current.getLeft() != null) { //move one position to the next and check again
            current = current.getLeft();
          } else {
            current.setLeft(newNode);
            break;
          }
        } else {
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

  public boolean remove(TYPE valor) {
    //buscar o elemento na árvore
    TreeNode<TYPE> current = this.root;
    TreeNode<TYPE> currentParent = null;
    while (current != null) {
      if (current.getValue().equals(valor)) {
        break;
      } else if (valor.compareTo(current.getValue()) == -1) { //valor procurado é menor que o atual
        currentParent = current;
        current = current.getLeft();
      } else {
        currentParent = current;
        current = current.getRight();
      }
    }
    //verifica se existe o elemento
    if (current != null) {
      //elemento tem 2 filhos ou elemento tem somente filho à direita
      if (current.getRight() != null) {
        TreeNode<TYPE> replacement = current.getRight();
        TreeNode<TYPE> replacementParent = current;
        while (replacement.getLeft() != null) {
          replacementParent = replacement;
          replacement = replacement.getLeft();
        }
        replacement.setLeft(current.getLeft());
        if (currentParent != null) {
          if (current.getValue().compareTo(currentParent.getValue()) == -1) { //atual < paiAtual
            currentParent.setLeft(replacement);
          } else {
            currentParent.setRight(replacement);
          }
        } else { //se não tem paiAtual, então é a raiz
          this.root = replacement;
          replacementParent.setLeft(null);
          this.root.setRight(replacementParent);
          this.root.setLeft(current.getLeft());
        }

        //removeu o elemento da árvore
        if (
          replacement.getValue().compareTo(replacementParent.getValue()) == -1
        ) { //substituto < paiSubstituto
          replacementParent.setLeft(null);
        } else {
          replacementParent.setRight(null);
        }
      } else if (current.getLeft() != null) { //tem filho só à esquerda
        TreeNode<TYPE> replacement = current.getLeft();
        TreeNode<TYPE> replacementParent = current;
        while (replacement.getRight() != null) {
          replacementParent = replacement;
          replacement = replacement.getRight();
        }
        if (currentParent != null) {
          if (current.getValue().compareTo(currentParent.getValue()) == -1) { //atual < paiAtual
            currentParent.setLeft(replacement);
          } else {
            currentParent.setRight(replacement);
          }
        } else { //se for a raiz
          this.root = replacement;
        }

        //removeu o elemento da árvore
        if (
          replacement.getValue().compareTo(replacementParent.getValue()) == -1
        ) { //substituto < paiSubstituto
          replacementParent.setLeft(null);
        } else {
          replacementParent.setRight(null);
        }
      } else { //não tem filho
        if (currentParent != null) {
          if (current.getValue().compareTo(currentParent.getValue()) == -1) { //atual < paiAtual
            currentParent.setLeft(null);
          } else {
            currentParent.setRight(null);
          }
        } else { //é a raiz
          this.root = null;
        }
      }

      return true;
    } else {
      return false;
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
