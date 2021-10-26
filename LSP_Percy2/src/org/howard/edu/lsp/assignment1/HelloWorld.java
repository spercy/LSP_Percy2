public class SetInteger  {
	private List<Integer> set = new ArrayList<Integer>();

	// this will clears the internal representation of the set
public void clear() {…};

// this will return set length
public int length() {…}; // this will return the length

/*
         * this will returns true if the 2 sets are equal; 2 sets are equal, if they contain all of the same values in any order. false otherwise;
 * 
*/
public boolean equals(SetInteger b) {…}; 

// this will return true if the set contains the value, otherwise it will return false
public boolean contains(int value) {…};    

// this will returns the largest item in the set; Throws a SetIntegerException if the set is empty 
public int largest() throws SetIntegerException {…}; 

// this will return the smallest item in the set; Throws a SetIntegerException if the set is empty
public int smallest() throws SetIntegerException;

	// this will add an item to the set; or it will do nothing it already there	
 	public void add(int item) {…}; // adds item to s or does nothing if it is in set

	// This will remove an item from the set 
 	//    or does nothing if not there
public void remove(int item) {…}; 

// set union
public void union(SetInteger intsetx) {…};

// set intersection
public void intersect(SetInteger intsetx) {…}; 

// set difference, i.e., s1 –s2
public void diff(SetInteger intsetx); // set difference, i.e. s1 - s2

// this will return true if the set is empty; if not false otherwise
boolean isEmpty(); 

// this will return String representation of your set
public String toString() {…};	// return String representation of your set
}
