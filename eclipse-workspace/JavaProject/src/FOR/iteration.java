package FOR;

public class iteration {

	public static void main(String[] args) {

		int[] arrayNum = { 13, 54, 76, 34, 23, 75, 97, 34, 76 };
		int total = 0;
		for (int i : arrayNum) {
			total += i;
		}
		System.out.printf("soma total dos elementos de arrayNum: %d\n", total);
	}
}
