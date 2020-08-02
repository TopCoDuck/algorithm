package recall.tailCail;

import static recall.tailCail.TailCalls.call;
import static recall.tailCail.TailCalls.done;

/*
 * ��� �����÷ο� �߻�
 * 
 */
public class Factorial {
	
	public TailCall<Integer> factorialTailRec(final int factorial, final int  number) {
		  if(number == 1)
			  return done(factorial);
		  else
			  return call(()-> factorialTailRec(factorial * number , number -1));
	}
	
}
