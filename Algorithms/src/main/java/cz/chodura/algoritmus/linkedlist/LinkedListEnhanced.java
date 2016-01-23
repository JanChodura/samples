package cz.chodura.algoritmus.linkedlist;

/**
 * Simpler implementation of LinkedList but enhanced to {@link LinkedListSimple} .
 * 
 * @author Jan Chodura
 *
 * @param <E>
 */
public class LinkedListEnhanced<E> {

   private Node<E> first;
   private Node<E> last;
   private Node<E> current;
   private Node<E> previous;
   private int size = 0;

   public void add(E e) {

      Node<E> newNode = new Node<E>();
      newNode.setData(e);

      if (size == 0) {

         first = newNode;
         last = newNode;
         current = first;
      } else {

         last = newNode;
         current.setNext(newNode);
         current = newNode;
      }

      size++;
   }

   public void insertFirst(E data) {

      if (size == 0) {
         add(data);
         return;
      }

      Node<E> previousFirst = first;

      Node<E> newHead = new Node<E>();
      newHead.setData(data);
      newHead.setNext(previousFirst);

      first = newHead;
      size++;
   }

   public void insert(E data, int id) {

      current = first;
      for (int i = 0; i < id - 1; i++) {

         current = current.getNext();
      }

      Node<E> nextNode = current.getNext();
      Node<E> insertedNode = new Node<E>();
      insertedNode.setData(data);
      insertedNode.setNext(nextNode);

      current.setNext(insertedNode);
      if (id == 2) {
         first = current;
      }

      next();

      size++;
   }

   /**
    * Method goes to begin of LinkedList
    * 
    * @return first element of Linked List
    */
   public E getFirst() {

      current = first;

      return current.getData();
   }

   /**
    * Method goes to end of LinkedList
    * 
    * @return last element of Linked List
    */
   public E getLast() {

      while (current.getNext() != null) {
         current = current.getNext();
      }

      return current.getData();
   }

   public E get() {

      return current.getData();
   }

   public E next() {

      if (current.getNext() == null) {
         return null;
      }

      previous = current;
      current = current.getNext();

      return current.getData();
   }

   public E previous() {

      if (current.getNext() == null) {
         return null;
      }

      current = previous;
      return current.getData();
   }

   public void remove(E data) {

      current = first;

      while (current.getData() != data) {
         previous = current;
         current = current.getNext();
      }

      boolean isHead = previous == null;
      if (isHead) {
         first = current.getNext();
         current = first;
      } else {
         previous.setNext(current.getNext());
      }

      size--;
   }

   public int size() {

      return size;
   }
}
