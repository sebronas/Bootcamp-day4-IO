import java.io.File;

public class Exercise1 {
    public static void main(String[] args) {

        File listOfFiles = new File("/PROGRAMMING/JAVA/AccentureBootcamp");
        String[] filesInListArray = listOfFiles.list();
        for (String name: filesInListArray) {
            System.out.println(name);

            //some extra tasks
            try {
                //Get the file
                File newFile = new File("/PROGRAMMING/JAVA/AccentureBootcamp/text.txt");

                //Create new file if it does not exist
                if (newFile.createNewFile()) {
                    System.out.println("file created");
                } else {
                    System.out.println("File already exists");
                }

            } catch (Exception exeption) {
                System.err.println(exeption);
            }
        }
    }
}