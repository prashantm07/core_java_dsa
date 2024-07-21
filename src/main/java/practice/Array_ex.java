package practice;

public class Array_ex {
	public static void main(String[] args) {
		int a[] = { 0, -2, -4, -9, 0, 0, 1, 0,-5 };
//		shift all  0 to last
//		for (int i = 0; i < a.length; i++) {
//			for (int j = i+1; j < a.length; j++) {
//				if(a[i]==0) {
//					int temp =a[i];
//					a[i] = a[j];
//					a[j]= temp;
//				}
//			}
//		}
		int count = 0;
		for(int num : a) {
			if(num != 0) {
				count++;
			}
		}
		int non_zero [] = new int[count];
		int index = 0;
		for(int num : a) {
			if(num != 0) {
				non_zero[index++] = num;
			}
		}
		for(int num : non_zero) {
			System.out.print(num+" ");
		}

	}

}
