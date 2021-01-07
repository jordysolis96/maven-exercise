import java.util.Scanner;
import org.apache.commons.lang3.StringUtils;

public class Exercise {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        System.out.println("Enter something");
        String string = userInput.nextLine();
        System.out.println("You Entered: " + string);
        if(StringUtils.isNumeric(string)){
            System.out.println(string + " is a number");
        }else{
            System.out.println("\"" + string + "\"" + " is not a number");
        }
        System.out.println(StringUtils.capitalize(string));
        System.out.println(StringUtils.reverse(string));
    }
}
