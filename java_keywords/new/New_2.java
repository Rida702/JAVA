public class New_2 {
	public static void main ( String[] args ) {
		int[] arr_1 = new int[5];
		int[] arr_2 = new int[]{1, 2, 3, 4, 5};
		for (int i = 0; i < arr_1.length; i++) {
		    arr_1[i] = i + 1;
		}
		for (int i = 0; i < arr_1.length; i++) {
			System.out.println(arr_1[i] + " " + arr_2[i] );
		}
	}
}

//2.Creating arrays: The "new" keyword is used to create a new array object in Java
//int[] arr = {1, 2, 3, 4, 5};
//int[] arr = new int[5];
//int[] arr = new int[]{1, 2, 3, 4, 5};