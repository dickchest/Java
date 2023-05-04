package JavaProfessionalCourse.Lesson24_Regex;

/**
 * @author Rustam Khakov
 */
public class Child extends Parent {
	static String s = "test";

	static {
		System.out.println("2. static Children " + s);
	}


	private int n=2;
	{
		System.out.println("4.0 - Parent non static block");
	}
	public Child() {

	}

	public Child(String s) {
		System.out.println("4.1 Constructor child");
	}
}
