package indra;

import java.util.*;

public class MySort implements Comparator<Integer>{
	public int compare(Integer x, Integer y) {
		return y.compareTo(x);
	}
}