public class first-array-strings{
	public static void main(String[] args){
		//first way 
		//appropriate usage: if the elements are not predetermined
		String[] greet = new String[3];

		greet[0] = "Hi!";
		greet[1] = "Hello!";
		greet[2] = "Kamusta?";

		//second way
			
		String[] fruits = { "banana", "apple", "mango" }; 
	
		for(String fruits: fruits){
			System.out.println(fruits);
		}	
	} 
}
