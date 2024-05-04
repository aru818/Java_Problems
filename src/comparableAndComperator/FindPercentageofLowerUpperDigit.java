package comparableAndComperator;

public class FindPercentageofLowerUpperDigit {
	public static void findPercentage(String str) {
		int upperCase = 0;
		int lowerCase = 0;
		int digit = 0;
		int alphabate = 0;
		int n = str.length();

		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			if (Character.isAlphabetic(ch)) {
				alphabate++;
			}
			if (Character.isLowerCase(ch)) {
				lowerCase++;
			}
			if (Character.isUpperCase(ch)) {
				upperCase++;
			}
			if (Character.isDigit(ch)) {
				digit++;
			}

		}
		int alphatePercante = (alphabate * 100) / n;
		int lowerPercantage = (lowerCase * 100) / n;
		int upperPercantage = (upperCase * 100) / n;
		int digitPercantage = (digit * 100) / n;

		System.out.println("alphabate percantage: " + alphatePercante);
		System.out.println("digit percantage: " + digitPercantage);
		System.out.println("upper percantage: " + upperPercantage);
		System.out.println("lower percantage: " + lowerPercantage);
		

	}

	public static void main(String[] args) {
		findPercentage("Mera Bharat Mahan 1");
	}
}
