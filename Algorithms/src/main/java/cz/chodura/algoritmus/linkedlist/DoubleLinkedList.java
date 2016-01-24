package cz.chodura.algoritmus.linkedlist;

/**
 * Implementation of double linked list.
 * 
 * @author Jan Chodura
 *
 * @param <E>
 */
public class DoubleLinkedList<E> {

   private DoubleLinkNode<E> first;
   private DoubleLinkNode<E> last;
   private DoubleLinkNode<E> current;
   private DoubleLinkNode<E> previous;
   private int size = 0;

   public void add(E e) {

      DoubleLinkNode<E> newNode = new DoubleLinkNode<E>();
      newNode.setData(e);

      if (size == 0) {

         first = newNode;
         last = newNode;
         current = first;
      } else {

         current.setPrevious(last);
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

      insert(data, 1);
   }

   public void insert(E data, int id) {

      current = first;
      for (int i = 0; i < id - 1; i++) {

         previous = current;
         current = current.getNext();
      }

      DoubleLinkNode<E> insertedNode = new DoubleLinkNode<E>();
      insertedNode.setData(data);
      insertedNode.setNext(current);
      insertedNode.setPrevious(previous);

      boolean isHead = id == 1;
      if (isHead) {

         first = insertedNode;
      } else {

         previous.setNext(insertedNode);
         DoubleLinkNode<E> originalNode = current;
         current = insertedNode;
         current.setNext(originalNode);
         originalNode.setPrevious(current);
      }

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

      if (last == null) {
         while (current.getNext() != null) {
            current = current.getNext();
         }

         last = current;
      }

      return last.getData();
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

      if (current.getPrevious() == null) {
         return null;
      }

      current = current.getPrevious();
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
