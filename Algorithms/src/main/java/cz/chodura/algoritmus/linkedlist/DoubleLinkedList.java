package cz.chodura.algoritmus.linkedlist;

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
      }
      else {

         previous = last;
         last = newNode;
         current = newNode;
         previous.setNext(newNode);
         current.setPrevious(previous);
         current.setNext(null);
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
      }
      else {

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
    * Method goes to the end of LinkedList
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

      current = last;

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

   /**
    * Removes node. If there is no Node with data, it returns silently.
    * 
    * @param data
    */
   public void remove(E data) {

      loop(data);
      if (current == null) {
         return;
      }

      boolean isFirstRemoved = current.getPrevious() == null;
      boolean isLastRemoved = current.getNext() == null;
      if (isFirstRemoved) {
         first = current.getNext();
         current = first;
         current.setData(null);
      }
      else if (isLastRemoved) {
         current = current.getPrevious();
         last = current;
         current.setNext(null);
      }
      else {

         DoubleLinkNode<E> previous = current.getPrevious();
         previous.setNext(current.getNext());

         current = current.getNext();
         current.setPrevious(previous);
      }

      size--;
   }

   private void loop(E data) {

      current = first;

      while (current.getData() != data) {

         current = current.getNext();
         if (current == null) {
            return;
         }
      }
   }

   public int size() {

      return size;
   }
}
