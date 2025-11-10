// Computes an approximation of PI.
public class CalcPi {
	public static void main(String [] args) { 
		int terms = Integer.parseInt(args[0]);
		double piApprox = 0.0;
		for (int k = 0; k < terms; k++) {
			if (k % 2 == 0) {
				piApprox += 1.0 / (2 * k + 1);
			} else {
				piApprox -= 1.0 / (2 * k + 1);
			}
		}
		piApprox *= 4.0;
		System.out.println("pi according to Java: " + Math.PI);
		System.out.println("pi, approximated:     " + piApprox);	
	   
	}
}
