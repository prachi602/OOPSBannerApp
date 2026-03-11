/**
 * OOPSBannerApp UC8 - Use Map for Character Patterns and Render via Function
 *
 * This use case extends UC7 by utilizing the Collections Framework (HashMap)
 * to manage character patterns in a flexible and efficient manner.
 * The application retrieves and displays the "OOPS" banner using these mappings.
 *
 * @author Developer
 * @version 8.0
 */

import java.util.HashMap;

public class BannerMapCollection {

    /**
     * Creates a HashMap containing ASCII art patterns for supported characters.
     *
     * Each character is mapped to an array of strings where each string represents
     * one line of the character's ASCII art pattern. All patterns are assumed to have
     * the same height (7 lines).
     *
     * @return a HashMap where keys are characters and values are String arrays
     *         representing the ASCII art pattern lines for each character
     */
    public static HashMap<Character, String[]> createCharacterMap() {
        HashMap<Character, String[]> charMap = new HashMap<>();

        // Pattern for O
        charMap.put('O', new String[] {
            "   *****  ",
            "  *     * ",
            "  *     * ",
            "  *     * ",
            "  *     * ",
            "  *     * ",
            "   *****  "
        });

        // Pattern for P
        charMap.put('P', new String[] {
            "  ******  ",
            "  *     * ",
            "  *     * ",
            "  ******  ",
            "  *       ",
            "  *       ",
            "  *       "
        });

        // Pattern for S
        charMap.put('S', new String[] {
            "   *****  ",
            "  *       ",
            "  *       ",
            "   *****  ",
            "        * ",
            "        * ",
            "   *****  "
        });

        // Pattern for space
        charMap.put(' ', new String[] {
            "          ",
            "          ",
            "          ",
            "          ",
            "          ",
            "          ",
            "          "
        });

        return charMap;
    }

    /**
     * Displays a banner message using the provided character map.
     *
     * Renders the input message as a large ASCII art banner by iterating
     * through each line of the character patterns and horizontally concatenating
     * the corresponding line from each character in the message.
     *
     * @param message the String message to display as a banner
     * @param charMap a HashMap containing character patterns
     */
    public static void displayBanner(String message, HashMap<Character, String[]> charMap) {
        int patternHeight = charMap.get('O').length; // assume all patterns same height

        for (int line = 0; line < patternHeight; line++) {
            StringBuilder bannerLine = new StringBuilder();
            for (char ch : message.toCharArray()) {
                String[] pattern = charMap.getOrDefault(ch, charMap.get(' '));
                bannerLine.append(pattern[line]).append(" ");
            }
            System.out.println(bannerLine.toString());
        }
    }

    /**
     * Main entry point of the application.
     */
    public static void main(String[] args) {
        HashMap<Character, String[]> charMap = createCharacterMap();
        String message = "OOPS";
        displayBanner(message, charMap);
    }
}
