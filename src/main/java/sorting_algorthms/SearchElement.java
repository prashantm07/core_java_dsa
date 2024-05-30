package sorting_algorthms;

public class SearchElement {
	public static void main(String[] args) {
		int a[] = { 1, 2, 3, 4, 5 };
		int x = 9;
		boolean exits = false;
		for (int i = 0; i < a.length; i++) {
			if (a[i] == x) {
				System.out.println(i);
				exits = true;
			}

		}
		if (!exits) {
			System.out.println("element not found");
		}
	}
}
