package learning_new_features;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class FileReadWrite {
	public static void main(String[] args) throws IOException {
		Path path = Paths.get("./src/resources/sample.txt");
		//readString() and writeString() methods introduced in Java 11
		String fileContent = Files.readString(path);
		System.out.println(fileContent);
		
		String newFileContent = fileContent.replace("World","Vishal");
		Path newFilePath = Paths.get("./src/resources/sample-new.txt");
		Files.writeString(newFilePath, newFileContent);
	}
}
