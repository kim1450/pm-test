package week10;

import java.util.*;

public class IteratorEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> v = new ArrayList<Integer>();
		v.add(27);
		v.add(45);
		v.add(54);
		v.add(1,-36);
		Iterator<Integer> it = v.iterator();
		while (it.hasNext()) {
			int n = it.next();
			System.out.println(n);
		}
		
		int sum = 0;
		it = v.iterator(); // 뒤에 아무것도 없어서 // cursor를 초기화하는듯
		while(it.hasNext()) {
			int n =it.next();
			sum += n;
		}
		
		System.out.println("Sum of the elements in the ArrayList : " + sum);
	}

}
