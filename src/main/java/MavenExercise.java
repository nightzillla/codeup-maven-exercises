import org.apache.commons.lang3.StringUtils;
import java.util.Scanner;

public class MavenExercise {
    public static void main(String[] args) {
        //https://commons.apache.org/proper/commons-lang/apidocs/org/apache/commons/lang3/StringUtils.html
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Something:");
        String userInput = scanner.nextLine();
        System.out.printf("You Entered: %s%n", userInput);
        System.out.println(StringUtils.isNumeric(userInput) ? userInput + " is a number" : userInput + " is not a number");
//        StringUtils string = new StringUtils();
        System.out.printf("Flipped Case: %s",StringUtils.swapCase(userInput));
        System.out.printf("Reversed: %s",StringUtils.reverse(userInput));
    }
}
