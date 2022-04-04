package dtype;

import java.util.*;
import java.util.stream.Collectors;
import dtype.Logger;

public class _String {

	public static void main(String[] args) {
		Logger log = new Logger();

		log.debug(String.format("Run '%s'...", "_String.java"));

		String str = new String("Java String");

		// [Method]
		// 1. Equals
		boolean res1 = str.equals("Java String");
		log.info(String.format("equals: %s", String.valueOf(res1)));
		// 2.Contains
		boolean res2 = str.contains("Java");
		log.info(String.format("contains: %s",String.valueOf(res2)));
		// 3.Split
		String[] res3 = str.split(" ");
		log.info(String.format("split: %s",Arrays.toString(res3)));
		// 4.Replace
		String res4 = str.replace("Java", "<language>");
		log.info(String.format("replace: %s",res4));
		// 5. charAt
		int res5 = str.charAt(2);
		log.info(String.format("charAr: %s",res5));
		// 6. length
		int res6 = str.length();
		log.info(String.format("length: %s",res6));

		// toCharArray
		char[] res20 = str.toCharArray();
		log.info(String.format("toCharArray: %s", Arrays.toString(res20)));
		// joinCharArray
		String res21 = "@".copyValueOf(res20, 0, res20.length);
		log.info(String.format("joinCharArray: %s", res21));

		// [Conversion] int[] <-> List<Integer>
		List<String> list = Arrays.asList(res3);
		log.info(String.format("Conversion: array %s <-> list %s", Arrays.toString(res3), list.toString()));
	}

}
