import java.util.ArrayList;
import java.util.List;

public class Contest1 {

	public static List<String> splitString(String str, char esc) {
		List<String> strfinal = new ArrayList<String>();

		// Your Logic goes here

		String str1 = "";
		for(char ch: str.toCharArray()) {
			if(ch == esc) {
				strfinal.add(str1);
				str1 = "";
				continue;
			}
			str1 += ch;
		}

		if(!(str1.equals(""))) {
			strfinal.add(str1);
		}

		return strfinal;
	}

	public static void main(String[] args) {
		String str2 = "My name is 'Shalini Soumya' I am in 2nd year of B.E in Information Science in 'JSS Academy of Technical Education, Bengaluru' ";

		List<String> strfinal = splitString(str2, '\'');

		for (String a : strfinal) {
			System.out.println(a);
		}
	}
}
