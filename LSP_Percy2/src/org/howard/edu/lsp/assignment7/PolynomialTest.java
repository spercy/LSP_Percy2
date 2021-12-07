package org.howard.edu.lsp.assignment7;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

/**
 * 
 * @author stephaniepercy
 *
 *
 * Unit tests the polynomial 
 */

class PolynomialTest {

	@Test
	void testInsert() {
		Polynomial p = new Polynomial();
		p.insert(2, 0);
		p.insert(6, 5);
		p.insert(-4, 2);
		p.insert(3, 1);
		p.insert(7,2);
		System.out.println(p.toString());
		assertEquals("2 +3x -4x^2 +7x^2 +6x^5 ", p.toString());
	}
	@Test
	void testRemove() {
		Polynomial p = new Polynomial();
		p.insert(2, 0);
		p.insert(6, 5);
		p.insert(-4, 2);
		p.insert(3, 1);
		p.insert(7,2);
		p.delete(6, 5);
		System.out.println(p.toString());
		assertEquals("2 +3x -4x^2 +7x^2 ", p.toString());

	}
	
	@Test
	void testReverse() {
		Polynomial p = new Polynomial();
		p.insert(2, 0);
		p.insert(6, 5);
		p.insert(-4, 2);
		p.insert(3, 1);
		p.insert(7,2);
		String reversed = p.reverse();
		System.out.println(reversed);
		assertEquals("6x^5 +7x^2 -4x^2 +3x +2 ", reversed);
	}

	@Test
	void testProduct() {
		Polynomial p = new Polynomial();
		p.insert(2, 0);
		p.insert(-4, 2);
		p.insert(3, 1);
		int product = p.product();
		System.out.println(product);
		assertEquals(-24,product);
		
	}
}