package JavaProfessionalCourseHomeWork.HomeWork22;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.util.Arrays;
import java.util.Scanner;

/*
Уровень 2
Напишите свой терминал в самом начале нужно ввести имя папки куда нужно попасть, терминал должен поддерживать следующие команды:
cd
cd .. - перейти к родителю
cd <имя папки> - перейти в папку
ls
ls - распечатать содержимое текущей папки
ls test - распечатать содержимое папки test(которая находится внутри этой папки)
mkdir
mkdir test - создаст папку test
nano
nano test.txt - создаст файл test.txt
rm <file/folder name> - удалить файл
pwd - возвращает абсолютный путь текущей папки Создайте 2 папки(test1, test2), провалитесь в одну из них напишите текущую папку, создайте там 2 файла и 1 папку, распечатайте содержимое папки перейдите в родительскую папку и распечатайте содержимое папки test1, удалите папку test1 и test2
Задачи доп уровня(необязательно их делать, но было бы круто реализовать)
mv <from> <to> - переместить (либо переименовать) файл
ls -la - распечатать с правами доступа (hrwx )
r- можно читать
w- можно писать
x -можно выполнять
h - если скрытый
chmod <mode> <filename> - дать права файлу (не будем делать как в линуксе с числами от 0 до 7 - там логики чуть больше), сделаем проще
r- можно читать
w- можно писать
x -можно выполнять
h - если скрытый
 */
public class MyTerminal {

    void run() throws IOException {
        Scanner scanner = new Scanner(System.in);
        String where2Go = scanner.nextLine();
        File currentFile = new File(where2Go);
        if (!currentFile.isDirectory()) {
            throw new RuntimeException("Неверная директория");
        }
        String currentCommand;
        do {
            currentCommand = scanner.nextLine();
            currentFile = executeCommand(currentCommand, currentFile);
        } while (!currentCommand.startsWith("exit"));
//        System.out.println(currentFile);
    }

    private File executeCommand(String currentCommand, File currentFile) throws IOException {
        String[] commandArgs = currentCommand.split(" ");
        switch (commandArgs[0]) {
            case "pwd" -> {
                System.out.println(currentFile.getAbsolutePath());
            }
            case "cd" -> {
                if (commandArgs[1].equals("..")) {
                    return currentFile.getParentFile();
                } else {
//                    return new File(currentFile.getAbsolutePath() + File.separator + commandArgs[1]);
                    return currentFile.toPath().resolve(commandArgs[1]).toFile();
//                    return Arrays.stream(currentFile.listFiles())
//                            .filter(f -> f.getName().equals(commandArgs[1]))
//                            .findFirst()
//                            .orElse(null);
                }
            }
            case "ls" -> {
                if (commandArgs.length == 1) {
                    Arrays.stream(currentFile.list()).forEach(System.out::println);
                } else if (commandArgs[1].equals("-la")) {
                    Files.list(currentFile.toPath())
                            .map(file->getPermission(file.toFile()) + " " + file.getFileName())
                            .forEach(System.out::println);
                } else {
                    Files.list(currentFile.toPath().resolve(commandArgs[1]))
                            .map(v -> v.getFileName())
                            .forEach(System.out::println);
                }
//                System.out.println(Arrays.toString(currentFile.list()));
//                return currentFile;
            }
            case "mkdir" -> {
                Files.createDirectory(currentFile.toPath().resolve(commandArgs[1]));
            }
            case "nano" -> {
                Files.createFile(currentFile.toPath().resolve(commandArgs[1]));
            }
            case "rm" -> {
                Files.delete(currentFile.toPath().resolve(commandArgs[1]));
            }
            case "mv" -> {
                Files.move(currentFile.toPath().resolve(commandArgs[1]), currentFile.toPath().resolve(commandArgs[2]));
            }
            case "chmod" -> {
                setPermission(currentFile, commandArgs[1], commandArgs[2]);
            }


        }
        return currentFile;
    }

    private void setPermission(File currentFile, String mode, String file) throws IOException {
        File fileToSet = new File(currentFile, file);
        boolean readable = mode.contains("r");
        boolean writable = mode.contains("w");
        boolean executable = mode.contains("x");
        boolean hidden = mode.contains("h");
        fileToSet.setReadable(readable);
        fileToSet.setWritable(writable);
        fileToSet.setExecutable(executable);
        Files.setAttribute(currentFile.toPath().resolve(file), "dos:hidden", hidden, LinkOption.NOFOLLOW_LINKS);
    }

    private String getPermission(File file) {
        String permission = "";
        if (file.canRead()) {
            permission += "r";
        }
        if (file.canWrite()) {
            permission += "w";
        }
        if (file.canExecute()) {
            permission += "x";
        }
        if (file.isHidden()) {
            permission += "h";
        }
        return permission;
    }


    public static void main(String[] args) throws IOException {
        MyTerminal myTerminal = new MyTerminal();
        myTerminal.run();
    }
}
