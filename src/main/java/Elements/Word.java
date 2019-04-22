package Elements;

import java.util.ArrayList;
import java.util.List;

public class Word implements TextEditor {
    @Override
    public String getFullText() {
        return null;
    }

    private List<String> symbols = new ArrayList<>();

    public  Word (String buff) {
        String[] res = buff.split(" ");
        for (String str:
             res) {
            symbols.add(str);
        }
    }

    @Override
    public String toString() {
        String res= "";
        for(int i=0; i <symbols.size(); i++)
        {
            res = res + symbols.get(i) + " ";
        }
        System.out.println("Word = " + res);
        return  res;
    }
}
