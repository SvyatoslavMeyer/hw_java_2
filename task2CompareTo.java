// Метод compareTo() в Java структурирован двумя вариантами. 
// Первый: метод сравнивает строку с другим объектом, а второй: 
// метод лексически сравнивает две строки.

public class task2CompareTo {
    public static void main(String args[]) {
        String str1 = "О-о, макси-класс твоя Сила!.. Но дело пахнет керосина.";
        String str2 = "О-о, макси-класс твоя Сила!.. Но дело пахнет керосина.";
        String str3 = "Вы многому научились, молодой Скайуокер.";
  
        int result = str1.compareTo(str2);
        System.out.println(result);
        
        result = str2.compareTo(str3);
        System.out.println(result);
       
        result = str3.compareTo(str1);
        System.out.println(result);
     }
}
