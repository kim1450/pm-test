
import java.io.*;

public class FileInputStreamEx {

	public static void main(String[] args) {
		byte b[] = new byte[6];

		try {
			FileInputStream fin = new FileInputStream("C:\\Temp\\test.out");

			int n = 0, c;

			while ((c = fin.read()) != -1) {
				b[n] = (byte) c;
				n++;
			}

			System.out.println("Output data from C:\\\\Temp\\\\test.out");

			for (int i = 0; i < b.length; i++) {
				System.out.print(b[i] + " ");
			}
			System.out.println();

			fin.close();
		} catch (IOException e) {
			System.out.println("Cannot reed from C:\\\\Temp\\\\test.out" + e.getMessage());
		}
	}

}