package practice;

public class MaximumProduct {
	public static void main(String[] args) {
		int a[] = {10,2,20,3,1,3};
		int n = a.length;
		int product1 = a[n-1] * a[n-2];
		int product2 = a[0] * a[2];
		
		int res = Math.max(product1, product2);
		System.out.println(res);
	}

}
