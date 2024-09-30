import java.awt.*;
import java.io.File;
import java.io.IOException;

public class JavaFile {

    public static void main(String[] args) throws IOException {
        // text file, should be opening in default text editor
        File file = new File("C:\\Users\\P\\IdeaProjects\\java\\java\\java-text");

        // First, check if Desktop is supported by the Platform or not
        if (!Desktop.isDesktopSupported()) {
            System.out.println("Desktop is not supported");
            return;
        }

        Desktop desktop = Desktop.getDesktop();

        // Check if the file exists, and if it does, open it
        if (file.exists()) {
            desktop.open(file);
        } else {
            System.out.println("File does not exist");
        }

        // Let's try to open the same file again (no need to reassign)
        if (file.exists()) {
            desktop.open(file);
        }
    }
}