package cz.chodura.algoritmus.linkedlist;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

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

      list.remove("Susan");

      assertEquals(3, list.size());
   }

   @Test
   public void testRemoveFirst() {

      list.remove("John");

      assertEquals(3, list.size());
      assertEquals("Susan", list.getFirst());
   }

   @Test
   public void testInsertFirst() {

      list.insertFirst("Titty");

      assertEquals(5, list.size());
      assertEquals("Titty", list.getFirst());
   }
   

   @Test
   public void testInsertSpecific() {

      list.insert("Titty", 2);

      String previous = list.previous();
      String next = list.next();
         next = list.next();
            
      assertEquals(5, list.size());
      assertEquals("John", previous);
      assertEquals("Susan", next);
   }

}