package cse360assignment02;

public class AddingMachine {
  private int total;
  private String history;
  
  public AddingMachine () {
    total = 0;  // not needed - included for clarity
  }
  //returns total
  public int getTotal () {
	  
    return total;
  }
  //adds value to total
  public void add (int value) {
	  total +=value;
	  addString("+", value);
  }
//subtracts value from total
  public void subtract (int value) {
	  total -=value;
	  addString("-", value);
  }
  public String addString(String op, int val)
  {
	  String intString=Integer.toString(val);
	  history +=intString+" "+op+" ";
  }
//returns history of transactions
  public String toString () {
    return history;
  }
//clears toString
  public void clear() {
	  history="";
  }
}