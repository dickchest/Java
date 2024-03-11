package test;

import java.awt.*;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.DataFlavor;

public class ClipboardViewer {
    public static void main(String[] args) {
        // проверяем операционную систему
        String osName = System.getProperty("os.name").toLowerCase();
        if (!osName.contains("win")) {
            System.out.println("Это приложение поддерживается только в среде виндовс");
            return;
        }

        // Создаем графическое окно
        Frame frame = new Frame("Clipboard Viewer");
        TextArea textArea = new TextArea();
        frame.add(textArea);
        frame.setSize(400, 300);
        frame.setVisible(true);

        // Получаем доступ к буферу обмена
        Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();

        // Создаем обьект слушателя для отслеживания изменений в буфере обмена
        clipboard.addFlavorListener(e -> {
            try {
                // Получаем текст из буфера обмена
                String clipboardText = (String) clipboard.getData(DataFlavor.stringFlavor);
                // Отображаем текст в текстовом окне
                textArea.setText(clipboardText);
            } catch (Exception ex) {
                ex.printStackTrace();
            }
        });

        // Изначально отображаем содержание буфера обмена
        try {
            String initialClipboard = (String) clipboard.getData(DataFlavor.stringFlavor);
            textArea.setText(initialClipboard);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
