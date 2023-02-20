package JAVAPrograms;

public class LinearSearch {
	public static void main(String[] args) {
		int arr[] = { 10, 20, 30, 40, 50 };
		int key = 50;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == key) {
				System.out.println("Key found @  " + i);
				System.exit(i);
			}
		}
		System.out.println("Key not found");
	}
}
