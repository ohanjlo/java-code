import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class Day20 {
	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<>();
		list.add(1);
		list.add(2);
		list.add(1);
		Set<Integer> set = new HashSet<>();
		set.add(1);
		set.add(2);
		set.add(1);
		System.out.println(list.size() + "," + set.size());
	}
}