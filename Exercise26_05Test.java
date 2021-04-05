/*
import java.util.Scanner;
*/
/**
 *
 * @author bobgils
 *//*

public class Exercise26_05Test {

  public static void main(String[] args) {
      new Exercise26_05Test().run();
  }
  
  private void run(){
    AVLTree<Double> tree = new AVLTree<>();
    Scanner input = new Scanner(System.in);
    System.out.print("Enter 15 numbers: ");
    
    for (int i = 0; i < 15; i++) {
      tree.insert(input.nextDouble());
    }

    System.out.print("Enter k: ");
    int k = input.nextInt();
    System.out.println("The " + k + "th smallest number is "
        + tree.find(k));
  }hen search each tree for each element from the sorted array using the method search() from each class.   Each experiment should m

    private class AVLTree<E extends Comparable<E>> extends BST<E> {
      // Copy and complete your code here
        public E find(int k){
            Object i = new Object();
            return (E)i;
        }             
    }
    
  */
/** AVLTreeNode is TreeNode plus height *//*

  protected static class AVLTreeNode<E> extends BST.TreeNode<E> {
    protected int height = 0; // New data field
    protected int size;  // used to store the number of nodes in subtree rooted at this node

    public AVLTreeNode(E o) {
      super(o);
    }
  }

}
*/
