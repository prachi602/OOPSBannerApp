// OOPS Banner App
// Each character is 7 lines tall, 9 characters wide
// Printing using System.out.println() and String.join()

public class Bannerusingstringjoin {
    public static void main(String[] args) {
        // Define each line of the banner using String.join()
        System.out.println(String.join("  ", "  ***  ", "******", "******", "  ****"));
        System.out.println(String.join("  ", "**   **", "**  **", "**  **", "**    "));
        System.out.println(String.join("  ", "**   **", "**  **", "**  **", "**    "));
        System.out.println(String.join("  ", "**   **", "******", "******", "******"));
        System.out.println(String.join("  ", "**   **", "**    ", "**    ", "    **"));
        System.out.println(String.join("  ", "**   **", "**    ", "**    ", "    **"));
        System.out.println(String.join("  ", "  ***  " ,"**    ", "**    ", "******"));
    }
}
