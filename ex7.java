package ex;

public class ex7 {

	public static void main(String[] args) {
		String arr[] = { "a", "vida", "é", "bela" };
		String finalPhrase = "";
		for (int i = arr.length - 1; i > -1; i--) {
			finalPhrase = finalPhrase + " " + arr[i];
		}
		System.out.println(finalPhrase.toUpperCase());
	}

}
