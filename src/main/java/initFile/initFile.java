package initFile;

import Elements.Text;
import Elements.TextEditor;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class initFile {
    public static void main(String[] args) {
        System.out.println("Hello");

        TextEditor te = new Text("E:\\флешка\\task2\\src\\main\\resources\\text.txt");
        try {
            FileWriter fileWriter = new FileWriter("E:\\флешка\\task2\\src\\main\\resources\\output.txt", false);
            fileWriter.write(te.toString());
            fileWriter.flush();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

    }
}
