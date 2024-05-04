package codingQuestionString;

public class SplitByChar2 {
	public static void main(String[] args) {
		String str = "utm_campaign=null,utm_term=null,utm_term= null,ip=180.151.80.125,"
				+ "ref_id=29092023_37081,ref_id2=290923ALL437081,creative_id=,utm_source=null";

		String[] split = str.split(",");
		for (String s : split) {

			String[] split2 = s.split("=");

			if (split2.length == 2) {

				String a = split2[0];
				String b = split2[1];
				System.out.println("key is " + a + "::" + "value is " + b);

			} else {
				System.out.println("invalid value pair" + split2);
			}
		}

	}

}
