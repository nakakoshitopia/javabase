package sample2;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		List<Hero> list1 = new ArrayList<>();
		list1.add(new Hero("みなと", 150));
		list1.add(new Hero("あさか", 200));

		for (Hero aaa : list1) {
			System.out.println(aaa);
		}

		System.out.println("toStringがうまくいきました！");

	}

}
