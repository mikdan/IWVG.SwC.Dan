package es.upm.miw.spai.ecp2;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class FractionTest {

	private Fraction fraction;

	@Before
	public void before(){
		fraction = new Fraction(2,4);
	}
	
	@Test
	public void testFractionIntInt() {
		assertEquals(2, fraction.getNumerator());
        assertEquals(4, fraction.getDenominator());
	}
	@Test
	public void testGetNumerator() {
		assertEquals(2, fraction.getNumerator());
	}

	@Test
	public void testGetDenominator() {
		assertEquals(4, fraction.getDenominator());
	}
	
	@Test
	public void testDecimal() {
		assertEquals((double)2/4, fraction.decimal(), 10e-3);
	}
	
	@Test
	public void testIsEquivalent() {
	    assertTrue(fraction.isEquivalent(new Fraction(3,6)));
	    assertFalse(fraction.isEquivalent(new Fraction(3,5)));
	}
	
	@Test
    public void testIsPropia() {
        assertEquals(true, fraction.isPropia());
    }  
   
}
