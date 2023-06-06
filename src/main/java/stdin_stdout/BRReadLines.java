package stdin_stdout;

import java.io.*;

public class BRReadLines {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String str;
        System.out.println("Type lines text.");
        System.out.println("Type 'stop' for finish.");
        do {
            str = br.readLine();
            System.out.println(str);
        } while (!str.equals("stop"));
    }
}
