/**Задание 1. Нахождение факториала числа
Напишите метод factorial, который принимает число n и возвращает его
факториал. Если число n < 0, метод должен вернуть -1.
  */
/**
public class task1 {
    public int factorial(int n) {   
        if (n < 0) {
            return -1; //Если n отрицательное, метод должен разу возвращать -1, так как факториал отрицательного числа не определен
        }
        int result = 1;
        for (int i = 2; i <= n; i++) { //цикл for для умножения всех чисел от 1 до n и возвращения результата.
            result *= i;
        }
        return result;
    }
}
        //класс Printer для вывода результатов на экран и проверки
class printer {
    public static void main(String[] args) {
        int n = 5;
        if (args.length > 0) {
            n = Integer.parseInt(args[0]); 
        }
        // Вывод результата на экран /переменная, которую вы будете обновлять на каждом шаге цикла.
        task1 ans = new task1();
        int itresume_res = ans.factorial(n);
        System.out.println(itresume_res); // 5!=5×4×3×2×1=120
    }
}   

*/
