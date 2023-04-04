package school.mjc.stage0.loops.task2;

public class WordsBuilder {
    public void buildPhrase(char... chars) {
        int x = 0;
        String result = "";
        while (x < chars.length) {
            result = result + chars[x];
            x++;
        }
        System.out.print(result);
    }
}
