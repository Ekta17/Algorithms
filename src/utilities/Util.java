package utilities;

import java.util.Arrays;
import java.util.Collection;
import java.util.Objects;

public class Util {

	public static boolean isEmptyOrNull(Object o) {

		if (Objects.isNull(o))
			return true;
		else if (o instanceof String)
			return o.toString().length() == 0;
		else if (o instanceof Collection)
			return ((Collection) o).size() == 0;
		else
			return Arrays.asList(o).isEmpty();
	}
	
	public static void swapArrayElements(int[] a, int i, int j) {
		int temp = a[i];
		a[i] = a[j];
		a[j] = temp;
	}
}
