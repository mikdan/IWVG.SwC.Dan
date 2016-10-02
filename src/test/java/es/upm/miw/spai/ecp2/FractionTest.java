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

	/*
    @Test
    public void testIsPropia() {
        assertEquals(true,fraction.isPropia());
        fraction = new Fraction(2,2);
        assertEquals(false,fraction.isPropia());
        fraction = new Fraction(3,2);
        assertEquals(false,fraction.isPropia());        
    }
    
    @Test
    public void testSubtraction() {
        fraction = new Fraction(5,2);
        Fraction resta = fraction.subtraction(1, 2);
        assertEquals(8, resta.getNumerator());
        assertEquals(4, resta.getDenominator());     
    }
    */
}
