/**
 * Simple list interface to allow Stacks and Queues to be used interchangeably
 * 
 * @author dave
 *
 * @param <E>
 */
public interface Linear<E> {
	/**
	 * Add the item to the list
	 * 
	 * @param item Data item to add
	 */
	public void add(E item);
	
	/**
	 * Remove and return the next item in the list
	 * 
	 * @return the next item in the list
	 */
	public E remove();
	
	/**
	 * Look at the next item in the list, but don't modify the list
	 * 
	 * @return the next item in the list
	 */
	public E peek();
	
	/**
	 * @return if the data structure has any remaining values or not
	 */
	public boolean empty();
}
