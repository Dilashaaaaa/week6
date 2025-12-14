import java.util.Scanner;

/**
 * Write a description of class que4 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class que4
{
    public static void main(String[] args)
    {
    int[]score={10,20,30,40,50};
    
    for(int i=0;i<score.length;i++)    
    {
        System.out.println(score[i]);
    }
    int sum=0;
    for(int j=0;j<score.length;j++)    
    {
        sum=sum+score[j];
    }
    System.out.println(sum);
    
    int avg=0;
    for(int k=0;k<score.length;k++)
    {
   avg=sum/score.length;
    }
System.out.println(avg);
int highest=score[0];
int lowest = score[0];
for(int l=0;l<score.length;l++)  
{
if (score[l]>highest)
{
highest=score[l];
}
if (score[l]<lowest)
{
lowest=score[l];
}
System.out.println("Highest="+highest);
System.out.println("Lowest="+lowest);
}

     Scanner scan=new Scanner(System.in);
     System.out.println("enter subject");
     int subject=scan.nextInt();  
     int []arr=new int[subject];
     for(int m=0;m<subject;m++)
     {
     System.out.println("Enter score for subject");
     int value=scan.nextInt();
     arr[m]=value;
    }
for(int n=0;n< subject;n++)
{
System.out.println(arr[n]);
}
}
}

    
    