import java.io.File;
import java.io.FilenameFilter;
import java.util.Locale;

public class Exercise2 {
    public static void main(String[] args) {
        File specificFile = new File("/PROGRAMMING/JAVA/AccentureBootcamp");
        String[] list = specificFile.list(
                new FilenameFilter() {
                    @Override
                    public boolean accept(File dir, String name) {
                        if (name.toLowerCase().endsWith(".txt")) {
                            return true;
                        }
                        return false;
                    }
                }

        );
        for (String fileName:list) {
            System.out.println(fileName);
        }
    }
}
