package cse360assignment02;
/**
 * An adding machine with various methods
 * @author Frankincense Ramesh
 *
 */

	
public class AddingMachine {
	
  private int total;
  private String str;
  public AddingMachine () {
   total = 0;  // not needed - included for clarity
  }
 /**
  * Returns the current total
  * @return the total 
  */
  public int getTotal () {
   return total;
  }
  /**
   * adds the parameter to the total variable
   * @param value 
   */
  public void add (int value) {
	  total = total + value;
	  str += " + "+value;
	  
  }
/**
 * subtracts the parameter from the total variable
 * @param value
 */
  public void subtract (int value) {
	  total = total - value;
	  str += " - "+value;
  }
/**
 * history of the transactions returned to this method
 */
  public String toString () {
    return str;
  }
  /**
   * clears AddingMachine
   */

  public void clear() {
	  total = 0;
  }
 
}