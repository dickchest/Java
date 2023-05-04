package JavaProfessionalCourse.Lesson24_Regex;

/**
 * @author Rustam Khakov
 */
public class Parent {


	static {
		System.out.println("1. static Parent");
	}

	private int n=1;
	{
		System.out.println("3.0 - Parent non static block");
	}
	public Parent() {
		System.out.println("3.1 Parent Constructor" + n);
	}
}
