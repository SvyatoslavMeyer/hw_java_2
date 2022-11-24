// Метод substring() в Java имеет два варианта 
// и возвращает новую строку, которая является 
// подстрокой данной строки. Подстрока начинается 
// с символа, заданного индексом, и продолжается 
// до конца данной строки или до endIndex-1, если 
// введен второй аргумент.

public class task37SubStr {
    public static void main(String args[]){
        String Str = new String("Съешь ещё этих мягких французских булок");
  
        System.out.print("Возвращаемое значение: ");
        System.out.println(Str.substring(0));
  
        System.out.print("Возвращаемое значение: ");
        System.out.println(Str.substring(6, 14));
     }  
}
