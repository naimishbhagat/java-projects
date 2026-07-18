
import java.util.Arrays;
import java.util.List;
public class OptionalEx {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Naimish","Lax","John","Matt");

        String name = names.stream()
                    .filter(str -> str.contains("x"))
                    .findFirst().orElse("Not Found");
        System.out.println(name);
    }
}
