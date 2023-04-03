package example;

public class EX01 {
    public static void main(String[] args) {
        System.out.println("1.");
        System.out.println("*   *     **     ****    ****    *   *        /////  ");
        System.out.println("*   *    *  *    *   *   *   *   *   *       | o o | ");
        System.out.println("*****   *    *   ****    ****     * *       (|  ^  |)");
        System.out.println("*   *   ******   *   *   *   *     *         | [_] | ");
        System.out.println("*   *   *    *   *    *  *    *    *          -----  ");
        System.out.println("                                                     ");
        System.out.println("                                                     ");
        System.out.println("              +---+              ");
        System.out.println("              |   |              ");
        System.out.println("          +---+---+              ");
        System.out.println("          |   |   |              ");
        System.out.println("      +---+---+---+      /\\_/\\      -----  ");
        System.out.println("      |   |   |   |     ( ' ' )   / Hello \\ ");
        System.out.println("  +---+---+---+---+     (  -  )  <  Junior |");
        System.out.println("  |   |   |   |   |      | | |    \\ Coder!/");
        System.out.println("  +---+---+---+---+     (__|__)     -----   ");

        System.out.println("2.");
        int suju = 3000;
        int sujunum = 2;
        int chicken = 12000;
        int chickennum = 1;
        int total = suju*sujunum + chicken*chickennum;
        double tex = total * 0.1;
        double sum = total - tex;
        int input = 50000;
        int change = input - total;
        System.out.println(" [ 음식나라 ] ");
        System.out.print(" --------------------- ");
        System.out.printf("\n 소주\t\t%d\t\t%5d",sujunum,suju*sujunum);
        System.out.printf("\n 너나치킨\t %d\t\t%5d",chickennum,chicken);
        System.out.print("\n ---------------------");
        System.out.printf("\n 과세합계\t\t\t%5.0f", sum);
        System.out.printf("\n 부가세\t\t\t\t%5.0f", tex);
        System.out.print("\n --------------------- ");
        System.out.printf("\n 총합계\t\t\t\t%d",total);
        System.out.printf("\n 받은금액\t\t\t%d",input);
        System.out.printf("\n 잔돈\t\t\t\t%d",change);
        System.out.print("\n --------------------- ");
        System.out.println("\n 2023. 04. 03\t 14:35:24");
    }
}
