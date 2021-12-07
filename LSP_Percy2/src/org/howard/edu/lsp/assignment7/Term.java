package org.howard.edu.lsp.assignment7;

/**
 * 
 * @author stephaniepercy
 *
 */
public class Term implements Comparable{

	private int exp;
	
	private int cofficient;
	
	Term(int e, int c){
		
		exp = e;
		
		cofficient = c;
	}

	public int getExp() {
		
		return exp;
	}

	public int getCoefficient() {
		
		return cofficient;
	}
	
	@Override
	/**
	 * Changes the coefficient 
	 */
	public String toString() {
		
		if(exp == 0)
			
			return cofficient + "";
		
		else if(exp == 1)
			
			return cofficient + "x";
		else
			return cofficient + "x^" + exp;
		
	}

	@Override
	/**
	 * used to compare the terms 
	 * @return the Term t 
	 */
	public int compareTo(Object t) {
		
		Term t1 = (Term) t;
		
		if(exp!= t1.getExp())
			
		return Integer.compare(exp, t1.getExp());
		
		else
			return 1;
	}
	
}