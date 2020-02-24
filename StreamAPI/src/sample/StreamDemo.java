package sample;

import java.util.Arrays;
import java.util.List;

public class StreamDemo {

	public static void main(String args[]) {
		List<String> listOfStrings = Arrays.asList("Java", "Oracle",
				"JavaScript");
		//stream functionality
		listOfStrings.stream().filter(str -> str.length() > 5).findAny()
		.ifPresent(System.out::println);
	}
}
