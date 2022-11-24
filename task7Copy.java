// Метод copyValueOf() в Java имеет две различные формы:

// public static String copyValueOf(char[] data)
//  – возвращает строку, которая представляет собой 
//  последовательность символов в заданном массиве.

// public static String copyValueOf(char[] data, int offset, int count) 
// – возвращает строку, которая представляет собой 
// последовательность символов в заданном массиве.

public class task7Copy {
    /**
     * @param args
     */
    public static void main(String args[]) {
        char[] Str1 = {'г', 'д', 'е', ' ', 'д', 'е', 'т', 'о', 'н', 'а', 'т', 'о', 'р', '?'};
        String Str2 = "";
  
        Str2 = String.copyValueOf(Str1);
        System.out.println("Возвращаемая строка: " + Str2);
  
        Str2 = String.copyValueOf(Str1, 2, 6);
        System.out.println("Возвращаемая строка: " + Str2);
     } 
}
