package cz.chodura.algoritmus.linkedlist;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class DoubleLinkedListTest {

   private DoubleLinkedList<String> list = new DoubleLinkedList<String>();

   @Before
   public void fillList() {

      list.add("John");
      list.add("Susan");
      list.add("Titty");
      list.add("Roger");
      list.add("Peggy");
      list.add("Nancy");
   }

   @Test
   public void iterate() {

      // Act
      list.getFirst();
      String value = null;
      String lastName = list.getLast();
      list.getFirst();
      while (!lastName.equals(value)) {
         value = list.next();
      }

      String anotherValue = null;
      String firstName = list.getFirst();
      list.getLast();
      while (!firstName.equals(anotherValue)) {
         anotherValue = list.previous();
      }

      // Assert
      assertEquals(6, list.size());
      assertEquals("Nancy", value);
      assertEquals("John", anotherValue);
   }

   @Test
   public void remove() {

      // Act
      list.remove("Titty");

      // Assert
      assertEquals(5, list.size());
      assertEquals("Roger", list.get());
      assertEquals("Susan", list.previous());
      assertEquals("Roger", list.next());
   }

   @Test
   public void removeLastData() {

      // Act
      list.remove("Nancy");

      // Assert
      assertEquals(5, list.size());
      assertEquals("Peggy", list.getLast());
   }

   @Test
   public void removeUnexistData() {

      // Act
      list.remove("Titty_Titty");

      // Assert
      assertEquals(6, list.size());
   }

}
