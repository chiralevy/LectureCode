import java.util.Iterator;

/**
 * The {@code ArrayList} class represents a list that is indexable and can
 * dynamically grow.
 */
public class ArrayList<E> implements Iterable<E>{
	private static final int START_SIZE = 10;

	private E[] data; // underlying array of items
	private int size; // number of items in arraylist

	public ArrayList() {
		data = (E[]) new Object[START_SIZE];
		size = 0;
	}

	public ArrayList(int capacity) {
		data = (E[]) new Object[capacity];
		size = 0;
	}

	public E get(int index) {
		rangeCheck(index);

		return data[index];
	}

	public void set(int index, E item) {
		rangeCheck(index);
		data[index] = item;
	}

	private void rangeCheck(int index) {
		if (index < 0 || index >= size) {
			throw new IndexOutOfBoundsException("Index " + index + " out of bounds");
		}
	}

	public void add(E item) {
		if (size == data.length) {
			resize(2 * data.length);
		}
		data[size] = item;
		size++;
	}

	public int size() {
		return size;
	}

	private void resize(int capacity) {
		E[] temp = (E[]) new Object[capacity];

		for (int i = 0; i < size; i++) {
			temp[i] = data[i];
		}

		data = temp;
	}

	public String toString() {
		String s = "ArrayList: [";

		for (int i = 0; i < size; i++) {
			s += data[i] + ", ";
		}

		return s.substring(0, s.length() - 2) + "]";
	}
	
	@Override
	public Iterator<E> iterator() {
		return new ArrayListIterator();
	}

	private class ArrayListIterator implements Iterator<E> {
		private int count = 0;

		public boolean hasNext() {
			return count < size();
		}

		public E next() {
			return get(count++);
		}

		public void remove() {
			throw new UnsupportedOperationException();
		}

	}

	public static void main(String args[]) {
		ArrayList<String> arrayL = new ArrayList<String>();
		arrayL.add("a");
		arrayL.add("b");
		arrayL.add("c");
		arrayL.add("d");
		arrayL.add("e");
		arrayL.add("f");

		System.out.println("For each loop results: ");
		for(String ar: arrayL) {
			System.out.println(ar);
		}
		
		System.out.println("forEach method results: ");
		arrayL.forEach(System.out::println);
		arrayL.forEach(elt->{System.out.println(elt);});

		System.out.println("forEachRemaining method results: ");
		arrayL.iterator().forEachRemaining(System.out::println);
		arrayL.iterator().forEachRemaining(elt->{System.out.println(elt);});

		
	}


}
