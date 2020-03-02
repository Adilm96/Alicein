import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Alice {

    public static void countTheWords(String filename, Map<String, Integer> words)throws FileNotFoundException {
        Scanner file = new Scanner(new File(filename));
        while (file.hasNext()){
           String word = file.next();
           Integer count = words.get(word);
           if (count != null)
             count++;
           else
               count = 1;
           words.put(word, count);
        }
        file.close();
    }

    public static void main(String[]args){

        Map<String, Integer> words = new HashMap<String, Integer>();
        try {
            countTheWords("Insert file here", words);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        System.out.println(words);

    }
}
