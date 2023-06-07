package stdin_stdout;
import java.io.*;
public class PrintWriterDemo {
    public static void main(String[] args) {
        PrintWriter pw = new PrintWriter(System.out, true);

        pw.println("Это строка");
        int i = -7;
        pw.println();
        double d = 4.5- 7;
        pw.println(d);
    }

}
