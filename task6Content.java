// Метод contentEquals() – возвращает значение true 
// только в том случае, если эта строка представляет 
// собой ту же последовательность символов, которая 
// указана в строке буфера (StringBuffer).

public class task6Content {
    public static void main(String args[]) {
        String str1 = "Съешь ещё этих мягких французских булок";
        String str2 = "Да выпей чаю";
        StringBuffer str3 = new StringBuffer("Съешь ещё этих мягких французских булок");
        StringBuffer str4 = new StringBuffer("Да выпей пиво");
  
        boolean  result = str1.contentEquals(str3);
        System.out.println("Строка \""+ str1 + "\" равна строке буфера \""+ str3 + "\"? \n" + result);
        
        result = str2.contentEquals(str3);
        System.out.println("Строка \""+ str2 + "\" равна строке буфера \""+ str4 + "\"? \n" + result);
        
        result = str1.contentEquals(str4);
        System.out.println("Строка \""+ str1 + "\" равна строке буфера \""+ str4 + "\"? \n" + result);
     }
}
