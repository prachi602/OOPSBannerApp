// UC4-BannerApp-Array_Loop
// Each character is 7 lines tall, 9 characters wide
// Using String.join() to build each line, stored in an array, then printed with a loop

public class ArraysLoops {
    public static void main(String[] args) {
        // Define an array with 7 lines
        String lines[] = new String[7];

        // Populate each line using String.join()
        lines[0] = String.join("  ", "  ***  ", "  ***  ", "******", "  ****");
        lines[1] = String.join("  ", "**   **", "**   **", "**  **", "**    ");
        lines[2] = String.join("  ", "**   **", "**   **", "**  **", "**    ");
        lines[3] = String.join("  ", "**   **", "**   **", "******", "******");
        lines[4] = String.join("  ", "**   **", "**   **", "**    ", "    **");
        lines[5] = String.join("  ", "**   **", "**   **", "**    ", "    **");
        lines[6] = String.join("  ", "  ***  ", "  ***  ", "**    ", "****  ");

        // Print each line using a for-each loop
        for (String line : lines) {
            System.out.println(line);
        }
    }
}
