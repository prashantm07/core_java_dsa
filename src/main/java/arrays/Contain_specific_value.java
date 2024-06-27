package arrays;

public class Contain_specific_value {

	public static void main(String[] args) {
		int arr[] = { 1, 2, 3, 4, 5, 5, 8 };
		int value = 5;
		int count = 0;
		boolean flag = false;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == value) {
				flag = true;
				count++;
			}
		}
		if (flag == true) {
			System.out.println("value is present in array......! "+count+" times");
		} else {
			System.out.println("value is not present in the array...!");
		}
	}

}
