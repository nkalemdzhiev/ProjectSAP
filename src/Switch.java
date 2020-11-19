import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.Scanner;

public class Switch {
    IOFile file = new IOFile();
    Scanner sc = new Scanner(System.in);
    public void switchLines(int line1, int line2) throws IOException, EmptyFileException {
        System.out.print("File path= ");
        String path = sc.nextLine();
        file.readFromFile(path);
        final List<String> lines = Files.readAllLines(Paths.get(path), StandardCharsets.UTF_8);
        String[] arr = new String[lines.size()];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = lines.get(i);
        }
        arr[line1] = lines.get(line2);
        arr[line2] = lines.get(line1);

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
        file.writeToFileLines(arr,path);
    }

    public void switchWords(int line1, int word1, int line2, int word2) throws IOException, EmptyFileException {
        System.out.print("File path=");
        String path = sc.nextLine();
        final List<String> lines = Files.readAllLines(Paths.get(path), StandardCharsets.UTF_8);
        file.readFromFile(path);
        String[][] text = new String[lines.size()][lines.size()];
        for (int i = 0; i <lines.size(); i++) {
            String [] words = lines.get(i).trim().split("\\s+");
            text[i] =words;
        }
        String newLine1 = text[line1][word1];
        String newLine2 = text[line2][word2];
        text[line1][word1] = newLine1.replace(newLine1,newLine2);
        text[line2][word2] = newLine2.replace(newLine2,newLine1);
        for (int i = 0; i < text.length; i++){
            System.out.println();
            for (int j = 0; j < text[i].length; j++) {
                System.out.print(text[i][j] + " ");
            }
        }
        file.writeToFileWords(text,path);
    }
}