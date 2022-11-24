// Метод equalsIgnoreCase() – сравнивает данную строку 
// с другой строкой, игнорируя регистр. Две строки 
// считаются равными, если они имеют одинаковую 
// длину и соответствующие символы у двух строк 
// равны, игнорируя регистр букв.

public class task11equals {
    public static void main(String args[]) {
        String Str1 = "Съешь ещё этих мягких французских булок";
        String Str2 = Str1;
        String Str3 = new String("Да выпей чаю");
        String Str4 = new String("СЪЕШЬ ЕЩЁ ЭТИХ МЯГКИХ ФРАНЦУЗСКИХ БУЛОК");
        boolean retVal;
  
        retVal = Str1.equalsIgnoreCase(Str2);
        System.out.println("Строка Str1 равна строке Str2?\nОтвет: " + retVal );
  
        retVal = Str1.equalsIgnoreCase(Str3);
        System.out.println("Строка Str1 равна строке Str3?\nОтвет: " + retVal );
        
        retVal = Str1.equalsIgnoreCase(Str4);
        System.out.println("Строка Str1 равна строке Str4?\nОтвет: " + retVal );
     }
}
