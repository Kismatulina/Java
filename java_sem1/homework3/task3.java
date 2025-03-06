// Задача 3. Реализовать простой калькулятор


public class task3 {
    public static void main(String[] args) {
        int a = 5;
        int b = 7;
        System.out.println(a + b); //12
        System.out.print(a * b); //35
    }
}



class Calculator {
    public double calculate(char op, int a, int b) {
        switch (op) {
            case '+':
                return a + b;
            case '-':
                return a - b;
            case '*':
                return a * b;
            case '/':
                if (b != 0) {
                    return (double) a / b;
                } else {
                    throw new ArithmeticException("Деление на ноль");
                }
            default:
                throw new IllegalArgumentException("Некорректный оператор: '" + op + "'");
        }
    }
}

// Не удаляйте этот класс - он нужен для вывода результатов на экран и проверки
class Printer {
    public static void main(String[] args) {
        int a = 0;
        char op = ' ';
        int b = 0;

        if (args.length == 0) {
            // При отправке кода на Выполнение, вы можете варьировать эти параметры
            a = 3;
            op = '+';
            b = 7;
        } else {
            try {
                a = Integer.parseInt(args[0]);
                op = args[1].charAt(0);
                b = Integer.parseInt(args[2]);
            } catch (NumberFormatException e) {
                System.out.println("Неверный формат числа");
                return;
            }
        }

        Calculator calculator = new Calculator();
        try {
            double result = calculator.calculate(op, a, b);
            System.out.println(result);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        } catch (ArithmeticException e) {
            System.out.println("Ошибка арифметической операции: " + e.getMessage());
        }
    }
}
 // 10 

//(дополнительное задание 4.) Задано уравнение вида q + w = e, q, w, e >= 0. Некоторые цифры могут быть
//заменены знаком вопроса, например 2? + ?5 = 69. Требуется восстановить выражение до верного
//равенства. Предложить хотя бы одно решение или сообщить, что его нет. (Не решила)