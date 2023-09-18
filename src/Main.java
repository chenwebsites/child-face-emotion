import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.List;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Feed Child With Ice Cream, Salad or Milk To See Child's Face Reaction : ");
		String food = reader.readLine();


	
		
	
	}// End of main method 		
}// End of Main Class 
		
// ---------------------------------------------------------------------------		
//					Switch  approach  		
//---------------------------------------------------------------------------			
		// First approach, just as naive as the "if else if" approach. 
		//  Easy to read, same time complexity as the "if else if" approach. 
		//  Less memory expensive -  
		//	equlesIgnoreCase() or println() method will not execute for each if else condition. 
//		
//		String emotion;
//
//		switch (food.toLowerCase()) {
//		case "ice cream":
//			emotion = "Happy";
//			break;
//		case "salad":
//			emotion = "Angry";
//			break;
//		case "milk":
//			emotion = "Normal";
//			break;
//		default:
//			emotion = "Error";
//		}
//		System.out.println(emotion + " Face");

// ---------------------------------------------------------------------------		
//					Parallel  approach  		
//---------------------------------------------------------------------------		

	// In this approach I use Parallel Array lists, which make the insertion,
	// searching and retrivel efficent
	// However, this code is not maintainable neither flex.

//		List<String> foods = Arrays.asList("ice cream", "salad", "milk");
//		List<String> emotions = Arrays.asList("Happy", "Angry", "Normal");
//
//		if (foods.contains(food.toLowerCase())) {
//			System.out.println(emotions.get(foods.indexOf(food)) + " Face");
//		}else {
//			System.out.println("Error" + " " + "Face");
//		}


// ---------------------------------------------------------------------------		
//							HashMap approach  		
//---------------------------------------------------------------------------		

	// The approch I prefer the most - Using the HashMap approach as below.
	// I can use either HashMap or HashTable to map from food input to face emotion.
	// HashMap is prefered as sync is not needed.
	// In this program the Insertion and Retrivel is being used the most
	// therefore it is the best choise to use this stracture.
	// Time Complexity of insertion and retrivel is O(1)
	// thanks to hashcode storing.
	// also we use getOrDefault method that maps to "Error" string in case the input
	// word does not exist in the HashMap key.

//		Map<String, String> map = new HashMap<>();
//		map.put("ice cream", "Happy");
//		map.put("salad", "Angry");
//		map.put("milk", "Normal");
//		String emotion = map.getOrDefault(food.toLowerCase(), "Error");
//		System.out.println(emotion + " Face");
//

// ---------------------------------------------------------------------------		
//					Main Example 		
// ---------------------------------------------------------------------------		
// 		if (food.equalsIgnoreCase("Ice Cream")) {
//			System.out.println("Happy" + " " + "Face");
//		} else if (food.equalsIgnoreCase("Salad")) {
//			System.out.println("Angry" + " " + "Face");
//		} else if (food.equalsIgnoreCase("Milk")) {
//			System.out.println("Normal" + " " + "Face");
//		} else {
//			System.out.println("Error" + " " + "Face");
//		}

