import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.io.File;
import java.util.ArrayList;

public class Contest2 {

	public static void removeSpam(String folder) {

		// Your logic goes here

		ArrayList<String> list1 = new ArrayList<>();
		list1.add("Empty");
		list1.add("Junk");
		list1.add("Chunk");

		String content = "";
		File files[] = (new File(folder)).listFiles();

		for(File file: files) {
			try {
				content = Files.readString(Paths.get(file.getAbsolutePath()));
			
				for(String temp: list1)
					content = content.replace(temp, "");
				
				FileWriter fwrite = new FileWriter(file);
				fwrite.write(content);
				fwrite.close();
			} catch(IOException ie) {
				ie.printStackTrace();
			}
		}
	}

	public static void main(String[] args) throws Exception {
		String folder = "C:/notes";

		removeSpam(folder);
	}

}
