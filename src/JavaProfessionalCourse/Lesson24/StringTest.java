package JavaProfessionalCourse.Lesson24;

/**
 * @author Rustam Khakov
 */
public class StringTest {
	public static void main(String[] args) {
		String str = "test";
		StringBuilder tmpRes = new StringBuilder(str);
		//StringBuffer
		long before = System.currentTimeMillis();
		for (int i = 0; i < 10_000; i++) {
			//str = str + i;//test0 test01  test012 ...
			tmpRes.append(i);
		}
		System.out.println(tmpRes.toString());
		System.out.println(System.currentTimeMillis() - before);
	}
}
