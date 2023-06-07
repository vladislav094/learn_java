package stdin_stdout;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

public class ReadingFromFile {
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("src/main/java/stdin_stdout/myfile");
        Scanner scanner = new Scanner(file);

        String line = scanner.nextLine();
        String[] numbers = line.split(" ");
        int[] digit = new int[3];
        int counter = 0;
        for (String x: numbers) {
            digit[counter++] = Integer.parseInt(x);
        }

        System.out.println(Arrays.toString(numbers));
        System.out.println(Arrays.toString(digit));

        scanner.close();
    }

}
