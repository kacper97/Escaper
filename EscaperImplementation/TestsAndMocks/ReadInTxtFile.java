import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ReadInTxtFile{

	// This is the word we will be taking into the programme
	static String word = "";

	public static void main(String[] args) {
		// Initialized as null to begin with
		BufferedReader br = null;
		// Just in case of an error it will catch it
		try {
			// Reads whatever is in the input.txt file to the console window
			br = new BufferedReader(new FileReader("Database1.txt"));
			// reads one line of text at a time from the string
			String oneLine = br.readLine();
			//Keeps reading all lines until its equal to null
			while(oneLine != null) {
				word += oneLine;
				oneLine = br.readLine();
			}			
			// Prints out the string to the console window
			System.out.println(word);

			// In the case of an error it will be caught here
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if (br != null)
					br.close();
			} catch (IOException ex) {
				ex.printStackTrace();
			}
		}

	}
}