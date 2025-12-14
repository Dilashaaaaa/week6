
/**
 * Write a description of class senario here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class senario
{
    public static void main(String[] args)
    
{
  String [] categories={"Nepali","Fiction"};
  String [][] title=new String[2][2];// row index 0,1//column index 0,1
  double [][] price=new double[2][2];
title[0][0]="Asahamati";
price[0][0]=600.00;
title[1][0]="harry potter";
price[1][0]=750.50;
title[0][1]="sani";
price[0][1]=89.00;
title[1][1]="wimpy kid ";
price[1][1]=350.25;
for (int i = 0; i < categories.length; i++) {
            System.out.println("Category: " + categories[i]);
             for (int j = 0; j < 2; j++) {
                    System.out.println("Title: " + title[i][j] + ", Price: Rs. " + String.format("%.2f", price[i][j]));
        }
    }
}
}