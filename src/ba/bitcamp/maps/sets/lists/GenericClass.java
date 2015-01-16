package ba.bitcamp.maps.sets.lists;

public class GenericClass<E> {

	private E[] value;

	/**
	 * @return the value
	 */
	public E[] get() {
		return value;
	}

	/**
	 * @param value
	 *            the value to set
	 */
	public void add(E[] value) {
		this.value = value;
	}

}
