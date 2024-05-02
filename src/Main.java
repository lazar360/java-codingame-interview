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
        System.out.println("result= " + result);

        /*String[] resultArray = Arrays.stream(array)
                .filter(word -> word.contains("ea"))
                .toArray(String[]::new);*/

        // 2- In a given array [all, in, the, beat, box]
        // return an array that matches one letter "ea"

        String[] words2 = {"all", "in", "the", "beat", "box"};
        String letters2 = "ea";
        List<Object> result2 = new ArrayList<>();

        for (String word : words2) {
            for (int i = 0; i < letters2.toCharArray().length; i++) {
                for (char character : word.toCharArray()) {
                    if (letters2.toCharArray()[i] == character){
                        if(!result2.contains(word)) result2.add(word);
                    }
                }
            }
        }
        System.out.println("result2= "+result2);

    }
}
