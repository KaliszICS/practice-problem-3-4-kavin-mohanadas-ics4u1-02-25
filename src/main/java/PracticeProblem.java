public class PracticeProblem {

	public static void main(String args[]) {

	}

	public static int[] recaman(int n) {
		if (n <= 0) {
		return new int[0];
		}

		int[] seq = new int[n + 1];
		seq[0] = 0;
		recamanHelper(seq, 1, n);

		int[] result = new int[n];
		for(int i = 1; i <= n; i++) {
		result[i-1] = seq[i];
		}
	return result;

	}

	private static void recamanHelper(int[] seq, int i, int n) {
		if (i>n) {
			return;
		}
		int prev = seq[i - 1];
		int candidate = prev - i;

		if(candidate > 0 && !contains(seq, i, candidate)) {
			seq[i] = candidate;
		}
		else {
			seq[i] = prev + i;
		}
		recamanHelper(seq, i+1, n);

	}

	private static boolean contains(int[] seq, int i, int candidate) {
		for (int k = 0; k < i; k++) {
			if(seq[k] == candidate) {
				return true;
			}
		}
		return false;
	}

	}




