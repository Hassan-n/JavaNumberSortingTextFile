import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>();

        try {
            BufferedReader br = new BufferedReader(new FileReader("file1.txt"));
            String line = br.readLine();

            while (line != null) {
                list.add(line);
                line = br.readLine();
            }

            br.close();
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }

        System.out.println("Contents of file before sorting:");
        for (String s : list) {
            System.out.println(s);
        }

        Collections.sort(list, new NumericComparator());

        System.out.println("\nContents of file after sorting:");
        for (String s : list) {
            System.out.println(s);
        }
    }
}




