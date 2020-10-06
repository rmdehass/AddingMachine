package cse360assignment02;
/**
 * 
 * @author Ryan
 *
 */
public class AddingMachine {
  private int total;
  private StringBuffer history;
  /**
   * AddingMachine class
   */
  
  public AddingMachine () {
	  /**
	   * Constructor
	   */
    total = 0;  // not needed - included for clarity
    history = new StringBuffer("0");
  }
  
  public int getTotal () {
	  /**
	   * Returns total (sum)
	   */
    return total;
    
  }
  
  public void add (int value) {
	  /**
	   * adds the inputted value to total
	   */
	  total = total + value;
	  history.append(" + " + value);
  }

  public void subtract (int value) {
	  /**
	   * subtracts inputted value from total
	   */
	  total = total - value;
	  history.append(" - " + value);
  }

  public String toString () {
    return history.toString();
    
  }

  public void clear() {
	  /**
	   * Clears the memory, resets total and gives empty string
	   */
	  total = 0;
  }
  
}