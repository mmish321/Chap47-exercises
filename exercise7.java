import java.io.* ;
import java.util.Scanner ;

class CoffeeAverage2 {

	public static void main ( String[] args ) {
		Scanner scan = new Scanner( System.in );
		int amount = scan.nextInt();
		double [] data = new double[amount];
		double sum = 0;

		for (int j = 0; j < amount; j++) {
			double x = scan.nextDouble();
			data[j] = x;
			sum += x;
		}
		double avg1 = sum / amount;
		double far1 = data[0];

		for (int j = 0; j < data.length; j++) {
			double x = data[j];

			if (Math.abs(x - avg1) > Math.abs(far1 - avg1)) {
				far1 = x;
			}
		}
		double avg2 = (sum - far1) / (amount - 1);
		far1 = data[0];
		double far2 = data[1];

		for (int j = 0; j < data.length; j++) {
			double x = data[j];

			if (Math.abs(x - avg2) > Math.abs(far1 - avg2)) {
				far1 = x;
			} else if (Math.abs(x - avg2) > Math.abs(far2 - avg2)) {
				far2 = x;
			}
		}
		double avg3 = (sum - far1 - far2) / (amount - 2);
		far1 = data[0];
		far2 = data[1];
		double far3 = data[2];

		for (int j = 0; j < data.length; j++) {
			double x = data[j];

			if (Math.abs(x - avg3) > Math.abs(far1 - avg3)) {
				far1 = x;
			} else if (Math.abs(x - avg3) > Math.abs(far2 - avg3)) {
				far2 = x;
			} else if (Math.abs(x - avg3) > Math.abs(far3 - avg3)) {
				far3 = x;
			}
		}
		double avg4 = (sum - far1 - far2 - far3) / (amount - 3);

		System.out.println("A1: " + avg1);
		System.out.println("A2: " + avg2);
		System.out.println("A3: " + avg3);
		System.out.println("A4: " + avg4);
	}
}