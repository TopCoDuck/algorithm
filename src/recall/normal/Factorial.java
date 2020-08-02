package recall.normal;

//StackOverFlowError
public class Factorial {
	
	public int factorialRec(final int  number) {
	  if(number == 1)
		  return number;
	  else
		  return number * factorialRec(number -1);
	}
	
}
