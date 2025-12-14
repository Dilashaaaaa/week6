
/**
 * Write a description of class que7 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class que7
{
    public class SeatingChart {
    public static void main(String[] args) {

        String[][] seats = new String[2][3];

        // First row filled with names
        seats[0][0] = "Aayush";
        seats[0][1] = "Sita";
        seats[0][2] = "Ravi";
        // Second row left empty (null)
        // Print seating chart
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j++) {

                if (seats[i][j] == null || seats[i][j].equals("")) {
                    System.out.print("[empty] ");
                } else {
                    System.out.print("  seats[i][j] +  ");
                }
            }
            System.out.println();
        }
    }
}
}
