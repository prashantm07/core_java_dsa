package practice;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class student implements Serializable{
	int id ;
	String name;
	
	public student() {
		
	}
	public student(int id , String name) {
		id = this.id;
		name = this.name;
	}
	
}
public class tryCatch {

	public static void main(String[] args) {
		student s1 = new student(211,"prshant");
		
		try {
			FileOutputStream file = new FileOutputStream("prashant");
			try {
				ObjectOutputStream out = new ObjectOutputStream(file);
				out.writeObject(s1);
				out.flush();
				out.close();
				System.out.println("success");
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
