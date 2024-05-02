import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // 1- In a given array [all, in, the, beat, box]
        // return an array that matches all letters "ea"

        String[] words1 = {"all", "in", "the", "beat", "box"};
        String letters = "ea";
        List<Object> result = new ArrayList<>();
        for (String word : words1) {
            if (word.contains(letters)){
                result.add(word);
            }
        }
        System.out.println(result);

        /*String[] resultArray = Arrays.stream(array)
                .filter(word -> word.contains("ea"))
                .toArray(String[]::new);*/


    }
}
