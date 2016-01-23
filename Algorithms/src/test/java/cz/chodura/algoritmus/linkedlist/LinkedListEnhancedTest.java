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
   public void testInsertHead() {

      list.insertFirst("Titty");

      assertEquals(5, list.size());
      assertEquals("Titty", list.getFirst());
   }

   @Test
   public void testInsertSpecific() {

      list.insert("Titty", 2);

      assertEquals(5, list.size());
      assertEquals("Susan", list.previous());
      assertEquals("Titty", list.next());
   }

}