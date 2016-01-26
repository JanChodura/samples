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

    /**
     * Test of iterating forward and backward.
     */
    @Test
    public void iterateTest() {

       // Act
       list.getFirst();
       String value = null;
       while (!list.getLast().equals(value)) {
          value = list.next();
       }

       String anotherValue = null;
       while (!list.getFirst().equals(anotherValue)) {
          anotherValue = list.previous();
       }

       // Assert
       assertEquals(6, list.size());
       assertEquals("Nancy", value);
       assertEquals("John", anotherValue);
    }

}
