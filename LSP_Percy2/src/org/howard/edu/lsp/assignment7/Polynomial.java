package org.howard.edu.lsp.assignment7;

import java.io.BufferedReader;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Iterator;
import java.util.TreeSet;



/** TODO: Javadoc comment here about Polynomial class
 * 
 */


public class Polynomial {
	
	/**
	 * This is the Polynomial class 
	 * @param args
	 * @return degree of the Polynomial
	 */

	private TreeSet<Term> terms = new TreeSet<Term>();
	
	public void insert(int c, int e) {
		
		Term t = new Term(e,c);
		
		terms.add(t);
		
	/**
	 * @param c: the user will input an int coefficient value
	 * @param e: the user will input an int exponent value
	 * This method will use both values to make a new term
	 */
	}
	
	public void delete(int c, int e) {
		/**
		 * @param c: the user will input an int coefficient value
		 * @param e: the user will input an int exponent value
		 * @param t: Constructs a new polynomial with the given term
		 * @param t: the term to initialize the polynomial with
		 * This will work to loop over the coefficient using a TreeSet and if and else statements
		 */
	
		
		Iterator i = terms.iterator();
		
		TreeSet<Term> termsNew = new TreeSet<Term>();
		
		boolean isDeleted = false;
		
		while(i.hasNext()) {
			
			Term t = (Term) i.next();
			
			if(t.getCoefficient() == c && t.getExp() == e) {
				
				terms.remove(t);
				
				isDeleted = true;
				
			}else {
				
				termsNew.add(t);
			}
		}
		if(!isDeleted) {
			
			System.out.println(" The term is not in the polynomial ");
			
		}else {
			
			terms = termsNew;
		}
	}
	
	public String reverse() {
		/** 
		 * @param args
		 * Will reverse the order of the terms in the polynomial
		 * Will add the polynomial with the terms in sorted order from highest power to lowest
		 * @param p: the polynomial to add
		 * 
		 */
		
		TreeSet<Term> termsReverse = (TreeSet<Term>) terms.descendingSet();
		
		Polynomial p = new Polynomial();
		
		p.terms = termsReverse;
		
		return p.toString();
	}
	
	/**

	* Multiplies the given polynomial with this one and returns the result

	@param p the polynomial to multiply

	@return this * p

	*/
	
	public int product() {
		/**
		 * Works to get the product of the polynomial 
		 * @return will return the product of the polynomial
		 */
		
		int product=1;
		
		for(Term t : terms){
			
			product = product * t.getCoefficient();
			
		}
		return product;
	}
	
	@Override
	/**
	 * Turn polynomial to a string
	 * @return string
	 */
	public String toString() {
		
		String res = " ";
		
		Iterator i = terms.iterator();
		
		while(i.hasNext()) {
			
			Term t = (Term) i.next();
			
			if(t.getCoefficient()<0) {
				
				res += t.toString()+ " ";
				
			}else {
				
				res += "+"+t.toString()+ " ";
				
			}
		}
		return res.substring(1,res.length());
	}
	
	/**
	 * 
	 * @param args
	 * @throws IOException
	 * This method will take in the text file with the variable FileReader
	 * Filereader will then 
	 */
	
	public static void main(String[] args) throws IOException {
		
		FileReader f = new FileReader("polynomials.txt");
		
		BufferedReader br = new BufferedReader(f);
		
		String line = " ";
		
		while((line = br.readLine())!= null) {
			
			String[] poly = line.split(";");
			
			Polynomial p = new Polynomial();
			
			for(int i = 1; i<poly.length;i = i + 2) {
				
				p.insert(i, i + 1);
			}
				System.out.println(p.toString());
		}
		br.close();
		
		f.close();
	}
	
}