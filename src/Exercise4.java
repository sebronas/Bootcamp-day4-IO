import java.io.File;

public class Exercise4 {
    public static void main(String[] args) {
        //Get the file
        File newFile = new File("/PROGRAMMING/JAVA/AccentureBootcamp/text.txt");

        if (newFile.canRead()) {
            System.out.println("File is readable");
        } else {
            System.out.println("File isn't readable");
        }

        //This is from solution example
        if (newFile.canWrite()) {
            System.out.println(newFile.getAbsolutePath() + " can write.\n");
        } else {
            System.out.println(newFile.getAbsolutePath() + " cannot write. \n");
        }
    }
}
