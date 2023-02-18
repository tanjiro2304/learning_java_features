package learing_new_features;

import java.util.List;
import java.util.function.Predicate;

public class PredicateNotRunner {
	
	public static boolean isEven(Integer number) {
		return number % 2 == 0;
	}
	
	public static void main(String[] args) {
		List<Integer> numbers = List.of(3,4,5,6,7,8,9);
		Predicate<Integer> evenNumberPredicate = number -> number % 2 == 0;
		//Print Even Numbers
		System.out.println("Even Number using Predicate...");
		numbers.stream().filter(evenNumberPredicate).forEach(System.out::println);
		
		
		//Print Odd Numbers
		System.out.println("Odd Number using Predicate...");
		numbers.stream().filter(evenNumberPredicate.negate()).forEach(System.out::println);
		
		System.out.println("Odd Number using Predicate.not()...");
		numbers.stream().filter(Predicate.not(PredicateNotRunner::isEven)).forEach(System.out::println);
		
	}
}
