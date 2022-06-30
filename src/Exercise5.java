import java.io.File;

public class Exercise5 {
    public static void main(String[] args) {

        //Get the file
        File newFile = new File("/PROGRAMMING/JAVA/AccentureBootcamp/text.txt");

        if (newFile.isFile()) {
            System.out.println(newFile.getAbsolutePath() + " it's a file");
        } else {
            System.out.println(newFile.getAbsolutePath() + " it's not a file");
        }

        if (newFile.isDirectory()) {
            System.out.println(newFile.getAbsolutePath() + " it's a directory");
        } else {
            System.out.println(newFile.getAbsolutePath() + " it's not a directory");
        }
    }
}
