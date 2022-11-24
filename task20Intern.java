// Метод intern() – возвращает каноническое представление 
// для строкового объекта. Отсюда следует, что для 
// любых двух строк s и t, s.intern() == t.intern(), 
// истинно тогда и только тогда, когда s.equals(t) 
// имеет значение true.

public class task20Intern {
    public static void main(String args[]){
        String Str1 = new String("Съешь ещё этих мягких французских булок");
        String Str2 = new String("СЪЕШЬ ЕЩЁ ЭТИХ МЯГКИХ ФРАНЦУЗСКИХ БУЛОК");
  
        System.out.print("Каноническое представление Str1: " );
        System.out.println(Str1.intern());
  
        System.out.print("Каноническое представление Str2: " );
        System.out.println(Str2.intern());
     } 
}
