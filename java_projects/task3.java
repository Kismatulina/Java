/** Задача 3. Подсчет суммы цифр числа
Напишите метод sumDigits, который принимает целое число n и возвращает
сумму его цифр.
*/

public class task3 {
    public int sumDigits(int n) {
        
        int sum = 0;
        while (n != 0) { //3.while для того, чтобы повторять операции с числами, пока само число не станет равно 0. В каждой итерации добавляйте последнюю цифру числа к сумме.
            sum += n % 10; //1.остатка от деления- n % 10 вернет последнюю цифру числа n.
            n /= 10; //2.После того как вы получили последнюю цифру числа, вам нужно удалить эту цифру из числа.
        }
        return sum;
    }
}
        // Не удаляйте этот класс - он нужен для вывода результатов на экран и проверки
class Printer {
    public static void main(String[] args) {
        int n = 12345;

        if (args.length > 0) {
            n = Integer.parseInt(args[0]);
        }
        // Вывод результата на экран
        task3 ans = new task3();
        int itresume_res = ans.sumDigits(n);
        System.out.println(itresume_res);
    }
} 
    

