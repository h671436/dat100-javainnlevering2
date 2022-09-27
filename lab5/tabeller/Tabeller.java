package no.hvl.dat100.lab5.tabeller;

public class Tabeller {

	// a)
	public static void skrivUt(int[] tabell) {
		String txt = "[";
		
		for (int i = 0; i < tabell.length; i++) {
			if ( i != tabell.length - 1) {
				txt += tabell[i] + ", ";
			} else {
				txt += tabell[i];
			}
		}
		
		txt += "]";
		
		System.out.println(txt);

	}

	// b)
	public static String tilStreng(int[] tabell) {
		String txt = "[";
		
		for (int i = 0; i < tabell.length; i++) {
			if ( i != tabell.length - 1) {
				txt += tabell[i] + ",";
			} else {
				txt += tabell[i];
			}
		}
		txt += "]";
		
		return txt;

	}

	// c)
	public static int summer(int[] tabell) {
		int sum = 0;

		// for-løkke
		for (int i = 0; i < tabell.length; i++) {
			sum += tabell[i];
		}
		
		// while-løkke
		sum = 0;
		int i = 0;
		while ( i < tabell.length) {
			sum += tabell[i];
			i++;
		}
		
		// utvidet for-løkke
		sum = 0;
		for (int x : tabell) {
			sum += x;
		}
		
		
		return sum;
	}

	// d)
	public static boolean finnesTall(int[] tabell, int tall) {
		int i = 0;
		boolean finnes = false;
		int num = 0;
		
		if (tabell.length == 0) {
			return finnes;
		}
		
		do {
			num = tabell[i];
			if ( num == tall) {
				return !finnes;
			}
			i++;
		} while ( num != tall && i < tabell.length);
		
		return finnes;
	}

	// e)
	public static int posisjonTall(int[] tabell, int tall) {
		int i = 0;
		int num = 0;
		
		if (tabell.length == 0) {
			i = -1;
			return i;
		}
		
		do {
			num = tabell[i];
			if ( num == tall) {
				return i;
			}
			i++;
		} while ( num != tall && i < tabell.length);
		
		i = -1;
		return i;
	}

	// f)
	public static int[] reverser(int[] tabell) {
		int indexLen = tabell.length;
		int index = 0;
		int[] reverser = new int[indexLen];
		
		for (int i = indexLen - 1; i >= 0; i--) {
			reverser[i] = tabell[index];
			index++;
		}
		
		return reverser;
	}

	// g)
	public static boolean erSortert(int[] tabell) {
		boolean sort = true;
		int temp = -1000;
		
		for (int i : tabell) {
			if (i > temp) {
				sort = true;
			} else {
				sort = false;
			}
			temp = i;
		}
		
		return sort;
	}

	// h)
	public static int[] settSammen(int[] tabell1, int[] tabell2) {
		
		if (tabell1.length == 0) {
			return tabell2;
		}
		
		if (tabell2.length == 0) {
			return tabell1;
		}
		
		int index = tabell1.length + tabell2.length;
		int[] sammen = new int[index];
		
		for (int i = 0; i < tabell1.length; i++) {
			sammen[i] = tabell1[i];
		}
		
		for (int i = 0; i < tabell2.length; i++) {
			int in = i + tabell1.length;
			sammen[in] = tabell2[i];
		}
		
		return sammen;
	}
}
