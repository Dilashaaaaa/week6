
/**
 * Write a description of class QUE6 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class QUE6
{
    public static void main(String[] args)
    {
    int [][] marks= {{80,90},{70,75}};
     for (int i = 0; i < marks.length; i++) 
     {
    System.out.println("Student " + (i + 1) +  " Nepali: " + marks[i][0] + " English: " + marks[i][1]);
     }
     for (int i = 0; i < 2; i++) {
            int totalmarks = marks[i][0] + marks[i][1];
            System.out.println("Total of Student " + (i + 1) + ": " + totalmarks);
        }
    
    }
}