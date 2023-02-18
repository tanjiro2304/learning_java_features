package learning_new_features;

import java.util.List;

public class TypeInferences {
	public static void main(String[] args) {
		List<String> names = List.of("Ranga","Ravi");
		List<String> newNames = List.of("John","Adam");
		
		//Type Inference
		//Java checks the type of variable at COMPILE TIME.
		var list = List.of(names, newNames);
		
		list.stream().forEach(System.out::println);
	}
}
