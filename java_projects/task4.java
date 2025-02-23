/** Задача 4*. Нахождение максимального из трех чисел
Реализуйте две функции:
1. Функция findMaxOfTwo должна принимать два числа и возвращать
максимальное из них, используя только знак сравнения.
2. Функция findMaxOfThree должна принимать три числа и находить
максимальное из них, используя первую функцию.
 

public class task4 { 
    public static void main(String[] args) {
            int i = 123;
        System.out.println(Integer.MAX_VALUE); //2147483647
    }
}
*/

public class task4 {
    
        // Функция для нахождения максимума из двух чисел
    public int findMaxOfTwo(int a, int b) {
        return (a > b) ? a : b; //если a больше b, функция должна вернуть a, иначе — b. В Java можно использовать тернарный оператор (? :), чтобы компактно записать
//условие сравнения. Тернарный оператор работает как сокращенная форма записи if-else и отлично подходит для возврата максимального значения между двумя числами 
        }
        
        // Функция для нахождения максимума из трех чисел
    public int findMaxOfThree(int a, int b, int c) {
        
        return findMaxOfTwo(findMaxOfTwo(a, b), c); // Сначала находим максимум между a и b, а затем сравниваем его с третьей "c"
    }
}
    
// класс - он нужен для вывода результатов на экран и проверки
/**
class Printer {
    public static void main(String[] args) {
        int a = 5, b = 10, c = 3;
        
        if (args.length == 3) {
            a = Integer.parseInt(args[0]);
            b = Integer.parseInt(args[1]);
            c = Integer.parseInt(args[2]);
        }
        // Вывод результата на экран
        task4 ans = new task4();
        int itresume_res = ans.findMaxOfThree(a, b, c);
        System.out.println(itresume_res); //15
    }
}
*/
/**
class Printer {
    public static void main(String[] args) {
        int a = 7, b = 7, c = 7;
        
        if (args.length == 3) {
            a = Integer.parseInt(args[0]);
            b = Integer.parseInt(args[1]);
            c = Integer.parseInt(args[2]);
        }
        // Вывод результата на экран
        task4 ans = new task4();
        int itresume_res = ans.findMaxOfThree(a, b, c);
        System.out.println(itresume_res); //15?
    }
}
*/

class Printer {
    public static void main(String[] args) {
        int a = 12, b = 4, c = 9;
        
        if (args.length == 3) {
            a = Integer.parseInt(args[0]);
            b = Integer.parseInt(args[1]);
            c = Integer.parseInt(args[2]);
        }
        // Вывод результата на экран
        task4 ans = new task4();
        int itresume_res = ans.findMaxOfThree(a, b, c);
        System.out.println(itresume_res); //15?
    }
}
