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
    public void removeTest() {
    
        // Arrange
        
        // Act
        list.remove("Titty");
        
        assertEquals(5, list.size());
        assertEquals("Roger", list.get());
        assertEquals("Susan", list.previous());
        assertEquals("Roger", list.next());
    }
    
    
    @Test
    public void removeLastDataTest() {
    
        // Act
        list.remove("Nancy");
        
        assertEquals(5, list.size());
        assertEquals("Peggy", list.getLast());
    }
    
    
    @Test
    public void removeUnexistDataTest() {
    
        // Arrange
        
        // Act
        list.remove("Titty_Titty");
        
        assertEquals(6, list.size());
    }
    
}
