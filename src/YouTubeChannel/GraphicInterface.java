package YouTubeChannel;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GraphicInterface {
    public static void main(String[] args) {
        // a+b
        JFrame window = new JFrame("a+b");
        window.setBounds(15, 15, 500, 500);
        window.setLayout(null); // менеджер разметки

        // поля для ввода
        JTextField a_Field = new JTextField("");
        JTextField b_Field = new JTextField("");
        a_Field.setBounds(5, 5, 150, 50);
        b_Field.setBounds(5, 65, 150, 50);
        window.add(a_Field);
        window.add(b_Field);

        // кнопка
        JButton button = new JButton("Cумма");
        button.setBounds(5, 125, 150, 50);
        button.setBackground(Color.BLACK);
        button.setForeground(Color.GREEN);
        window.add(button);

        // надпись
        JLabel label = new JLabel("здесь будет сумма");
        label.setBounds(5, 185, 150, 50);
        window.add(label);

        // listener слушатель обработчик нажатия на кнопку
        ActionListener actionListener = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int a = 0, b = 0;
                boolean a_ok = false, b_ok = false;

                try {
                    a = Integer.parseInt(a_Field.getText());
                    a_ok = true;
                } catch (Exception err) {
                    JOptionPane.showMessageDialog(null,
                            "В поле введено некорректное значение");
                }
                ;

                try {
                    b = Integer.parseInt(b_Field.getText());
                    b_ok = true;
                } catch (Exception err) {
                    JOptionPane.showMessageDialog(null,
                            "В поле введено некорректное значение");
                }
                ;
                if(a_ok && b_ok) label.setText(a+b+"");
                else label.setText("сложение не удалось");
//                label.setText(a + b + "");
            }
        };
        button.addActionListener(actionListener);

        window.setVisible(true);
    }
}
