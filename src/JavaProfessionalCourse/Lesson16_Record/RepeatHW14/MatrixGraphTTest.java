package JavaProfessionalCourse.Lesson16_Record.RepeatHW14;

/**
 * @author Rustam Khakov
 */
public class MatrixGraphTTest {
	public static void main(String[] args) {
		MatrixGraph graph = new MatrixGraph(new int[][]{{0,0,1},{1,0,0},{1,0,0}});
//		graph.printBfs();
		System.out.println(graph.howManyAdjustmentComponents());
	}
}
