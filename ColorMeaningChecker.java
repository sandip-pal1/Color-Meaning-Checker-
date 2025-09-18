package Project_2;

import java.util.Scanner;

public class ColorMeaningChecker {

    // Method to return meaning based on color
    public static String getColorMeaning(String color) {
        switch (color.toLowerCase()) {
            case "red":
                return "❤️ Red → Passion, Energy, Confidence";
            case "blue":
                return "💙 Blue → Calmness, Trust, Intelligence";
            case "green":
                return "💚 Green → Growth, Balance, Harmony";
            case "yellow":
                return "💛 Yellow → Happiness, Optimism, Creativity";
            case "black":
                return "🖤 Black → Power, Mystery, Elegance";
            case "white":
                return "🤍 White → Purity, Simplicity, Peace";
            default:
                return "❌ Sorry, I don’t have a meaning for that color.";
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("🎨 Welcome to Color Meaning Checker!");
        System.out.println("Enter a color name (red, blue, green, yellow, black, white).");
        System.out.println("Type 'exit' to quit.");

        while (true) {
            System.out.print("\nEnter a color: ");
            String input = scanner.nextLine().trim();

            // Exit condition
            if (input.equalsIgnoreCase("exit")) {
                System.out.println("👋 Goodbye! Thanks for using Color Meaning Checker.");
                break;
            }

            // Get meaning
            String meaning = getColorMeaning(input);
            System.out.println(meaning);
        }

        scanner.close();
    }
}

