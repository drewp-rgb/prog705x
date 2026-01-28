import java.util.*;
import java.io.*;

public class l705x {
    public static void main(String[] args) throws IOException {
        Scanner input = new Scanner(new File("prog512h.txt"));
        Scanner input2 = new Scanner(new File("prog705x.txt"));
        ArrayList<String> list = new ArrayList<>();
        ArrayList<String> word = new ArrayList<>();
        while (input.hasNext()) {
            String x = input.nextLine();
            word.add(x.substring(0,5));
            word.add(x.substring(5));
        }

        while (input2.hasNext()) {
            list.add(input2.nextLine());

        }
        for(int lcv = 0;lcv < word.size();lcv++)
        {
            int linepos = Integer.parseInt(word.get(lcv).substring(0,2));
            int wordd = Integer.parseInt(word.get(lcv).substring(2,3));
            int wordpos = Integer.parseInt(word.get(lcv).substring(3,4));
            String[] words = list.get(linepos - 1).split(" ");
            System.out.print(words[wordd-1].substring(wordpos-1, wordpos));
            //1
            //2
            //3
            //4
        }
    }
}