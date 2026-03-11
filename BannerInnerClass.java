/**
 * OOPSBannerApp UC7 - Store Character Pattern in a Class
 *
 * This use case extends UC6 by implementing a CharacterPatternMap class to encapsulate
 * character-to-pattern mappings. The application retrieves and displays the "OOPS"
 * banner using these mappings. This approach enhances code organization and modularity.
 */

public class BannerInnerClass {

    // Inner class to store character and its pattern
    static class CharacterPatternMap {
        private final Character character;
        private final String[] pattern;

        public CharacterPatternMap(Character character, String[] pattern) {
            this.character = character;
            this.pattern = pattern;
        }

        public Character getCharacter() {
            return character;
        }

        public String[] getPattern() {
            return pattern;
        }

        // Static method to create pattern maps for O, P, S and space
        public static CharacterPatternMap[] createCharacterPatternMaps() {
            return new CharacterPatternMap[] {
                new CharacterPatternMap('O', new String[] {
                    "   *****  ",
                    "  *     * ",
                    "  *     * ",
                    "  *     * ",
                    "  *     * ",
                    "  *     * ",
                    "   *****  "
                }),
                new CharacterPatternMap('P', new String[] {
                    "  ******  ",
                    "  *     * ",
                    "  *     * ",
                    "  ******  ",
                    "  *       ",
                    "  *       ",
                    "  *       "
                }),
                new CharacterPatternMap('S', new String[] {
                    "   *****  ",
                    "  *       ",
                    "  *       ",
                    "   *****  ",
                    "        * ",
                    "        * ",
                    "   *****  "
                }),
                new CharacterPatternMap(' ', new String[] {
                    "          ",
                    "          ",
                    "          ",
                    "          ",
                    "          ",
                    "          ",
                    "          "
                })
            };
        }

        // Static method to retrieve pattern for a character
        public static String[] getCharacterPattern(char ch, CharacterPatternMap[] charMaps) {
            for (CharacterPatternMap map : charMaps) {
                if (map.getCharacter() == ch) {
                    return map.getPattern();
                }
            }
            // If not found, return space pattern
            return getCharacterPattern(' ', charMaps);
        }

        // Static method to print a message as a banner
        public static void printMessage(String message, CharacterPatternMap[] charMaps) {
            for (int i = 0; i < 7; i++) {
                String line = "";
                for (char ch : message.toCharArray()) {
                    line += getCharacterPattern(ch, charMaps)[i] + " ";
                }
                System.out.println(line);
            }
        }
    }

    // Main method
    public static void main(String[] args) {
        CharacterPatternMap[] charMaps = CharacterPatternMap.createCharacterPatternMaps();
        CharacterPatternMap.printMessage("OOPS", charMaps);
    }
}

