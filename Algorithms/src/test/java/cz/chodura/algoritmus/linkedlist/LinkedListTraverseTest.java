package cz.chodura.algoritmus.linkedlist;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class LinkedListTraverseTest {

   private LinkedListTraverse<String> list = new LinkedListTraverse<String>();

   @Before
   public void createLinkedList() {

      list.add("John");
      list.add("Susan");
      list.add("Titty");
      list.add("Roger");
      list.add("Peggy");
      list.add("Nancy");
   }

   @Test
   public void testToString() {

      // Act
      String order = list.toString();

      // Assert
      assertEquals("John,Susan,Titty,Roger,Peggy,Nancy", order);
   }

   @Test
   public void testPrintTraverse() {

      // Act
      String traversedOrder = list.getTraversedOrder().toString();

      // Assert
      assertEquals("Nancy,Peggy,Roger,Titty,Susan,John", traversedOrder);
   }

   @Test
   public void testTraverse() {

      // Act
      list.traverse();

      // Assert
      assertEquals("Nancy,Peggy,Roger,Titty,Susan,John", list.toString());
   }
   
   @Test
   public void testTraverseRecursive() {
      
      // Act
      list.traverseRecursive();
      
      // Assert
      assertEquals("Nancy,Peggy,Roger,Titty,Susan,John", list.toString());
   }
}
