package Collection_Set;

import java.util.*;

public class P2 {

	public static void main(String[] args) {

		LinkedHashSet lhs = new LinkedHashSet();

		lhs.add("A");
		lhs.add("B");
		lhs.add(null);
		lhs.add(3);
		lhs.add(6);
		System.out.println(lhs.add("B"));
		System.out.println(lhs);

	}

}
