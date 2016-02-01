package cz.chodura.algoritmus.queue;

public class ArrayQueue<E> {

   private static int DEFAULT_CAPACITY = 10;

   private E[] queue;

   private int rear;

   private int front;

   private int N;

   public ArrayQueue() {

      this(DEFAULT_CAPACITY);
   }

   public ArrayQueue(int capacity) {

      queue = (E[]) new Object[capacity];
      rear = front = -1;
      N = capacity;
   }

   /**
    * 
    * @author Jan Chodura
    * @created 1. 2. 2016
    *
    * @param object if is Queue full nothing is filled.
    */
   public void enqueue(E object) {

      if (isFull()) {
         return;
      }

      if (isEmpty()) {

         front++;
      }
      rear = (rear + 1) % N;

      queue[rear] = object;

   }

   public void dequeue() {

      if (isEmpty()) {
         return;
      }

      if (front == rear) {
         front = rear = -1;
      }
      else {
         front = (front + 1) % N;
      }
   }

   public E front() {

      return queue[front];
   }

   public boolean isEmpty() {

      return rear == -1 && front == -1;
   }

   public boolean isFull() {

      return front == (rear + 1) % N;
   }
}
