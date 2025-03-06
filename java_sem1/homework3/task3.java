// Задача 3. Реализовать простой калькулятор


public class task3 {
    public static void main(String[] args) {
        int a = 5;
        int b = 7;
        System.out.println(a + b); //12
        System.out.print(a * b); //35
    }
}






/** Задача 3. Подсчет суммы цифр числа
Напишите метод sumDigits, который принимает целое число n и возвращает
сумму его цифр.


public class task3 {
    public int sumDigits(int n) {
        
        int sum = 0;
        while (n != 0) { //3.while для того, чтобы повторять операции с числами, пока само число не станет равно 0. В каждой итерации добавляйте последнюю цифру числа к сумме.
            sum += n % 10; //1.остаток от деления- n % 10 вернет последнюю цифру числа n.
            n /= 10; //2.После того как вы получили последнюю цифру числа, вам нужно удалить эту цифру из числа.
        }
        return sum;
    }
}
        // класс - для вывода результатов на экран и проверки
class Printer {
    public static void main(String[] args) {
        int n = 12345;

        if (args.length > 0) {
            n = Integer.parseInt(args[0]);
        }
        // Вывод результата на экран
        task3 ans = new task3();
        int itresume_res = ans.sumDigits(n);
        System.out.println(itresume_res); //15
    }
} 
 */ 


// 2 способ:
/** 
import java.util.Scanner;
public class task3 { // почему меняет название?
    public static void main(String[] args) {
        int sum = 0, i = 0;
        while (i < 100)
        {
            i++;
            if (i % 3 == 0)
                continue;
            sum += i;
        }
        System.out.println(sum); //3367
    }
}
*/
