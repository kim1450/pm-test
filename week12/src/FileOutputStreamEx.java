

import java.io.*;

public class FileOutputStreamEx {

	public static void main(String[] args) {
		byte b[] = { 7, 51, 3, 4, -1, 24 };

		try {
			FileOutputStream fout = new FileOutputStream("c:\\Temp\\test.out");

			for (int i = 0; i < b.length; i++) {
				fout.write(b[i]);
			}

			fout.close();
		} catch (IOException e) {
			System.out.println("Could not store c:\\\\Temp\\\\test.out" + e.getMessage());
			return;
		}
		
		System.out.println("c:\\\\Temp\\\\test.out successfully stored");
	}

}
