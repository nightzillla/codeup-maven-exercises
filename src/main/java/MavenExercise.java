import org.apache.commons.lang3.StringUtils;

import java.util.Scanner;

public class MavenExercise {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Something:");
        String userInput = scanner.nextLine();
        System.out.printf("You Entered: %s is not a number%n", userInput);
        StringUtils string = new StringUtils();
        System.out.printf("Flipped Case: %s%n",string.swapCase(userInput));
        System.out.printf("Reversed: %s",string.reverse(userInput));
    }
}
