import java.util.Scanner;

/**
 * Write a description of class que5 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class que5
{
    public static void main(String[] args)
    {
        
        String[]dname={"Morang", "Kathmandu","Kaski", "Sindhuli"};
        System.out.println("district name");
        for (int i = 0; i < dname.length; i++) {
            System.out.println((i + 1) + "." + dname[i]);
        }
        Scanner scan = new Scanner(System.in);
        // Read the number of districts
     System.out.println("enter number of district");
     int dis=scan.nextInt();  
     String []arr=new String[dis];
     for(int m=0;m<dis;m++)
     {
     System.out.println("Enter district name ");
     String name=scan.next();
     arr[m]=name;
    }
for(int n=0;n< dis;n++)
{
System.out.println(arr[n]);
}
        
    }
}