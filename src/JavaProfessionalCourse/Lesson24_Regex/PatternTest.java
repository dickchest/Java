package JavaProfessionalCourse.Lesson24_Regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author Rustam Khakov
 */
public class PatternTest {
	public static void main(String[] args) {
//		Pattern pattern = Pattern.compile("A.+?a");
//		System.out.println(pattern.pattern());
//		Matcher matcher = pattern.matcher("test Anna Alexa Abbav");
//		while (matcher.find()) {
//			System.out.println(matcher.start());
//			System.out.println(matcher.group());
//		}
		// ip ->

		String strPattern = "(?<key>test\\d?):(?<value>\\w+)";
		Pattern pattern2 = Pattern.compile(strPattern);
		System.out.println(pattern2.pattern());
		Matcher matcher2 = pattern2.matcher("test:Vasya, test2:Vasy, test3:Vaa, test:BBB");
		System.out.println(matcher2.matches());

		while (matcher2.find()) {
//			System.out.println(matcher2.start());
			//System.out.println(matcher2.group());
			System.out.println(matcher2.group("value"));

		}
		System.out.println("test-tet-ttt-y".matches("t.*"));
		// 1 входные данные валидация
		// 123 123 123
		// 3-333-444
		String numberRegex = "(\\d{1,3}[\\s-]?){2}\\d{1,3}";
		System.out.println("123 123 123".matches(numberRegex));
		System.out.println("3-333-444".matches(numberRegex));
		System.out.println("3a-333-444".matches(numberRegex));
		System.out.println("3-333-444-555".matches(numberRegex));


	}
}
