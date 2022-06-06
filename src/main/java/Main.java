import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

public class Main {

    public static void main(String[] args) {
        System.out.println(dictionary("fulgrtagb robnbuamb kgfjhinbeiv vuhgacc"));
    }

    public static List<String> dictionary(String text) {
        Function<String, List<String>> function = x -> Arrays.stream(x.split(" "))
                .sorted().toList();
        return function.apply(text);
    }
}
