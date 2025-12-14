import java.util.Scanner;

/**
 * Write a description of class que3 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class que3
{
    public static void main(String[] args)
    {
    String [] names = {"saroj","sushant","sabina","saroj","rabina"};
    for(int i=0;i<names.length;i++)
    {
        System.out.println(names[i]);
    }
    System.out.println(names[2]);
    //change index
    names[4]="Dilasha";
for(int i=0;i<names.length;i++)
    {
        System.out.println(names[i]);
    }    
    //using scanner
     Scanner scan=new Scanner(System.in);
     System.out.println("enter index");
    int idx=scan.nextInt();   
    scan.nextLine();
    System.out.println("Enter name");
    String value=scan.next();
    names[idx]=value;
    for(int i=0;i<names.length;i++)
    {
        System.out.println(names[i]);
    }    
    
    
    
    
    }
}