package learning_new_features;

public class TextBlocks {
	public static void main(String[] args) {
		System.out.println(""" 
				First Line
				Second Line
				Third Line
				""");
	
//		"""First Line""" WRONG!!!
		
		
//		Output:
//		First Line
//		Second Line
//		Third Line
		
		
		System.out.println(""" 
				First Line
					Second Line
						Third Line
				""");
		
//		Output:
//		First Line
//			Second Line
//				Third Line
	}
}
