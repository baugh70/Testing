

import java.util.Scanner;

public class Main
{
  public static void main(String[] args)
  {
    Scanner scan = new Scanner(System.in);
    
    int i = 0;
    int x = 0;
    int y = 100;
    while(i <= 3)
    {
      System.out.println("Please input an integer less than 100");
      x = scan.nextInt();
      
      if(x < y)
        y = x;
      
      i++;
    }
    
    System.out.println("The smallest number that you inputted was " + y);
  }
  
}
