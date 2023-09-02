package lecture9;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Exercise1 {
	public static void main(String[] args) {
		Exercise1 exercise = new Exercise1();
		exercise.fileRead();
	}

	public void fileRead() {
		int total = 0;

		try (BufferedReader reader = new BufferedReader(new FileReader("D:\\Numbers.txt"))){
			

			String line = null;

			while ((line = reader.readLine()) != null) {

				total += Integer.valueOf(line);

			}
			System.out.println("Total: " + total);

		} catch (NumberFormatException | IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		
		}

	}

}
