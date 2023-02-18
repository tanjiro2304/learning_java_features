package learning_new_features;

public class StringApi {
	public static void main(String[] args) {
		//isBlank() checks for non-white space characters present in String
		System.out.println(" ".isBlank());
		
		//strip() removes blank spaces
//		System.out.println(" LR ".strip());
//		System.out.println(" LR ".stripLeading());
//		System.out.println(" LR ".stripTrailing());
		
		System.out.println(" L R ".strip().replace(" ", "@"));
		System.out.println(" LR ".stripLeading().replace(" ", "@"));
		System.out.println(" LR ".stripTrailing().replace(" ","@"));
		
		"Line1\nLine2\n".lines().forEach(System.out::println);
		
		System.out.println("UPPER".transform(s->s.substring(2)));
	
		System.out.println("My name is %s. My age is %d.".formatted("Ranga",25));
		
	}
}
