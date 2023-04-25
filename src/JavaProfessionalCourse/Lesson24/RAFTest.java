package JavaProfessionalCourse.Lesson24;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

/**
 * @author Rustam Khakov
 */
public class RAFTest {
	public static void main(String[] args) {
		try(RandomAccessFile file = new RandomAccessFile(new File("matchResults.txt"), "rw")) {
			file.seek(4);
			file.write('&');
			file.read();
			file.seek(2);
			file.write('%');
		} catch (IOException e) {
			throw new RuntimeException(e);
		}
	}
}
