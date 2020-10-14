import java.awt.*;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Variables
        Scanner scanner = new Scanner(System.in);
        StringSelection stringSelection;
        Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();

        System.out.println("Enter the line you want to be spaced out!\n" +
                "It will automatically be copied to your clipboard!");
        String inString = scanner.nextLine();
        String outString = "";

        for (int i = 0; i < inString.length(); i++) {
            outString += inString.charAt(i) + " ";
        }
        System.out.println(outString);
        stringSelection = new StringSelection(outString);
        clipboard.setContents(stringSelection, stringSelection);
    }
}
