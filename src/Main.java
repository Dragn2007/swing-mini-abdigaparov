//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.

import javax.swing.*;
import java.awt.event.*;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        JFrame frame = new JFrame("угадай число");
        frame.setSize(300, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel();
        JLabel label = new JLabel("введите число от 1 до 100:");
        JTextField field = new JTextField(10);
        JButton button = new JButton("проверить");
        JLabel result = new JLabel("попробуйте угадать!");

        panel.add(label);
        panel.add(field);
        panel.add(button);
        panel.add(result);

        frame.add(panel);


        Random random = new Random();
        int secret = random.nextInt(100) + 1;
        final int[] tries = {0};
        // тут у нас обработка кнопки и сама логика игры и чтобы строго написал число
        button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String text = field.getText();
                try {
                    int guess = Integer.parseInt(text);
                    tries[0]++;

                    if (guess < secret) {
                        result.setText("загаданное число больше");
                    } else if (guess > secret) {
                        result.setText("загаданное число меньше");
                    } else {
                        result.setText("угадали за " + tries[0] + " попыток");
                    }
                } catch (NumberFormatException ex) {
                    result.setText("нужно ввести число!");
                }
            }
        });
        frame.setVisible(true); // етот код открывает окно Если поставить false, окно спрячется
    }
}
