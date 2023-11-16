package week10;

import java.util.*;

public class ListIteratorEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);
		
		ListIterator<Integer> it =list.listIterator();
		while (it.hasNext()) {
			System.out.print(it.next());
		}
		System.out.println();
		
		while (it.hasPrevious()) {
			System.out.print(it.previous());
		}
		System.out.println();
		
		ListIterator<Integer> itRandom = list.listIterator(2);
		while(itRandom.hasNext()) {
			System.out.print(itRandom.next());
		}
		System.out.println();
		
		itRandom.set(7);
		itRandom = list.listIterator(2);
		while(itRandom.hasNext()) {
			System.out.print(itRandom.next());
		}
		System.out.println();
	}

}
