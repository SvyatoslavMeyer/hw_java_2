// Метод trim() – возвращает копию строки 
// с пропущенными начальными и конечными 
// пробелами, другими словами метод позволяет 
// в Java удалить пробелы в начале и конце строки.

public class task45Trim {
    public static void main(String args[]){
        String Str = new String("   Съешь ещё этих мягких   ");
  
        System.out.print("Возвращаемое значение: ");
        System.out.println(Str.trim());
     } 
}
