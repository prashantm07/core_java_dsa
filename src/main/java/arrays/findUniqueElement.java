package arrays;

public class findUniqueElement {

	public static void main(String[] args) {
		int a[] = { 1 , 2, 2, 3, 3, 4, 5 };

		System.out.print("UniqueElement : ");
		for (int i = a.length-1; i >=0; i--) {
			int cnt = 0;
			for (int j = a.length-1; j >= 0; j--) {
				if (a[i] == a[j]) {
					cnt++;
				}
			}
			if (cnt == 1) {
				System.out.print(a[i] + " ");
//				break;
			}

		}

	}

}
