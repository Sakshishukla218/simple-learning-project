import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
public class FileHandling {
	public static void main(String[] args) throws IOException{
		File file = new File("C:\\Simpli_file\\e.txt");
        if (file.createNewFile()) {
            System.out.println("file created Successfully");
        } else {
            System.out.println("file Alraedy Exist");
        }
        String data = "Welcome sakshi....";
        Files.write(Paths.get("C:\\Simpli_file\\e.txt"), data.getBytes());
        System.out.println("File Written Successfully");
        FileWriter writer= new FileWriter(file);
        writer.append(data);
        writer.append(data);
        writer.append(data);
        writer.close();
        System.out.println("File Append Operation Done Successfully");
        BufferedReader reader = new BufferedReader(new FileReader("C:\\Simpli_file\\e.txt"));
        String line = reader.readLine();
        while (line != null) {
            System.out.println(line);
            line = reader.readLine();
        }
        reader.close();
        System.out.println("File Readed Successfully");    
    }
}
