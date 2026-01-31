package com.example.junit_demo;
// it import assertions 
import static org.junit.jupiter.api.Assertions.*;
import java.util.*;
// it imports anotaions
import org.junit.jupiter.api.*;

public class ListManagerTest {
	ListManager manager;
	List<Integer> list;
	
	@BeforeEach
	void createObject() {
		manager=new ListManager();
		list=new ArrayList();
	}
	
	@Test
	public void testAddElement() {
		manager.addElement(list, 10);
        manager.addElement(list, 20);
		
		assertEquals(2,manager.getSize(list));
		assertTrue(list.contains(10));
		assertTrue(list.contains(20));
		
	}
	
	@Test
	void testRemoveElement() {
        manager.addElement(list, 10);
        manager.addElement(list, 20);

        manager.removeElement(list, 20);

        assertEquals(1, manager.getSize(list));
        assertFalse(list.contains(20));
    }

	
	@Test
	public void testGetSize() {
		manager.addElement(list, 10);
        manager.addElement(list, 20);
		
		
		assertEquals(2,manager.getSize(list));
		
	}
	
	@Test
	public void testException() {
		assertThrows(IllegalArgumentException.class,()->manager.addElement(null, 2));
		assertThrows(IllegalArgumentException.class,()->manager.removeElement(null, 1));
		assertThrows(IllegalArgumentException.class,()->manager.getSize(null));
	}
	
	

}
