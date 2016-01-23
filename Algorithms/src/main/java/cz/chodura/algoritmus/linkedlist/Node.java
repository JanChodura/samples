package cz.chodura.algoritmus.linkedlist;

/**
 * Simplest node with data and reference to next node.
 * 
 * @author Jan Chodura
 *
 */
public class Node<E> {

	private E data;
	private Node<E> next;

	public E getData() {
		return data;
	}

	public void setData(E data) {
		this.data = data;
	}

	public Node<E> getNext() {
		return next;
	}

	public void setNext(Node<E> next) {
		this.next = next;
	}

	public String toString() {

		return data.toString();
	}
}
