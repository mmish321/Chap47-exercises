import java.io.* ;

class ReverserVersion1 {

  public static void main ( String[] args ) {
    int[] data = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14};
    int length = 0;
    if (data.length % 2 == 0) {
      length = data.length / 2;
    } else {
      length = (data.length - 1) / 2;
    }

    for ( int j = 0; j < length; j++) {
      int num = data[j];
      data[j] = data[data.length - j - 1];
      data[data.length - j - 1] = num;
    }
    for ( int j = 0; j < data.length; j++) {
      System.out.println(data[j]);
    }
  }
}

class ReverserVersion2 {

  public static void main ( String[] args ) {
    int[] data = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14};
    int[] result = new int[data.length];

    for ( int j = 0; j < data.length; j++) {
      result[j] = data[data.length - j - 1];
    }
    for ( int j = 0; j < data.length; j++) {
      System.out.println(result[j]);
    }
  }
}