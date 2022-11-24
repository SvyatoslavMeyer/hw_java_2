// Метод length() – возвращает длину строки 
// в Java. Длина равна числу 16-разрядных 
// символов Юникода в строке.

public class task25Length {
    public static void main(String args[]){
        String Str1 = new String("Съешь ещё этих мягких французских булок");
        String Str2 = new String("Да выпей чаю" );
  
        System.out.print("Длина строки \"" + Str1 + "\" - " );
        System.out.println(Str1.length());
  
        System.out.print("Длина строки \"" + Str2 + "\" - " );
        System.out.println(Str2.length());
     }
}




