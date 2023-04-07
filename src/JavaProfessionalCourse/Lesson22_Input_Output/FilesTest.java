package JavaProfessionalCourse.Lesson22_Input_Output;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;
import java.util.List;
import java.util.stream.Collectors;

public class FilesTest {
    public static void main(String[] args) throws IOException {
//        File file = new File("");
        // file.toPath()
        ;
        Files.lines(Path.of("names.txt")).forEach(System.out::println);

        List<String> winners = Files.lines(Path.of("names.txt"))
                .map(MatchResult::new)
                .map(MatchResult::getWinner)
                .collect(Collectors.toList());

        Files.write(Path.of("matchResults.txt"), winners, StandardOpenOption.WRITE, StandardOpenOption.CREATE);
    }
}
