package JavaProfessionalCourse.Lesson22_Input_Output;

import com.sun.security.jgss.GSSUtil;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;

public class FileTest {
    public static void main(String[] args) throws IOException {
        File file = new File("names.txt");
//        file.createNewFile();
        System.out.println(file.getName());
        System.out.println(file.getPath());
        System.out.println(file.getAbsolutePath());
        File src = new File("C:\\Temp\\java_project\\HomeWork1\\Lesson3\\src");
        System.out.println(src.getAbsolutePath());
        System.out.println(file.getName());

        System.out.println(src.isFile());
        System.out.println(src.isHidden());
        System.out.println(src.isDirectory());

        File git= new File(".git");
        System.out.println("git file");
        System.out.println(git.isHidden());

        System.out.println();

        //
        System.out.println(git.canExecute());

        System.out.println(file.length());
        System.out.println(src.length()); // это не вес, а вложенных папок
        System.out.println(file.lastModified()); // в миллисекундах
        System.out.println(Arrays.toString(src.list()));
        System.out.println(Arrays.toString(src.listFiles()));
        System.out.println(file.getParentFile());


        String javaProfFolder = file.getParent();
        String path = "name" + File.separator + "test" + File.separator + "petya";
        File testFolder = new File(javaProfFolder, "test");
        testFolder.mkdir();
        File petyaFolder = new File(javaProfFolder, path);
        petyaFolder.mkdirs();

    }
}
