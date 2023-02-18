package learning_new_features;

public class SwitchExpression {
	
	public static String findDayOfTheWeek(Integer i) {
		String day = switch(i) {
		case 0 -> {
			System.out.println("Code Here...");
			yield "Sunday";
		
		}
		
		case 1 -> "Monday";
		case 2 ->"Tuesday";
		default -> throw new IllegalArgumentException("Invalid option " + i);
		};
		
		return day;
	}
	
	public static void main(String[] args) {
		System.out.println(findDayOfTheWeek(0));
		System.out.println(findDayOfTheWeek(1));
	}
}
