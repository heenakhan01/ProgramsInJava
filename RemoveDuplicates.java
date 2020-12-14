import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class RemoveDuplicates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(1);
		list.add(1);
		list.add(3);

		Iterator<Integer> it = list.iterator();
		List<Integer> temp = new ArrayList<Integer>();
		while (it.hasNext()) {
			int i = it.next();
			if (temp.contains(i)) {
				// System.out.println("yes");
				it.remove();
			} else {
				temp.add(i);
			}
		}

		System.out.println(temp);

	}
}
