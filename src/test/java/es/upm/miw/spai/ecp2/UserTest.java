package es.upm.miw.spai.ecp2;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class UserTest {

private User user;
	
	@Before
	public void before(){
		user = new User(1, "Ana", "Lopez");
	}
	@Test
	public void testUser(){
		assertEquals(1, user.getNumber());
        assertEquals("Ana", user.getName());
        assertEquals("Lopez", user.getFamilyName());
		 
	}	
	
	@Test
	public void testGetNumber() {
		assertEquals("Ana", user.getName());
	}
	
	@Test
	public void testGetName(){
		assertEquals("Ana", user.getName());
	}
	
	@Test
	public void testGetFamilyName(){
		assertEquals("Lopez", user.getFamilyName());
	}
	
	@Test
	public void testFullName() {
		assertEquals("Ana Lopez", user.fullName());
	}

	@Test
	public void testInitials() {
		assertEquals("A.", user.initials());
	}
	
	@Test
	public void testFullNameUppercase() {
        assertEquals("ANA LOPEZ", user.fullNameUppercase());
	}
}
