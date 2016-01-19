import java.io.* ;
import java.util.Scanner ;

class CoffeeAverage1 {

	public static void main ( String[] args ) {
		Scanner scan = new Scanner( System.in );
		int amount = scan.nextInt();
		double num;
		double[] data = new double[amount];
		double sum = 0;

		for (int j = 0; j < amount; j++) {
			num = scan.nextDouble();
			System.out.println("data[ " + j + " ] = " + num);
			data[j] = num;
			sum += num;
		}
		double avg = sum / amount;
		System.out.println("average: " + avg);

		double far = data[0];
		for (int j = 0; j < data.length; j++) {
			if (Math.abs(data[j] - avg) > Math.abs(far - avg)) {
				far = data[j];
			}
		}
		System.out.println("most distant value: " + far);
		System.out.println("new average: " + (sum - far) / (amount - 1));
	}
}