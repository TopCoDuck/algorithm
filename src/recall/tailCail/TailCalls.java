package recall.tailCail;

public class TailCalls {
	
	public static <T> TailCall<T> call(final TailCall<T> nextCall){
		return nextCall;
	}
	
	public static <T> TailCall<T> done(final T value){
		return new TailCall<T>() {
			public boolean isComplete() { return true;}
			public T result() {	return value;}
			public TailCall<T> apply() {
				throw new Error("not implemnted");
			}
		};
	}
	
}
