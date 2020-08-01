import java.util.Scanner;

public class PosNeg
{
  public static void main( String[] args)
  {
    Scanner s = new Scanner (System.in);
    {
      int interger;
      
      System.out.println("Enter your interger please: ");
      interger = s.nextInt();
    
      if (interger > 0) 
       {
      System.out.println( "You have a postive number!" );
    }
    else if ( interger < 0 ) // negative
    {
      System.out.println( "You have a negative number!" );
    }
    else
    {
      System.out.println( "0 is an uninteresing number." );
    }
                         }
  }
}

  
