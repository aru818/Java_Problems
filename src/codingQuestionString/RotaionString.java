package codingQuestionString;

public class RotaionString {

	public String rotate(String str1) {

		String str2 = str1 + str1;
		String rotated = "";
		char[] arr1 = str1.toCharArray();
		
		char[] arr2 = str2.toCharArray();
		
		
		
		for (int i = arr1.length / 2; i <= arr2.length - ((arr1.length / 2) + 1); i++) {
			System.out.print(arr2[i]);
		}
		String st = String.valueOf(arr2);
		return rotated + st;
	}

	public static void main(String[] args) {

		RotaionString rs = new RotaionString();
		rs.rotate("ABCDEFGH");

	}
}
//ABCDEF
//DEFABC
//ABCDEFABCDEF