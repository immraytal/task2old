package Elements;

import java.util.ArrayList;
import java.util.List;

public class Paragraph implements TextEditor {

    public String getFullText() {
        return null;
    }

    public void setSentences(String buff) {
        sentences.add(new Sentences(buff));
    }

    @Override
    public String toString() {
        String res= "";
        for (int i = 0; i<sentences.size(); i++) {
            res = res + sentences.get(i).toString() + "\n";

        }
        return res;
    }

    private List<Sentences> sentences = new ArrayList<>();
}
