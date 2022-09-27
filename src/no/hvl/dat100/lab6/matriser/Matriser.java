package no.hvl.dat100.lab6.matriser;

public class Matriser {

	// a)
	public static void skrivUt(int[][] matrise) {
		int big = 0;
		
		// only works for positive numbers
		for (int[] x : matrise) {
			for (int k : x) {
				if (k > big) {
					big = k;
				}
			}
		}
		
		for (int[] x : matrise) {
			for (int k : x) {
				// space on the left side and just one space in between each number
				int filler = len(big) - len(k);
				System.out.print(" ".repeat(filler) + k + " ");
				// space all on the right side
				/*
				int filler = len(big) - len(k) + 1;
				System.out.print(k + " ".repeat(filler); 
				*/
			}
			System.out.println();
		}
	}

	private static int len(int x) {
		// submethod for skrivUt to make it look better with spacing
		int len = 0;
		
		while (x != 0) {
			x /= 10;
			len++;
		}
		
		return len;
	}

	// b)
	public static String tilStreng(int[][] matrise) {
		String msg = "";
		
		// this only looks good with 1 digit
		for (int[] x : matrise) {
			for (int k : x ) {
				msg += k + " ";
			}
			
			msg += "\n";
		}
		
		return msg;
	}

	// c)
	public static int[][] skaler(int tall, int[][] matrise) {
		int[][] multimatrise = new int[matrise.length][matrise[0].length]; // are all the list the same length???
	
		for (int x = 0; x < matrise.length; x++) {
			for (int i = 0; i < matrise[x].length; i++) {
				multimatrise[x][i] = matrise[x][i] * tall;
			}
		}
		
		return multimatrise;
	}

	// d)
	public static boolean erLik(int[][] a, int[][] b) {
		boolean erlik = true;
		
		if (a.length != b.length) {
			return !erlik;
		}
		
		for (int i = 0; i < a.length; i++) {
			if (a[i].length != b[i].length) {
				return !erlik;
			}
		}
		
		for (int i = 0; i < a.length; i++) {
			for (int x = 0; x < a[0].length; x++) {
				if (a[i][x] != b[i][x]) {
					return !erlik;
				}
			}
		}
		
		return erlik;
	}
	
	// e)
	public static int[][] speile(int[][] matrise) {
		int [][] speile = new int[matrise.length][matrise[0].length];

		for (int i = 0; i < matrise.length; i++) {
			for (int x = 0; x < matrise.length; x++) {
				speile[i][x] = matrise[x][i];
			}
		}
		
		return speile;
	}

	// f)
	public static int[][] multipliser(int[][] a, int[][] b) {
		
		if (a.length != b[0].length) {
			return null;
		}
		
		int[][] multi = new int[a.length][b[0].length];
		
		for (int x  = 0; x < multi.length; x++) {
			int[] rowa = a[x];
			int[] columb = new int[b.length];
			
			for (int k = 0; k < b[0].length; k++) { // row * colums
				int sum = 0;
				int indexb = 0;
				
				for (int i = 0; i < b.length; i++) { // create colum
					columb[i] = b[i][k];
				}
				
				for (int l : rowa) {
					sum += l * columb[indexb];
					indexb++;
				}
				
				multi[x][k] = sum;
			}
		}
		
		return multi;
	}
}
