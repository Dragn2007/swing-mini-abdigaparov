swing-mini-abdigaparov 

проект-3 угадай число
программа загадывает число от 1 до 100
люди водят число нажимает кнопку
программа отвечает больше. меньше. или угадали и показывает количество попыток

import javax.swing.*; библиотека для окон и кнопок
import java.awt.event.*; библиотека для событий (нажатия и ввод)
import java.util.Random; чтобы генерировать случайное число

frame.setSize(300, 200); ето размер окна
frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); а тут при нажатий на крестик должно звкрыться окно
JFrame.EXIT_ON_CLOSE с етой частью кода говорить закрыть окно 

JLabel label = new JLabel("введите число от 1 до 100:");
показывает текст в окне которую мы уже написали 

JTextField field = new JTextField(10);
создаётся объект поля ввода длиной примерно на 10 символов
JButton button = new JButton("проверить"); ето кнопка 
и снизу надпис для результатов
JLabel result = new JLabel("попробуйте угадать!");

        panel.add(label);
        panel.add(field);
        panel.add(button);
        panel.add(result);

тут добавляем все в панель
frame.add(panel); а тут уже панель добавим в окно

Random random = new Random();
int secret = random.nextInt(100) + 1;
final int[] tries = {0}; тут у нас случайное число будет генерироваться 

Показываем окно Если поставить false, окно спрячется
frame.setVisible(true);
.