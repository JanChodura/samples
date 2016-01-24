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
   public void testPrintTraverse() {

      // Act
      String traversedOrder = list.getTraversedOrder().toString();

      // Assert
      assertEquals("Nancy,Peggy,Roger,Titty,Susan,John", traversedOrder);
   }
}
