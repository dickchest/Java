package JavaProfessionalCourse.Lesson24;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author Rustam Khakov
 */
public class IpAddressTest {
	public static void main(String[] args) {
		Pattern pattern = Pattern.compile("([0,1]?\\d{0,2}|2[0-4]\\d|25[0-5]\\.){3}([0,1]?\\d{0,2}|2[0-4]\\d|25[0-5])");
		String ip = "256.0.0.1";// 0 - 200 200-250  250-255    13
		Matcher matcher = pattern.matcher(ip);
		System.out.println(matcher.find());

	}
}
