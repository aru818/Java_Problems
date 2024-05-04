package codingQuestionArray;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CompareTwoList{
	public static void filteredSkills(List<String> jd, List<String> cv) {
		List<String> filteredSkillList = new ArrayList<>();
		for (String jdStr : jd) {
			for (String cvStr : cv) {

				if (jdStr.contains(cvStr)) {

					filteredSkillList.add(jdStr);
				}

			}

		}

		for (String skillsNotFound : filteredSkillList) {

			System.out.println(skillsNotFound);
		}

	}

	public static void main(String[] args) {
		List<String> jd = Arrays.asList("avs", "bcd","mpq");
		List<String> cv = Arrays.asList("avs", "abc","mpq");
		filteredSkills(jd, cv);
	}
}
