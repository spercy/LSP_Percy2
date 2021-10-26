package org.howard.edu.lsp.assignment5;




import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class IntegerSet {
	
	/**
	 * 
	 * 
	 */
  

   /**
    *  use an array list.
    */
   private List<Integer> set = new ArrayList<Integer>();
  
   /**
    *  Default Constructor
    */
   public IntegerSet() {
   }
   
   /**
    * this will clear the internal representation of the set
    * 
    */
  
   
   public void clear() {
       set.clear();
   }
  
   /**
    *  this will return the length of the set
    * @return
    */
   public int length() {
	   
       return set.size(); // returns the length
   }
  
   /**
    * this returns the element that is present at a particular index in IntegerSet
    * @param index
    * @return
    */
   public int get(int index) {
	   
       return set.get(index);
   }
   /*
   * Returns true if the 2 sets are equal, false otherwise;
   * Two sets are equal if they contain all of the same values in ANY order.
   */
   public boolean equals(IntegerSet b) {
       //return false if lengths of two sets are not equal
       if(b.length() != this.length()) {
    	   
           return false;
       }
      
       /**
        * this will check if all the elements in set b are contained in this set or not
        */
       for(int i = 0; i < b.length();i++) {
    	   
           if(!this.contains(b.get(i))) {
        	   
               return false;
           }
       }
      
       return true;
   }
  
   /**
    *  this will return true if the set contains the value; if not, it will return  false
    * @param value
    * @return
    */
   
   public boolean contains(int value) {
	   
       return set.contains(value);
   }
  
   /**
    *  Returns the largest item in the set; Throws a IntegerSetException if the set is empty
    * @return
    * @throws IntegerSetException
    */
   public int largest() throws IntegerSetException {
	   
       if(this.isEmpty()) {
    	   
           throw new IntegerSetException("Set is empty");
       }
       int largest = this.get(0);
       
       for(int i = 1; i < this.length(); i++) {
    	   
           if(this.get(i) > largest) {
        	   
               largest = this.get(i);
           }
       }
       return largest;
   }
   /**
    *  Returns the smallest item in the set; Throws a IntegerSetException if the set is empty
    * @return
    * @throws IntegerSetException
    */
   
   public int smallest() throws IntegerSetException{
	   
       if(this.isEmpty()) {
    	   
           throw new IntegerSetException("Set is empty");
       }
       int smallest = this.get(0);
       
       for(int i = 1; i < this.length(); i++) {
    	   
           if(this.get(i) < smallest) {
        	   
               smallest = this.get(i);
           }
       }
       return smallest;
   }
  
   /**
    *  this will add an item to the set or it will do nothing if it is already there
    * @param item
    */
   
  public void add(int item) {
       /**
        *  adds item to s or does nothing if it is in set
        */
      if(!this.contains(item)) {
    	   
           set.add(item);
       }
   }
  
   /**
    * Removes an item from the set or does nothing if not there
    * @param item
    * @throws IntegerSetException
    */
   
   
  public void remove(int item) throws IntegerSetException{
	   
       if(this.isEmpty()) {
    	   
           throw new IntegerSetException("Set is empty");
       }
       //iterate over the set elements and remove the element if equals to item
       for(int i = 0; i < this.length(); i++) {
    	   
           if(this.get(i) == item) {
        	   
               set.remove(i);
               
               break;
           }
       }
   }
  
   /**
    *  Set union
    * @param intSetb
    */
   public void union(IntegerSet intSetb) {
	   
       //add all the elements from intSetb to this set
	   
       for(int i = 0; i < intSetb.length(); i++) {
    	   
           this.add(intSetb.get(i));
       }
   }
   /**
    * Set intersection
    * @param intSetb
    */
   
   public void intersect(IntegerSet intSetb) {
	   
       /**
        * this will iterate over all the elements of this set; it remove them if it is not present in intSetb
        */
	   
      Iterator<Integer> i = set.iterator();
       
       while(i.hasNext()) {
    	   
           if(!intSetb.contains(i.next())){
        	   
               i.remove();
           }
       }
   }
   /**
    * Set difference, i.e., s1 –s2
    * @param intSetb
    */
   
  public void diff(IntegerSet intSetb) {
       // set difference, i.e. s1 - s2
	   
       //this will iterate over all the elements of this set 
	   
	   // it will remove them if it is not present in intSetb
       Iterator<Integer> i = set.iterator();
       
       while(i.hasNext()) {
    	   
           if(intSetb.contains(i.next())){
        	   
               i.remove();
           }
       }
   }
  
   /**
    * this will return true if the set is empty; if not false otherwise
    * @return
    */
  boolean isEmpty() {
	   
       return set.isEmpty();
   }
  
   /**
    *  this will return String representation of your set
    */
   public String toString() {
	   
       /**
        *  this will return String representation of your set
        */
       if(this.isEmpty()) {
    	   
           return "[]";
       }
      
       String str = "[" + set.get(0);
       
       for(int i = 1; i< this.length(); i++) {
    	   
           str = str + "," + this.get(i);
       }
       str = str + "]";
       
       return str;
   }
}