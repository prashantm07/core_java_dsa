package exception_handlimg;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Exception_Exp {
	public static void main(String[] args) {
		try {
			FileInputStream fis = new FileInputStream("d:/file.txt");
		} catch (FileNotFoundException e) {
			System.out.println("File Not Found");
		}
	}

}
