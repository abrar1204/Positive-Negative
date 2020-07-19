// PositiveNegative.java

import java.util.Scanner; // importing Scanner class to get user input

public class PositiveNegative
{
  public static void main( String[] args )
  {
    Scanner s = new Scanner( System.in );
    
    int number; // number given by user
    
    System.out.println("Enter an integer: ");
    number = s.nextInt(); // setting user number
    
    if ( number > 0 ) // positive
    {
      System.out.println( "You have a postive number!" );
    }
    else if ( number < 0 ) // negative
    {
      System.out.println( "You have a negative number!" );
    }
    else
    {
      System.out.println( "0 is a boring number." );
    }
  }
}