//Java: знакомство и как использовать базовый API. Обучение в записи
//Урок 3. Лекция: Почему вы не можете не использовать API
/**public class program {
    public static void main(String[] args) {
        String str = " ";
        for (int i = 0; i < 1_000_000; i++){
            str += "+"; 
        //var s = System.currentTimeMillis();
        //StringBuilder sb = new StringBuilder();
        //for (int i = 0; i  < 1_000_000; i++){
        //    sb.append( "+");
        }
        //System.out.println(System.currentTimeMillis() - s);
        System.out.println(str);
        //System.out.println(sb);
    }
} // не срабатывает
*/
import java.io.File;
public class fileSystemDemo {
    public static void main(String [] args) {
        String pathProject = System.getProperty ("user.dir");
        String pathFile = pathProject.concat ("/file.txt");
        File f3 = new File (pathFile);
        System.out.println (f3.getAbsolutePath());
// /Users/sk/vscode/java_projects/file.txt
// C:/Users/Sk/Documents/xxx/brainexplosion/java/file.txt
    }
}
//D:\Обучение IT аналитик\2 ГОД ОБУЧЕНИЯ\1 блок Java знакомство и как использовать базовый API\Lesson_java1\file.txt
//PS D:\Обучение IT аналитик\2 ГОД ОБУЧЕНИЯ\1 блок Java знакомство и как использовать базовый API\Lesson_java1> 
 