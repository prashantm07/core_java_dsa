package arrays;

public class unique_Element {

	public void find_unique() {

		int a [] = {1,2,3,4,1,2,3,5,6};
		
		for (int i = 0; i < a.length; i++) {
			int count = 0;
			for (int j = 0; j < a.length; j++) {
				if(a[i] == a[j])
					count++;
			}
			if(count ==1) {
				System.out.println(a[i]);
			}
		}
	}
	
	public static void main(String[] args) {
		unique_Element un = new unique_Element();
		un.find_unique();
		
	}

}
