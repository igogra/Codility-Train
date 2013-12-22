package lesson3.genomicrangequery;

class Solution {
	public int[] solution(String S, int[] P, int[] Q) {
		int N = S.length();
		int[][] DNAsequence = new int[N][4];

		for (int i = 0; i < N; i++) {
			char nucleotide = S.charAt(i);
			switch (nucleotide) {
			case 'A':
				DNAsequence[i][0] = 1;
				break;
			case 'C':
				DNAsequence[i][1] = 2;
				break;
			case 'G':
				DNAsequence[i][2] = 3;
				break;
			case 'T':
				DNAsequence[i][3] = 4;
				break;
			}
		}

		for (int i = 1; i < N; i++) {
			for (int j = 0; j < 4; j++) {
				DNAsequence[i][j] += DNAsequence[i - 1][j];
			}
		}

		int M = P.length;
		int[] minNucleotides = new int[M];

		for (int i = 0; i < M; i++) {
			int x = P[i];
			int y = Q[i];

			for (int j = 0; j < 4; j++) {
				int subSequence = 0;
				if (x - 1 >= 0)
					subSequence = DNAsequence[x - 1][j];
				if (DNAsequence[y][j] - subSequence > 0) {
					minNucleotides[i] = j + 1;
					break;
				}
			}

		}
		
		return minNucleotides;
	}
}
