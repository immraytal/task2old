package Elements;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class Text implements TextEditor {
    private List<Paragraph> paragraph = new ArrayList<>();

    public String getFullText() {
        return null;
    }

    @Override
    public String toString() {
        String res = "";
        for (int i =0; i< paragraph.size(); i++) {

            res = res  + paragraph.get(i).toString() + "\n";

        }
        return res;
    }

    public Text(String path) {

        try {
            FileReader fileReader = new FileReader(path);

        BufferedReader reader = new BufferedReader(fileReader);
        String buff = reader.readLine();
        paragraph.add(new Paragraph());
        while (buff != null) {

            paragraph.get(paragraph.size()-1).setSentences(buff);
            buff = reader.readLine();

            if (buff == " ") {
                paragraph.add(new Paragraph());
            }


        }
        reader.close();
        fileReader.close();

        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
