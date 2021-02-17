import java.io.File;
import java.io.IOException;

public class ListFiles {
    public ListFiles(String directory) throws IOException {
        File file = new File(directory);
        File arrayFiles[] = file.listFiles();
        int i = 0;
        for(int j = arrayFiles.length;i < j; i++){
            File files = arrayFiles[i];
            System.out.println(files.getName());
        }
    }

    public static void main(String[] args){
        try{
            new ListFiles("/home/gus/IdeaProjects/prova-estagio-java");
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
