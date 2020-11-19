public class EmptyFileException extends Exception {
    public EmptyFileException(String str){
        System.out.println(str);
    }

    public void emptyFileException(){
        System.out.println("File is empty");
    }
}
