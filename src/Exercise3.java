import java.io.File;

public class Exercise3 {
    public static void main(String[] args) {
        try {
            //Get the file
            File newFile = new File("/PROGRAMMING/JAVA/AccentureBootcamp/texts.txt");

            if (newFile.exists()) {
                System.out.println("file EXISTS");
            } else {
                System.out.println("File dosen't exist");
            }

        } catch (Exception exeption) {
            System.err.println(exeption);
        }
    }
}
