package indra;

import java.util.*;

public class Prueba {
	public static void main(String[] args) {
		Integer[] primes = {2, 7, 5, 3};
		MySort ms = new MySort();
		Arrays.sort(primes, ms);
		for (Integer p2 : primes) {
			System.out.print(p2+" ");
		}
	}
}
