package cz.chodura.algoritmus.linkedlist;

/**
 * Simple implementation of LinkedList. Only with a very neccesary methods.
 * 
 * @author Jan Chodura
 *
 * @param <E>
 */
public class LinkedListSimple<E> {

   protected Node<E> first;
	protected Node<E> current;
	protected int size = 0;

	public void add(E e) {

		Node<E> newNode = new Node<E>();
		newNode.setData(e);

		if (size == 0) {

			this.first = newNode;
			this.current = this.first;
		} else {

			this.current.setNext(newNode);
			this.current = newNode;
		}

		size++;
	}

	/**
	 * Method goes to begin of LinkedList
	 * 
	 * @return first element of Linked List
	 */
	public E getFirst() {

		this.current = this.first;

		return current.getData();
	}

	/**
	 * Method goes to end of LinkedList
	 * 
	 * @return last element of Linked List
	 */
	public E getLast() {

		while (this.current.getNext() != null) {
			this.current = this.current.getNext();
		}

		return this.current.getData();
	}

	public E get() {

		return this.current.getData();
	}

	public E next() {

		if (this.current.getNext() == null) {
			return null;
		}

		this.current = this.current.getNext();
		return this.current.getData();
	}

	public int size() {

		return size;
	}
}
