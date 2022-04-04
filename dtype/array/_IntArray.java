package dtype.array;

import java.util.*;
import java.util.stream.Collectors;
import dtype.Logger;

public class _IntArray {

	public static void main(String[] args) {
		Logger log = new Logger();

		log.debug(String.format("Run '%s'...", "_IntArray.java"));

		int[] array = new int[10];
		array[0] = 0;
		array[1] = 1;
		array[2] = 2;
		array[3] = 3;
		array[4] = 4;
		array[5] = 5;
		array[6] = 6;
		array[7] = 7;
		array[8] = 8;
		array[9] = 9;

		// [Conversion] int[] <-> List<Integer>
		List<Integer> list = Arrays.stream(array).boxed().collect(Collectors.toList());
		log.info(String.format("Conversion: array %s <-> list %s", Arrays.toString(array), list.toString()));
	}

}
