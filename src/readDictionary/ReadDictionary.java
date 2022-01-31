package readDictionary;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ReadDictionary {
	
	public static void main(String[] args) throws IOException {

		String path = "C:\\Users\\uwise\\eclipse-workspace\\Exam\\src\\readDictionary\\dictionary.txt";
		File f = new File(path);
		FileReader fr = new FileReader(f);
		BufferedReader br = new BufferedReader(fr);
		
		if (!f.exists() || !f.isFile()) {
			throw new FileNotFoundException("File doesn't exist.");
		} else{
			System.out.println("File exists and will be read by this program.");
			String line ="";
			while ((line = br.readLine())!=null) {
					System.out.println(line);
				}
	
		}
	}
}

