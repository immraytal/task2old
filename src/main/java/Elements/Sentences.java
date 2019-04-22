package Elements;

import java.util.ArrayList;
import java.util.List;

public class Sentences implements TextEditor {

    private List<Word> words= new ArrayList<>();

    public Sentences(String line) {
        words.add(new Word(line));
    }

    public String getSentecne() {
       return words.toString();
    }

    @Override
    public String toString() {
        String res= "";
        for (int i =0; i <words.size(); i++){
            res= res + words.get(i).toString() + " ";
        }
        return res;
    }

    public String getFullText() {
        return null;
    }
}
