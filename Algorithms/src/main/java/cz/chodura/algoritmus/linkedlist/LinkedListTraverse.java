package cz.chodura.algoritmus.linkedlist;

public class LinkedListTraverse<E> extends LinkedListSimple<E> {

   private static final String DELIMITER = ",";

   public void printTraverse() {

      System.out.println("traversed order= " + getTraversedOrder());
   }

   /**
    * Retrieves traversed order <b>only in string</b>. It uses recursion. Simpler code could be to
    * reverse toString in StringBuilder.
    * 
    * @return
    */
   public String getTraversedOrder() {

      String traversedOrder = getTraversedOrder(first).toString();

      return traversedOrder;
   }

   private StringBuilder getTraversedOrder(Node<E> node) {

      StringBuilder traversedOrder = new StringBuilder();

      if (node.getNext() != null) {

         traversedOrder = getTraversedOrder(node.getNext());
      }

      if (node.getNext() != null) {
         traversedOrder.append(DELIMITER);
      }

      traversedOrder.append(node.getData());

      return traversedOrder;
   }

   public void traverse() {

      current = first;

      Node<E> previous = null;

      while (current != null) {

         Node<E> nextNode = current.getNext();
         current.setNext(previous);

         previous = current;
         current = nextNode;
      }

      first = previous;

   }

   public void traverseRecursive() {

      traverseRecursive(first);
   }

   /**
    * Traverse from the node to end.
    * 
    * @param node
    */
   private void traverseRecursive(Node<E> node) {

      Node<E> nextNode = node.getNext();
      if (nextNode == null) {
         
         first = node;
         return;
      }

      traverseRecursive(nextNode);
      Node<E> previousNode = nextNode;
      previousNode.setNext(node);
      node.setNext(null);

   }

   public String toString() {

      StringBuilder order = new StringBuilder();

      Node<E> printedNode = first;

      while (printedNode != null) {
         order.append(DELIMITER);
         order.append(printedNode.getData());
         printedNode = printedNode.getNext();
      }

      order.delete(0, 1);

      return order.toString();
   }
}
