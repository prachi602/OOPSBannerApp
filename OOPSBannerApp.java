/*
 * OOPS Banner App - UC4
 *
 * Goal:
 * Store banner lines inside a String array
 * and print them using a loop instead of
 * multiple System.out.println() statements.
 *
 * Key Concepts:
 * - String Array
 * - Array Creation & Population
 * - String.join()
 * - Enhanced For Loop
 * - Code Modularity
 */

public class OOPSBannerApp {

    public static void main(String[] args) {

        // Display Title
        System.out.println("OOPS Banner App - UC4\n");

        /*
         * Step 1: Create a String array to store
         * all 7 lines of the OOPS banner.
         */
        String[] banner = new String[7];

        /*
         * Step 2: Populate each array element
         * using String.join() instead of + operator.
         * Each line represents:
         * O  O  P  S
         */

        // Line 1
        banner[0] = String.join(" ",
                "  *****  ",   // O
                "  *****  ",   // O
                "  ****** ",   // P
                "  ****** "    // S
        );

        // Line 2
        banner[1] = String.join(" ",
                " **     **",
                " **     **",
                " **     **",
                " **     **"
        );

        // Line 3
        banner[2] = String.join(" ",
                " **     **",
                " **     **",
                " **     **",
                " **      "
        );

        // Line 4
        banner[3] = String.join(" ",
                " **     **",
                " **     **",
                " ******  ",
                "  *****  "
        );

        // Line 5
        banner[4] = String.join(" ",
                " **     **",
                " **     **",
                " **       ",
                "       ** "
        );

        // Line 6
        banner[5] = String.join(" ",
                " **     **",
                " **     **",
                " **       ",
                " **     **"
        );

        // Line 7
        banner[6] = String.join(" ",
                "  *****  ",
                "  *****  ",
                " **       ",
                "  *****  "
        );


        /*
         * Step 3: Use Enhanced For Loop
         * to print each line of the banner.
         * This removes repetitive print statements.
         */
        for (String line : banner) {
            System.out.println(line);
        }
    }
