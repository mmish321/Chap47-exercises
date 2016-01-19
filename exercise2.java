import java.io.* ;

class TwoLargest
{

  public static void main ( String[] args )  
  {
    int[] data = {3, 1, 5, 7, 4, 12, -3, 8, -2};
    int max = 0;
    int max2 = 0;
    
    
    // compute the two largest
    for ( int index= 0; index < data.length; index++)
    { int num = data[index];
      if (num > max) {
       max = num;
      }
      else if (num < max && num > max2 ) {
        max2 = num;
      }

    }
      
    // write out the two largest
    System.out.println("The two largest are " + max + "," + max2  );

  }
}      