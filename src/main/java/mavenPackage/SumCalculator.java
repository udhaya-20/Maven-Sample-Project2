package mavenPackage;

public class SumCalculator {

    public int sum(int a, int b) {
        return a + b;
    }

    public static void main(String[] args) {

        String[] pattern = {
            "------------------*******-------------------"
            "****   *****  *    *   *****   ****   ***** ",
            "*   *  *      *    *   *   *   *   *  *     ",
            "*   *  *      *    *   *   *   *   *  *     ",
            "*   *  *****  *    *   *   *   ****   ***** ",
            "*   *  *      *   *    *   *   *          * ",
            "*   *  *       * *     *   *   *          * ",
            "****   *****    *      *****   *      ***** "
        };

        for (String line : pattern) {
            System.out.println(line);
        }
    }
}

