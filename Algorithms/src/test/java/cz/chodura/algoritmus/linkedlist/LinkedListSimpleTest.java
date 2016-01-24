package cz.chodura.algoritmus.linkedlist;

import org.junit.Test;

import static org.junit.Assert.*;

public class LinkedListSimpleTest {

   @Test
   public void canAdd() {
      
      // Act
      LinkedListSimple<String> list = new LinkedListSimple<String>();
      list.add("John");
      list.add("Suzan");
      list.add("Peggy");

      // Assert
      assertEquals(3, list.size());
      assertEquals("John", list.getFirst());
      assertEquals("John", list.get());
      assertEquals("Suzan", list.next());
      assertEquals("Peggy", list.getLast());

   }
}