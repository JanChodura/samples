package cz.chodura.algoritmus.linkedlist;

public class LinkedListTraverse<E> extends LinkedListSimple<E> {

   private static final String DELIMITER = ",";

   public void printTraverse() {

      System.out.println("traversed order= " + getTraversedOrder());
   }

   /**
    * Retrieves traversed order <b>only in string</b>. It uses recursion.
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

}
