import java.io.IOException;
import java.util.Scanner;

public class Options {
    Switch lines = new Switch();
    public void options(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Type what you wanna switch Lines or Words: ");
        String answer = sc.nextLine();
        int wordsLine1, word1, wordsLine2, word2;
        if(answer.equals("Lines")){
            System.out.print("Line 1 becomes = ");
            int line1 = sc.nextInt();
            System.out.print("Line 2 becomes = ");
            int line2 = sc.nextInt();
            try {
                lines.switchLines(line1,line2);
            } catch (IOException ioException) {
                System.out.println("An error occured");
            } catch (EmptyFileException e) {
               // e.printStackTrace();
            //    e.emptyFileException();
            }
        }else if(answer.equals("Words")){
            try {
                System.out.print("Line 1 = ");
                wordsLine1 = sc.nextInt();
                System.out.print("Word 1 = ");
                word1 = sc.nextInt();
                System.out.print("Line 2 = ");
                wordsLine2 = sc.nextInt();
                System.out.print("Word 2 = ");
                word2 = sc.nextInt();
                lines.switchWords(wordsLine1,word1,wordsLine2,word2);
            } catch (IOException ioException) {
                System.out.println("An error occured");
            } catch (EmptyFileException e) {
            //    e.printStackTrace();
           //     e.emptyFileException();
            }
        }
    }
}
