package cz.chodura.algoritmus.linkedlist;

public class DoubleLinkNode<E> {

   private E data;
   private DoubleLinkNode<E> previous;
   private DoubleLinkNode<E> next;

   public E getData() {

      return data;
   }

   public void setData(E data) {

      this.data = data;
   }

   public DoubleLinkNode<E> getPrevious() {

      return previous;
   }

   public void setPrevious(DoubleLinkNode<E> previous) {

      this.previous = previous;
   }

   public DoubleLinkNode<E> getNext() {

      return next;
   }

   public void setNext(DoubleLinkNode<E> next) {

      this.next = next;
   }

   public String toString() {

      return data.toString();
   }
}
