/**Java: знакомство и как использовать базовый API. Обучение в записи
 Семинар 1: Знакомство с языком программирования Java
 * Задание №1
📌 Написать программу, которая запросит пользователя ввести
<Имя> в консоли.
📌 Получит введенную строку и выведет в консоль сообщение
“Привет, <Имя>!” 
 */ 

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.next();
        String out = new String( "original: Привет, %s");
        System.out.printf(out,s); // original: Привет, Lyudmila, ругалась на original:, поставила кавычку до оригинала 
    }  
}
