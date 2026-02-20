/*
 * OOPS Banner App - UC3
 * 
 * Goal:
 * Render "OOPS" in banner format using String.join()
 * instead of + operator for better memory efficiency.
 * 
 * Key Concepts:
 * - String.join()
 * - String Immutability
 * - Memory Efficiency
 * - Refactoring
 */

public class OOPSBannerApp {

    public static void main(String[] args) {

        // Display Title
        System.out.println("OOPS Banner App - UC3\n");

        /*
         * Each letter (O, O, P, S) is represented in 7-line format.
         * Each line is constructed using String.join(" ", ...)
         * to avoid using + operator for concatenation.
         */

        // Line 1 of O O P S
        String line1 = String.join(" ",
                "  *****  ",   // O
                "  *****  ",   // O
                "  ****** ",   // P
                "  ****** "    // S
        );

        // Line 2
        String line2 = String.join(" ",
                " **     **",  // O
                " **     **",  // O
                " **     **",  // P
                " **     **"   // S
        );

        // Line 3
        String line3 = String.join(" ",
                " **     **",  // O
                " **     **",  // O
                " **     **",  // P
                " **      "    // S
        );

        // Line 4
        String line4 = String.join(" ",
                " **     **",  // O
                " **     **",  // O
                " ******  ",   // P
                "  *****  "    // S
        );

        // Line 5
        String line5 = String.join(" ",
                " **     **",  // O
                " **     **",  // O
                " **       ",  // P
                "       ** "   // S
        );

        // Line 6
        String line6 = String.join(" ",
                " **     **",  // O
                " **     **",  // O
                " **       ",  // P
                " **     **"   // S
        );

        // Line 7
        String line7 = String.join(" ",
                "  *****  ",   // O
                "  *****  ",   // O
                " **       ",  // P
                "  *****  "    // S
        );

        // Printing all 7 lines to form the banner
        System.out.println(line1);
        System.out.println(line2);
        System.out.println(line3);
        System.out.println(line4);
        System.out.println(line5);
        System.out.println(line6);
        System.out.println(line7);
}
}