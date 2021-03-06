
public class multiD {
	public static void main(String[] args){
		//normal int array - 1D array
		int[] values = {3, 4, 5};
		
		//int 2D array
		int[][] grid_values = {
			{1,2,3},
			{4,5,6},
			{7,8,9}
		};		

		for(int row=0; row < grid_values.length; row++){
			for(int col=0; col < grid_values[row].length; col++){
				System.out.print(grid_values[row][col] + "\t");
				/*Java knows that even tho we got an int
				 when it sees the '+' which means concatenation
				 it automatically converts it as a string
				*/		
			}
			System.out.println();
		} 
		
		
		//-------------------------------------
			/*1. new insight
				--allocating memory of same sizes regarding the first and second dimension			
			*/
		//normal string array - 1D array
		String[] texts = new String[3];
	
		//String 2D array
		String[][] grid_texts = new String[2][3];
	
		grid_texts[0][1] = "Hello there"; //accessing--assigning values

		//-----------------------------------
		  /*2. new for me
			--allocating memory of second dimension to different sizes		
		*/

		String[][] new_grid = new String[2][]; 
		//see that the second number in new String[2][] is not defined.
		//that will cause an error if you don't do the things below 
		
		new_grid[0] = new String[1]; 
		new_grid[1] = new String[3];

		new_grid[0][0] = "lala";	
		new_grid[1][2] = "po";

		System.out.println(new_grid[0][0]);
		System.out.println(new_grid[1][2]);
	}
}

