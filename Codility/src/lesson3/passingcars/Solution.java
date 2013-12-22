package lesson3.passingcars;

class Solution {
	public int solution(int[] A) {
		int eastCars = 0;
		int passingCars = 0;

		for (int i = 0; i < A.length; i++) {
			if (A[i] == 1) {
				passingCars += eastCars;
			} else {
				eastCars++;
			}
		}

		// passingCars becomes negative when it's bigger than Integer.MAX_VALUE
		if (passingCars > 1e9 || passingCars < 0) {
			return -1;
		}

		return passingCars;
	}
}
