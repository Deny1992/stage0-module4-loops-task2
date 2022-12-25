package school.mjc.stage0.loops.task2;

public class WordsBuilder {
    public void buildPhrase(char... chars) {
        String str = "";
        int counter = 0;
        while (counter < chars.length){
            str += chars[counter];
            counter++;
        }
        System.out.print(str);
    }
}
