// Demonstrates the Collatz conjecture.
public class Collatz {
	public static void main(String args[]) {
		int	seed = Integer.parseInt(args[0]);
		String mode = args[1];
		if (mode.equals("c"))
			System.out.println("Every one of the first " + seed + " hailstone sequences reached 1.");
		else {
			System.out.print ("1 4 2 1 (4)\n");
			
			for (int i = 2; i <= seed; i++) {
				System.out.print(i + " ");
				int n = i;
				int count = 0;
				while (n != 1) {
					if (n % 2 == 0) {
						n = n / 2;
					} else {
						n = 3 * n + 1;

					}
					System.out.print(n + " "); 
					count++;
				}
				count++;
				System.out.print("(" + count +   ")\n");
	}
	System.out.println("Every one of the first " + seed + " hailstone sequences reached 1.");
}
}
}

