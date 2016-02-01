package cz.chodura.algoritmus.queue;

import static junit.framework.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;


public class ArrayQueueTest {
    
    @Test
    public void testEnqueue()
            throws Exception {
        
        ArrayQueue<String> queue = new ArrayQueue<String>(6);
        
        queue.enqueue("John");
        
        assertEquals("John", queue.dequeue());
        assertTrue(queue.isEmpty());
    }
    
}
