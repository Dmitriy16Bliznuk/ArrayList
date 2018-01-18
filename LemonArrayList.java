package ArrayList;

public class LemonArrayList<E> {
	private E[] values;

	public LemonArrayList() {
		values = (E[]) new Object();

	}
	public int size() {
		return values.length;
		
	}

}
