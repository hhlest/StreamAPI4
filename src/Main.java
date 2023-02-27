
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        String str = "These basic principles are used to organize and prioritize your content";
        Arrays.stream(str.split(" "))
                .filter(a -> a.length() > 5)
                .forEach(a -> System.out.print(a + " "));
    }
}
