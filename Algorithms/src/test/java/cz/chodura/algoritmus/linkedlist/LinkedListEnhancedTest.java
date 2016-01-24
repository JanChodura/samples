package cz.chodura.algoritmus.linkedlist;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * 
 * @author Jan Chodura
 *
 */
public class LinkedListEnhancedTest {

   LinkedListEnhanced<String> list = new LinkedListEnhanced<String>();

   @Before
   public void createLinkedList() {

      list.add("John");
      list.add("Susan");
      list.add("Peggy");
      list.add("Roger");
   }

   @Test
   public void testRemove() {

      // Act
      list.remove("Susan");

      // Assert
      assertEquals(3, list.size());
   }

   @Test
   public void testRemoveFirst() {

      // Act
      list.remove("John");

      // Assert
      assertEquals(3, list.size());
      assertEquals("Susan", list.getFirst());
   }

   @Test
   public void testInsertFirst() {

      // Act
      list.insertFirst("Titty");

      // Assert
      assertEquals(5, list.size());
      assertEquals("Titty", list.getFirst());
   }

   @Test
   public void testInsertSpecific() {

      // Act
      list.insert("Titty", 2);

      String previous = list.previous();
      String next = list.next();
      next = list.next();

      // Assert
      assertEquals(5, list.size());
      assertEquals("John", previous);
      assertEquals("Susan", next);
   }

}
