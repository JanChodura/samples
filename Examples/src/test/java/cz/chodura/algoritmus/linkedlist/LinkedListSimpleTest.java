package cz.chodura.algoritmus.linkedlist;


import org.junit.Test;

import static org.junit.Assert.*;

public class LinkedListSimpleTest {

	@Test
	public void canAdd() {
		
		LinkedListSimple<String> list = new LinkedListSimple<String>();
		list.add("John");
		list.add("Suzan");
		list.add("Peggy");
		
		assertEquals(3, list.size());
		assertEquals(list.getFirst(), "John");
		assertEquals(list.get(), "John");
		assertEquals(list.next(), "Suzan");
		assertEquals(list.getLast(), "Peggy");
		
	}
}
