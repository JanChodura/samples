package cz.chodura.algoritmus.queue;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class ArrayQueueTest {

   @Test
   public void testEnqueue() throws Exception {

      // Arrange
      ArrayQueue<String> queue = new ArrayQueue<String>(6);

      // Act
      queue.enqueue("John");

      // Assert
      assertEquals("John", queue.front());
   }

   @Test
   public void testDequeue() throws Exception {

      // Arrange
      ArrayQueue<String> queue = new ArrayQueue<String>(6);
      queue.enqueue("John");
      queue.enqueue("Susan");

      // Act
      queue.dequeue();
      String onlyOneName = queue.front();
      queue.dequeue();

      // Assert
      assertEquals("Susan", onlyOneName);
      assertTrue(queue.isEmpty());
   }

   @Test
   public void testRotation() throws Exception {

      // Arrange
      ArrayQueue<String> queue = new ArrayQueue<String>(3);
      queue.enqueue("John");
      queue.enqueue("Susan");
      queue.enqueue("Peggy");

      // Act
      queue.dequeue();
      queue.enqueue("Rogger");

      // Assert
      assertEquals("Susan", queue.front());
      assertTrue(queue.isFull());
   }

}
