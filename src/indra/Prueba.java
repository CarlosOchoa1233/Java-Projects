package indra;

import java.io.*;
import java.util.*;
import java.util.function.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

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
