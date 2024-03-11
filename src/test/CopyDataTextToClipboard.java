package test;

import java.awt.*;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;

public class CopyDataTextToClipboard {
    public static void main(String[] args) {
        // Получаем текущую дату
        String currentDate = java.time.LocalDate.now().toString();

        // Создаем обект буфера обмена
        Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
        StringSelection selection = new StringSelection(currentDate);
        clipboard.setContents(selection, null);

        System.out.println("Текущая дата " + currentDate);
    }
}