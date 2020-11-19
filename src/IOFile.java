import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class IOFile {
    public void readFromFile(String path) throws EmptyFileException {
        try {
            File myObj = new File(path);
            Scanner myReader = new Scanner(myObj);
            if(myObj.length() == 0) {

                throw new EmptyFileException("File is empty");
            }
            while (myReader.hasNextLine()) {
                String data = myReader.nextLine();
                System.out.println(data);
            }
            System.out.println();
            myReader.close();
        } catch (FileNotFoundException e) {
            System.out.println("File not found.");
            //e.printStackTrace();
        }
    }

    public void writeToFileLines(String[] arr, String path) throws IOException {
        FileWriter fw = new FileWriter(path);
        for (String line : arr) {
            fw.write(line + System.lineSeparator());
        }
        fw.close();
    }

    public void writeToFileWords(String[][] arr, String path) throws IOException {
        FileWriter fw = new FileWriter(path);
        for (int i = 0; i < arr.length; i++) {
            System.out.println();
            for (int j = 0; j < arr[i].length; j++) {
                fw.write(arr[i][j] + " ");
            }
            fw.write("\n");
        }
        fw.close();
    }
}

