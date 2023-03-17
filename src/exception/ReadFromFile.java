package exception;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ReadFromFile {
    public void readFile() throws RuntimeException {
        String fileName = "example1.txt";
        String line = null;

        try {
            FileReader fileReader = new FileReader(fileName);
            BufferedReader bufferedReader = new BufferedReader(fileReader);

            while((line = bufferedReader.readLine()) != null) {
                System.out.println(line);
            }

            bufferedReader.close();
        }
        catch(FileNotFoundException ex) {
            System.out.println("Unable to open file '" + fileName + "'");
            throw new RuntimeException(ex);
        }
        catch(IOException ex) {
            System.out.println("Error reading file '" + fileName + "'");
            throw new RuntimeException(ex);
        }
        finally {
            System.out.println("File successfully read.");
        }
    }
}
