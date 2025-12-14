
/**
 * Write a description of class tut6 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class tut6
{
    public static void main(String[] args)
    {
    int[] age; //declaring an array
    age = new int[5];//construct
    System.out.println(age.length);
    
    age[0]=10;//initializing an array elements
    age[1]=20;
    age[2]=30;
    age[3]=40;
    age[4]=50;
    
    int firstElement=age[0];//accessing in array element
    System.out.println(firstElement);
    int lastElement=age[4];
    System.out.print(lastElement);
    
    
    //iterating/travesing
    int[] arg ={10,20,30,40,50};
    for(int i=0;i< arg.length;i++)
    {
        System.out.println(arg[i]);    
    }
    
    

    //reverse
    int[] agr ={10,20,30,40,50};
    for(int i=agr.length-1;i>=0;i--)
    {
        System.out.println(agr[i]);    
    }
    
    //sum
    int[] arr ={10,20,30,40,50};
    int sum=0;
    for(int j=0;j<arr.length;j++)
    {
    sum=sum+age[j];
    
    }
    System.out.println(sum);
    
    }
}