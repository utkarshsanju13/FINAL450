package sorting;

import java.util.ArrayList;
import java.util.List;

public class Test {

	public static void main(String[] args) {
		
		ArrayList<Integer> l = new ArrayList<>();
		l.add(12);
		l.add(1);
		l.add(5);
		l.add(18);
		l.add(21);
		System.out.println(l);
		int max = l.stream().max((i1, i2)->-(i1.compareTo(i2))).get();
		System.out.println(max);
		
		
	}
}
