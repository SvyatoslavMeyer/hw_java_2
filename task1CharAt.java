// Метод charAt() – возвращает символ, расположенный 
// по указанному индексу строки. Индексы строк в 
// Java начинаются с нуля.

public class task1CharAt {
    public static void main(String args[]) {
        String s = "У попа была собака, он ёё любил!";
        char result1 = s.charAt(3);
        char result2 = s.charAt(8);
        System.out.println("Третий символ строки - " + result1);
        System.out.println("Восьмой символ строки - " + result2);
     }
}
