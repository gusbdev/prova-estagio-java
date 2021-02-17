import java.io.*;

public class LineFile {
    public LineFile(String fileName) throws IOException {
        File file = new File(fileName);
        LineNumberReader lineRead = new LineNumberReader(new FileReader(file));
        lineRead.skip(file.length());
        int lineNumbers = lineRead.getLineNumber();
        System.out.print("Esse arquivo tem "+lineNumbers+" linhas.");
    }

    public static void main(String[] args){
        try{
            new LineFile("/home/gus/IdeaProjects/prova-estagio-java/prova-estagio-java.iml");
        }catch (IOException e){
            e.printStackTrace();
        }
    }

}
