package JavaProfessionalCourse.Lesson24_Regex;

import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;

/**
 * @author Rustam Khakov
 */
public class ChannelTest {
	public static void main(String[] args) {
		try (RandomAccessFile file = new RandomAccessFile(new File("matchResults.txt"), "rw")) {
			file.seek(4);
			file.write('&');
			file.read();
			file.seek(2);
			file.write('%');
			file.getChannel();
		} catch (IOException e) {
			throw new RuntimeException(e);
		}
	}
}
