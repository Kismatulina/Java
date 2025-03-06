/** Java: знакомство и как использовать базовый API. Обучение в записи
Семинар 2: Знакомство с языком программирования Java


package ru.gb.jseminar;
import java.time.LocalDateTime;



public class SimpleClass {
    public static void main(String[] args) {
        System.out.println(LocalDateTime.now());
    } 

   
}
*/
/**
// Задание 1. Написать программу , которая запросит Имя в консоли. Получит введенную строку и выведит сообщение Привет, Имя!
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.next();
        String out = new String( "original: Привет, %s");
        System.out.printf(out,s); // original: Привет, Lyudmila, ругалась на original:, поставила кавычку до оригинала 
    }  
}
*/
/**
// Задание 2.В консоли запросить имя пользователя. В зависимости от текущего времени, вывести приветствие вида
// "Доброе утро, <Имя>!", если время от 05:00 до 11:59
// "Добрый день, <Имя>!", если время от 12:00 до 17:59;
// "Добрый вечер, <Имя>!", если время от 18:00 до 22:59;
// "Доброй ночи, <Имя>!", если время от 23:00 до 4:59 
/**
import java.time.LocalDateTime;
import java.util.Scanner;
/**
public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.next();

        LocalDateTime dateTime = LocalDateTime.now();
        int i = dateTime.getHour();

        String temp = "";
        if (i >= 5 && < 12) {   // ругается на знак >=
            temp = "Доброе утро";
            
        }
        if (i >= 12 && < 18) {
            temp = "Добрый день";
            
        }
        if (i >= 18 && < 23) {
            temp = "Добрый вечер";
            
        }
        if (i < 5 || i == 23) {
            temp = "Доброй ночи";
            
        }
        System.out.println(temp + "," + s);
    }
}
*/
//Задание 3. Дан массив двоичных чисел, например [1,1,0,1,1,1], вывести максимальное количество подряд идущих 1.
/** 
public class Main {

    public static void main(String[] args) {
        int[] array = {0, 1, 1, 1, 1, 1};

        int counter = 0;
        int max = 0;
        for(int i: array){
            if (i == 1){
                counter++;
            }
            if (i == 0){
                if (counter != 0){
                    if (max < counter){
                        max = counter;
                    }
                    counter = 0;
                }
            }
        }
        if (counter != 0){
            if (max < counter){
                max = counter;
            }
        }
        System.out.println(max);
    }
}
*/
/**
// Задание №4 Во фразе "Добро пожаловать на курс по Java" переставить слова в обратном порядке.
public class Main {
    public static void main(String[] args) {
        String s = "Добро пожаловать на курс по Java";
        String[] array = s.split(" ");
        for(int i = array.length -1; i >= 0; i--){
            System.out.print(array[i] + " "); // просто print надо - Java по курс на пожаловать Добро 

        }    
    }
}
*/


//Задание №5 Реализовать функцию возведения числа а в степень b. a, b из Z.
// Пример 1: а = 3, b = 2, ответ: 9
// Пример 2: а = 2, b = -2, ответ: 0.25 // получилось 1
// Пример 3: а = 3, b = 0, ответ: 1 //возведение числа в ноль равно 1
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();

//        int result = 1;
//        for(int i = 1; i <= b; i++){
//            result = result * a;
//        }
//        System.out.println(result);

//другой способ с методом Math: 

        double c = Math.pow(a, b);
        System.out.print(c); // 3 3=27
    }

}


