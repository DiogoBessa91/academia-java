package dia3;

import java.util.Arrays;

public class Array {

	//to string
	public static void main(String[] args) {
		
		int[] array = new int[5];
		array[0] = 1;
		array[1] = 2;
		array[2] = 3;
		array[3] = 4;
		array[4] = 5;
		
		System.out.println(Arrays.toString(array));
		System.out.println(" "); 

	}
	
	//binary
	public static void main1(String[] args) {
		
		int[] array = new int[5];
		array[0] = 1;
		array[1] = 2;
		array[2] = 3;
		array[3] = 4;
		array[4] = 5;
		
		System.out.println(Arrays.binarySearch(array, 3));
		System.out.println(" "); 

	}
	
	//equals
	public static void main2(String[] args) {
		
		int[] array = new int[2];
		array[0] = 1;
		array[1] = 2;
		
		int[] array2 = new int[2];
		array[0] = 1;
		array[1] = 2;
		
		
		System.out.println(Arrays.equals(array, array2));
		System.out.println(" "); 

	}
	
	//fill
	public static void main3(String[] args) {
		
		int[] array = new int[2];
		
		Arrays.fill(array, 0);
		
		System.out.println(Arrays.toString(array));
		System.out.println(" "); 
	}
	
	//sort
	public static void main4(String[] args) {
		
		int[] array = new int[5];
		array[0] = 1;
		array[1] = 2;
		array[2] = 3;
		array[3] = 4;
		array[4] = 5;
		
		Arrays.sort(array);
		
		System.out.println(Arrays.toString(array));
		
	}
	
	//copyofrange
	public static void main5(String[] args) {
		
		int[] array = new int[5];
		array[0] = 1;
		array[1] = 2;
		array[2] = 3;
		array[3] = 4;
		array[4] = 5;
		
		int[] newArray = Arrays.copyOfRange(array, 1, 3);
		
		System.out.println(Arrays.toString(newArray));
		
	}
	
	
}
