import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        String citation = "Je suis adroit de la main gauche et je suis gauche de la main droite";
        String[] citArr = citation.toLowerCase().split(" ");

        // find word main
        // find word contains sequence "oit"
        // find word contains letters "oit"

        List<String> result = Arrays.stream(citArr).filter(cit -> cit.equals("main")).toList();
        /*List<String> result = new ArrayList<>();
        for (String cit : citArr) {
            if (cit.equals("main")) {
                result.add(cit);
                break;
            }
        }*/
        System.out.println(result);

        List<String> result2 = Arrays.stream(citArr).filter(cit-> cit.contains("oit")).toList();
        // String result2Str = String.join(", ", result2);
        // System.out.println(result2Str);

        /*List<String> result2 = new ArrayList<>();
        for (String cit : citArr) {
            if (cit.contains("oi")) {
                result2.add(cit);
            }
        }*/
        System.out.println(result2);

        List<String> result3 = new ArrayList<>();
        /*for (String word : citArr) {
            for (int i = 0; i < word.toCharArray().length; i++) {
                if (word.contains("o") || word.contains("i")) {
                    String tmp = word;
                    if (!result3.contains(tmp)) {
                        result3.add(word);
                    }
                    break;
                }
            }
        }*/
        result3 = Arrays.stream(citArr)
                .filter(word -> word.contains("o") || word.contains("i"))
                .distinct()
                .toList();
        System.out.println(result3);

        // Print int
        System.out.println("Print result for i += result - range i = 1 to 10");
        System.out.println(IntStream.range(1,10).sum());

        // Print int
        System.out.println("Print result for i *= result - range i = 1 to 10");
        System.out.println(IntStream.range(1, 4).reduce(1, (a, b) -> a * b));
    }
}
