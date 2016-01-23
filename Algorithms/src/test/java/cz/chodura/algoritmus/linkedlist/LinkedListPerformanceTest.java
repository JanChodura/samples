package cz.chodura.algoritmus.linkedlist;

import java.util.Arrays;
import java.util.LinkedList;

import org.junit.Test;

public class LinkedListPerformanceTest {

	@Test
	public void simpleLinkedListFirst() {

		System.out.println("\nsimpleLinkedListFirst");
		int size = 1000000;
		long start, finish;

		String[] data = this.manyItems(size);

		LinkedListSimple<String> list = new LinkedListSimple<String>();
		start = System.nanoTime();
		for (int i = 0; i < data.length; i++) {
			list.add(data[i]);
		}
		finish = System.nanoTime();
		this.printDuration("LinkedListSimple Fill",
				new long[] { start, finish });

		LinkedList<String> javaList = new LinkedList<String>();
		start = System.nanoTime();
		javaList.addAll(Arrays.asList(data));
		finish = System.nanoTime();
		this.printDuration("LinkedList Fill", new long[] { start, finish });

	}

	@Test
	public void linkedListFirst() {

		System.out.println("\nlinkedListFirst");
		int size = 1000000;
		long start, finish;

		String[] data = this.manyItems(size);

		LinkedList<String> javaList = new LinkedList<String>();
		start = System.nanoTime();
		javaList.addAll(Arrays.asList(data));
		finish = System.nanoTime();
		this.printDuration("LinkedList Fill", new long[] { start, finish });

		LinkedListSimple<String> list = new LinkedListSimple<String>();
		start = System.nanoTime();
		for (int i = 0; i < data.length; i++) {
			list.add(data[i]);
		}
		finish = System.nanoTime();
		this.printDuration("LinkedListSimple Fill",
				new long[] { start, finish });

	}

	@Test
	public void findLastPerformance() {

		System.out.println("\nfindLastPerformance in ns - too fast");
		int size = 5000;
		long start, finish;

		String[] data = this.manyItems(size);

		LinkedListSimple<String> simpleList = new LinkedListSimple<String>();
		for (int i = 0; i < data.length; i++) {
			simpleList.add(data[i]);
		}
		start = System.nanoTime();
		simpleList.getLast();
		finish = System.nanoTime();
		this.printDurationInNano("LinkedListSimple Get Last", new long[] { start,
				finish });

		LinkedList<String> javaList = new LinkedList<String>();
		javaList.addAll(Arrays.asList(data));
		start = System.nanoTime();
		javaList.getLast();
		finish = System.nanoTime();
		this.printDurationInNano("LinkedList Get Last", new long[] { start, finish });

	}

	private String[] manyItems(int size) {

		String[] names = new String[size];
		for (int i = 0; i < size; i++) {
			names[i] = i + "_John";
		}
		return names;
	}

	/**
	 * Write duration in miliseconds. Something like
	 * "Duration of 'preText': 12 ms."
	 * 
	 * @param preText
	 * @param time
	 *            0 - start, 1- finish
	 */
	private void printDuration(String preText, long[] time) {

		long duration = (time[1] - time[0]) / 1000000;
		System.out.println("Duration of '" + preText + "': " + duration
				+ " ms.");
	}
	
	private void printDurationInNano(String preText, long[] time) {
		
		long duration = (time[1] - time[0]);
		System.out.println("Duration of '" + preText + "': " + duration
				+ " ns.");
	}
}
