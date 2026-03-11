/**
 * OOPSBannerApp UC5 - Render OOPS as Banner using Inline Array Initialization
 *
 * Each character is represented in 7 lines, width = 9 characters.
 * We use String.join() to concatenate the patterns for O, O, P, S side by side.
 * The array is defined and populated inline, then printed using a loop.
 */

public class ArrayInitialization {
    public static void main(String[] args) {
        // Inline initialization of banner lines
        String[] lines = {
            String.join(" ", "   *****  ", "   *****  ", "  ******  ", "   *****  "),
            String.join(" ", "  *     * ", "  *     * ", "  *     * ", "  *       "),
            String.join(" ", "  *     * ", "  *     * ", "  *     * ", "  *       "),
            String.join(" ", "  *     * ", "  *     * ", "  ******  ", "   *****  "),
            String.join(" ", "  *     * ", "  *     * ", "  *       ", "       *  "),
            String.join(" ", "  *     * ", "  *     * ", "  *       ", "       *  "),
            String.join(" ", "   *****  ", "   *****  ", "  *       ", "   *****  ")
        };

        // Print each line using a loop
        for (String line : lines) {
            System.out.println(line);
        }
    }
}
