package stdin_stdout;
import java.io.*;
public class ShowFile {
    public static void main(String[] args) {
        int i;
        FileInputStream fin;

        if (args.length != 1) {
            System.out.println("Using: ShowFile name_file");
            return;
        }

        try {
            fin = new FileInputStream(args[0]);
        } catch (FileNotFoundException e) {
            System.out.println("Can't open file");
            return;
        }
        try {
            do {
                i = fin.read();
                if (i != -1) System.out.println((char) i);
            } while (i != -1);
        } catch (IOException e) {
            System.out.println("Error when close file");
        }
    }
}
