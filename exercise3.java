import java.io.* ;

class NearlyZero {

  public static void main ( String[] args ) {
    int [] data = {3, 1, 5, 7, 4, 12, -3, 8, -2};
    int close = data[0];

    for (int index = 0; index < data.length; index ++) {
      int num = data[index];
      if (Math.abs(num - 0) < close) {
        close = num;
      }
    }
    System.out.println(close);
  }
}