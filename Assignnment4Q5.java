package lambdaAssignment;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Stream;


public class Assignnment4Q5 {
    List<String> list = Arrays.asList("aa", "bb", "cc", "dd");

    public static void main(String[] args) {
        Assignnment4Q5 assignment4Q5 = new Assignnment4Q5();
        processWords(assignment4Q5.list);
    }

    public static String processWords(List<String> list) {
        StringBuilder words = new StringBuilder();
        Consumer<String> consumer = p-> words.append(p.charAt(0));

         list.stream().forEach(consumer);
        System.out.println(words);
        return  words.toString();
    }
}